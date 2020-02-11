package com.xqx.small.major.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.xqx.small.major.service.IMajorService;
import com.xqx.ych.common.protocol.major.*;
import com.xqx.ych.common.protocol.pageHelper.PageRes;
import com.xqx.ych.entity.Major;
import com.xqx.ych.entity.MajorCategory;
import com.xqx.ych.small.api.IMajorApi;

import javax.annotation.Resource;

@Service
public class MajorApiImpl implements IMajorApi {
    @Resource
    private IMajorService iMajorService;

    @Override
    public PageRes<MajorCategory> findAllMajor(int pageNum, int pageSize) {
        return iMajorService.findAllMajor(pageNum, pageSize);
    }

    @Override
    public PageRes<Major> findByCateId(int pageNum, int pageSize, Integer majorCategoryId) {
        return iMajorService.findByCateId(pageNum, pageSize, majorCategoryId);
    }

    @Override
    public PageRes<MajorPop> findPopMajor(int pageNum, int pageSize, Integer isHot) {
        return iMajorService.findPopMajor(pageNum, pageSize, isHot);
    }

    @Override
    public QueryOrgMajorRes queryOrgMajorById(QueryOrgMajorReq queryOrgMajorReq) throws Exception {
        return iMajorService.queryOrgMajorById(queryOrgMajorReq);
    }

    @Override
    public ChangeMajorNumberRes reduceOrgMajorNumber(ChangeMajorNumberReq reduceMajorNumberReq) {
        return iMajorService.reduceOrgMajorNumber(reduceMajorNumberReq);
    }
}
