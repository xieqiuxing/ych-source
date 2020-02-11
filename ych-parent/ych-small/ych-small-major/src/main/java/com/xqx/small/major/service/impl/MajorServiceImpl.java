package com.xqx.small.major.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.xqx.small.major.service.IMajorService;
import com.xqx.ych.common.constans.TradeEnums;
import com.xqx.ych.common.exception.YchException;
import com.xqx.ych.common.protocol.major.*;
import com.xqx.ych.common.protocol.pageHelper.PageRes;
import com.xqx.ych.entity.*;
import com.xqx.ych.mapper.MajorCategoryMapper;
import com.xqx.ych.mapper.MajorMapper;
import com.xqx.ych.mapper.MajorNumberLogMapper;
import com.xqx.ych.mapper.OrgMajorMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class MajorServiceImpl implements IMajorService {
    @Resource
    private MajorCategoryMapper majorCategoryMapper;
    @Resource
    private MajorMapper majorMapper;
    @Resource
    private OrgMajorMapper orgMajorMapper;
    @Resource
    private MajorNumberLogMapper majorNumberLogMapper;

    @Override
    public PageRes<MajorCategory> findAllMajor(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<MajorCategory> majors = majorCategoryMapper.selectByExample(null);
        Page pages = (Page) majors;
        PageRes<MajorCategory> pageInfo = new PageRes<MajorCategory>();
        BeanUtils.copyProperties(pages, pageInfo);
        pageInfo.setTotal((int) ((Page<MajorCategory>) majors).getTotal());
        pageInfo.setList(majors);
        return pageInfo;
    }

    @Override
    public PageRes<Major> findByCateId(int pageNum, int pageSize, Integer majorCategoryId) {
        PageHelper.startPage(pageNum, pageSize);
        MajorExample example = new MajorExample();
        example.createCriteria().andMajorCategoryIdEqualTo(majorCategoryId);
        List<Major> majors = majorMapper.selectByExample(example);
        Page pages = (Page) majors;
        PageRes<Major> pageInfo = new PageRes<Major>();
        BeanUtils.copyProperties(pages, pageInfo);
        pageInfo.setTotal((int) ((Page<Major>) majors).getTotal());
        pageInfo.setList(majors);
        System.out.println("pageInfo===" + pageInfo);
        return pageInfo;
    }

    @Override
    // @Cacheable(value="aboutUser")
    public PageRes<MajorPop> findPopMajor(int pageNum, int pageSize, Integer isHot) {
        PageHelper.startPage(pageNum, pageSize);
        List<Major> lists = orgMajorMapper.findByPop(isHot);
        System.out.println("lists++++" + lists);
        Page pageMajor = (Page) lists;
        PageRes<MajorPop> pageInfo = new PageRes<MajorPop>();
        BeanUtils.copyProperties(pageMajor, pageInfo);
        List<MajorPop> popList = new ArrayList<MajorPop>();
        for (Major major : lists) {
            MajorPop majorPop = new MajorPop();
            BeanUtils.copyProperties(major, majorPop);
            popList.add(majorPop);
        }
        pageInfo.setTotal((int) ((Page<Major>) lists).getTotal());
        pageInfo.setList(popList);
        popList = null;
        System.out.println(pageInfo.getList());
        return pageInfo;
    }

    @Override
    public QueryOrgMajorRes queryOrgMajorById(QueryOrgMajorReq queryOrgMajorReq) throws Exception {
        QueryOrgMajorRes queryOrgMajorRes = new QueryOrgMajorRes();
        queryOrgMajorRes.setRetCode(TradeEnums.RetEnum.SUCCESS.getCode());
        queryOrgMajorRes.setRetInfo(TradeEnums.RetEnum.SUCCESS.getDesc());
        try {
            if (queryOrgMajorReq == null || queryOrgMajorReq.getId() == 0) {
                throw new Exception("请求参数错误，商品id错误");
            }
            OrgMajor orgMajor = orgMajorMapper.selectByOrgMajorId(queryOrgMajorReq.getId()).get(0);
            if (orgMajor == null) {
                throw new Exception("查询的结果为空");
            } else {
                BeanUtils.copyProperties(orgMajor, queryOrgMajorRes);
            }
        } catch (Exception e) {
            queryOrgMajorRes.setRetCode(TradeEnums.RetEnum.FAIL.getCode());
            queryOrgMajorRes.setRetCode(TradeEnums.RetEnum.FAIL.getDesc());
        }
        return queryOrgMajorRes;
    }

    @Override
    public ChangeMajorNumberRes reduceOrgMajorNumber(ChangeMajorNumberReq reduceMajorNumberReq) {
        ChangeMajorNumberRes changeMajorNumberRes = new ChangeMajorNumberRes();
        changeMajorNumberRes.setRetCode(TradeEnums.RetEnum.SUCCESS.getCode());
        changeMajorNumberRes.setRetInfo(TradeEnums.RetEnum.SUCCESS.getDesc());
        try {
            //参数校验
            if (reduceMajorNumberReq == null || reduceMajorNumberReq.getMajorId() <= 0) {
                throw new YchException("参数错误，报名id格式不正确");
            }
            if (StringUtils.isBlank(reduceMajorNumberReq.getEnrollId())) {
                throw new YchException("报名id不能为空");
            }
            if (reduceMajorNumberReq.getOrgMajorNumber() <= 0) {
                throw new YchException("报名数量必须大于0");
            }
            //改变majorNumberLog日志
            MajorNumberLog majorNumberLog = new MajorNumberLog();
            majorNumberLog.setMajorId(reduceMajorNumberReq.getMajorId());
            majorNumberLog.setEnrollId(reduceMajorNumberReq.getEnrollId());
            System.out.println("enrollID===" + reduceMajorNumberReq.getEnrollId());
            majorNumberLog.setMajorNumber(reduceMajorNumberReq.getOrgMajorNumber());
            majorNumberLog.setLogTime(new Date());
            majorNumberLog.setNumberLogType(TradeEnums.MajorNumberTypeLogEnum.ENROLL.getCode());
            //减少名额，先查询在majorNumberLog日志表里面是否存在这个报名信息，如果有，就不减少名额，并抛出异常
            MajorNumberLogExample example = new MajorNumberLogExample();
            example.createCriteria().andEnrollIdEqualTo(reduceMajorNumberReq.getEnrollId())
                    .andMajorIdEqualTo(reduceMajorNumberReq.getMajorId())
                    .andMajorNumberEqualTo(reduceMajorNumberReq.getOrgMajorNumber())
                    .andNumberLogTypeEqualTo(majorNumberLog.getNumberLogType());
            int count = majorNumberLogMapper.countByExample(example);
            if (count >= 1) {
                throw new Exception("已经减名额，不能重复减名额");
            }
            //先减名额，成功则进行添加日志文件操作，否则就抛出异常
            int result = orgMajorMapper.reduceQuot(reduceMajorNumberReq.getMajorId(), reduceMajorNumberReq.getOrgMajorNumber());
            if (result <= 0) {
                throw new Exception("名额不足");
            }
            //添加订单改变日志
            majorNumberLogMapper.insertSelective(majorNumberLog);
        } catch (Exception e) {
            changeMajorNumberRes.setRetCode(TradeEnums.RetEnum.FAIL.getCode());
            changeMajorNumberRes.setRetInfo(TradeEnums.RetEnum.FAIL.getDesc());
        }
        return changeMajorNumberRes;
    }

    public int addOrgMajorNumber(ChangeMajorNumberReq changeMajorNumberReq) {
        try {
            //参数校验
            if (changeMajorNumberReq == null || changeMajorNumberReq.getMajorId() <= 0) {
                throw new YchException("参数错误，报名id格式不正确");
            }
            if (StringUtils.isBlank(changeMajorNumberReq.getEnrollId())) {
                throw new YchException("报名id不能为空");
            }
            if (changeMajorNumberReq.getOrgMajorNumber() <= 0) {
                throw new YchException("报名数量必须大于0");
            }
            //改变majorNumberLog日志
            MajorNumberLog majorNumberLog = new MajorNumberLog();
            majorNumberLog.setMajorId(changeMajorNumberReq.getMajorId());
            majorNumberLog.setEnrollId(changeMajorNumberReq.getEnrollId());
            majorNumberLog.setMajorNumber(changeMajorNumberReq.getOrgMajorNumber());
            majorNumberLog.setLogTime(new Date());
            majorNumberLog.setNumberLogType(TradeEnums.MajorNumberTypeLogEnum.ENROLL.getCode());
            //改变之前先查询log日志文件是否有减名额的数据，如果有，就回退名额，如果没有，就不回退
            MajorNumberLogExample example = new MajorNumberLogExample();
            example.createCriteria().andMajorIdEqualTo(changeMajorNumberReq.getMajorId())
                    .andEnrollIdEqualTo(changeMajorNumberReq.getEnrollId())
                    .andNumberLogTypeEqualTo(majorNumberLog.getNumberLogType())
                    .andMajorNumberEqualTo(changeMajorNumberReq.getOrgMajorNumber());
            int count = majorNumberLogMapper.countByExample(example);
            if (count <= 0) {
                return -1;
            }
            //有名额，回退名额
            int result = orgMajorMapper.addQuot(changeMajorNumberReq.getMajorId(), changeMajorNumberReq.getOrgMajorNumber());
            if (result <= 0) {
                throw new YchException("回退名额失败");
            }
            //回退名额成功，记录日志
            majorNumberLog.setNumberLogType(TradeEnums.MajorNumberTypeLogEnum.RETURN.getCode());
            int i = majorNumberLogMapper.insertSelective(majorNumberLog);
            return i;
        } catch (Exception e) {
            e.getStackTrace();
        }
        return -1;
    }
}
