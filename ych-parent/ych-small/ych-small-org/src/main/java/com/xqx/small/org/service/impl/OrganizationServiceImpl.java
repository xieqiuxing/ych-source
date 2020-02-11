package com.xqx.small.org.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.xqx.small.org.service.IOrganizationService;
import com.xqx.ych.common.protocol.major.Majors;
import com.xqx.ych.common.protocol.organization.OrganizationDynamic;
import com.xqx.ych.common.protocol.pageHelper.PageRes;
import com.xqx.ych.common.protocol.school.*;
import com.xqx.ych.entity.*;
import com.xqx.ych.mapper.*;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class OrganizationServiceImpl implements IOrganizationService {
    @Resource
    private OrgMajorMapper orgMajorMapper;
    @Resource
    private OrganizationMapper organizationMapper;
    @Resource
    private OrgAddressMapper orgAddressMapper;
    @Resource
    private MajorMapper majorMapper;
    @Resource
    private OrgIntroduceMapper orgIntroduceMapper;
    @Resource
    private OrgDynamicMapper orgDynamicMapper;

    @Override
    public PageRes<SchoolInfo> findByMajorId(int pageNum, int pageSize, Integer majorId) {
        PageHelper.startPage(pageNum, pageSize);
        List<SchoolInfo> list = orgMajorMapper.selectByMajorId(majorId);
        Page pages = (Page) list;
        PageRes<SchoolInfo> pageInfo = new PageRes<SchoolInfo>();
        BeanUtils.copyProperties(pages, pageInfo);
        pageInfo.setTotal((int) ((Page<SchoolInfo>) list).getTotal());
        pageInfo.setList(list);
        return pageInfo;
    }

    @Override
    public SchoolIntroduce findByIdAndMajor(Integer id, Integer majorId) {
        SchoolIntroduce schoolIntroduce = orgMajorMapper.findByIdAndMajor(id, majorId);
        return schoolIntroduce;
    }

    @Override
    public PageRes<PopSchool> findPopSchool(int pageNum, int pageSize, Integer isHot) {
        PageHelper.startPage(pageNum, pageSize);
        OrganizationExample example = new OrganizationExample();
        example.createCriteria().andIsHotEqualTo(isHot);
        List<Organization> lists = organizationMapper.selectByExample(example);
        Page pageOrg = (Page) lists;
        PageRes<PopSchool> pageInfo = new PageRes<PopSchool>();
        BeanUtils.copyProperties(pageOrg, pageInfo);
        List<PopSchool> orgList = new ArrayList<PopSchool>();
        for (Organization org : lists) {
            PopSchool popSchool = new PopSchool();
            BeanUtils.copyProperties(org, popSchool);
            orgList.add(popSchool);
        }
        pageInfo.setTotal((int) ((Page<Organization>) lists).getTotal());
        pageInfo.setList(orgList);
        orgList = null;
        return pageInfo;
    }

    @Override
    public PageRes<SchoolType> findByOrgLevel(int pageNum, int pageSize, Integer orgLevel) {
        PageHelper.startPage(pageNum, pageSize);
        OrganizationExample example = new OrganizationExample();
        example.createCriteria().andOrgLevelEqualTo(orgLevel);
        List<Organization> orgs = organizationMapper.selectByExample(example);
        System.out.println("orgs===" + orgs);
        Page pageOrgs = (Page) orgs;
        PageRes<SchoolType> pageInfo = new PageRes<SchoolType>();
        BeanUtils.copyProperties(pageOrgs, pageInfo);
        List<SchoolType> pages = new ArrayList<SchoolType>();
        for (Organization org : orgs) {
            OrgAddress orgAddress = orgAddressMapper.findByOrgId(org.getId());
            AddressLocation addressLocation = new AddressLocation();
            BeanUtils.copyProperties(orgAddress, addressLocation);
            SchoolType schoolType = new SchoolType();
            BeanUtils.copyProperties(org, schoolType);
            schoolType.setLocation(addressLocation);
            pages.add(schoolType);
        }
        pageInfo.setTotal((int) ((Page<Organization>) orgs).getTotal());
        pageInfo.setList(pages);
        System.out.println("pageInfo====" + pageInfo);
        pages = null;
        return pageInfo;
    }

    public SchoolMajor findOrg(Integer id) {
        Organization organization = organizationMapper.selectByPrimaryKey(id);
        SchoolMajor schoolMajor = new SchoolMajor();
        BeanUtils.copyProperties(organization, schoolMajor);
        return schoolMajor;
    }

    @Override
    public SchoolMajor<Majors> findByOrgId(Integer id) {
        SchoolMajor schoolMajor = findOrg(id);
        List<OrgMajor> orgMajors = orgMajorMapper.findByOrgId(id);
        List<Majors> lists = new ArrayList<Majors>();
        for (OrgMajor orgMajor : orgMajors) {
            Majors majors = new Majors();
            BeanUtils.copyProperties(orgMajor, majors);
            System.out.println("orgMajor====" + orgMajor);
            System.out.println("majorId====" + orgMajor.getOrgId());
            Major major = majorMapper.selectByPrimaryKey(orgMajor.getMajorId());
            BeanUtils.copyProperties(major, majors);
            lists.add(majors);
        }
        schoolMajor.setList(lists);
        return schoolMajor;
    }

    @Override
    public SchoolMajor<IntroduceDetail> findOrgIntroduce(Integer id) {
        SchoolMajor schoolMajor = findOrg(id);
        OrgIntroduceExample example = new OrgIntroduceExample();
        example.createCriteria().andOrgIdEqualTo(id);
        OrgIntroduce orgIntroduce = orgIntroduceMapper.selectByExample(example).get(0);
        System.out.println("orgIntroduce===" + orgIntroduce);
        IntroduceDetail introduceDetail = new IntroduceDetail();
        BeanUtils.copyProperties(orgIntroduce, introduceDetail);
        System.out.println("introduceDetail===" + introduceDetail);
        List<IntroduceDetail> list = new ArrayList<IntroduceDetail>();
        list.add(introduceDetail);
        schoolMajor.setList(list);
        list = null;
        return schoolMajor;
    }

    @Override
    public SchoolMajor<OrganizationDynamic> findOrgDynamic(Integer id) {
        SchoolMajor schoolMajor = findOrg(id);
        OrgDynamicExample example = new OrgDynamicExample();
        example.createCriteria().andOrgIdEqualTo(id);
        List<OrgDynamic> orgs = orgDynamicMapper.selectByExample(example);
        System.out.println("orgs===" + orgs);
        List<OrganizationDynamic> lists = new ArrayList<OrganizationDynamic>();
        for (OrgDynamic orgDynamic : orgs) {
            OrganizationDynamic od = new OrganizationDynamic();
            BeanUtils.copyProperties(orgDynamic, od);
            lists.add(od);
        }
        System.out.println("lists===" + lists);
        schoolMajor.setList(lists);
        System.out.println("schoolMajor===" + schoolMajor);
        return schoolMajor;
    }

    @Override
    public UserEnroll findByOrgMajorIdAndUserId(Integer orgMajorId, Integer userId) {
        UserEnroll userEnroll = orgMajorMapper.findByOrgMajorId(orgMajorId);
        System.out.println("userEnroll1====" + userEnroll);
        userEnroll.setCouponCount(orgMajorMapper.findCouponByUserId(userId).getCouponCount());
        System.out.println("userEnroll2====" + userEnroll);
        userEnroll.setUserName(orgMajorMapper.findUserNameById(userId).getUserName());
        System.out.println("userEnroll3====" + userEnroll);
        return userEnroll;
    }
}
