package com.xqx.small.org.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.xqx.small.org.service.IOrganizationService;
import com.xqx.ych.common.protocol.major.Majors;
import com.xqx.ych.common.protocol.organization.OrganizationDynamic;
import com.xqx.ych.common.protocol.pageHelper.PageRes;
import com.xqx.ych.common.protocol.school.IntroduceDetail;
import com.xqx.ych.common.protocol.school.PopSchool;
import com.xqx.ych.common.protocol.school.SchoolMajor;
import com.xqx.ych.common.protocol.school.SchoolType;
import com.xqx.ych.entity.SchoolInfo;
import com.xqx.ych.entity.SchoolIntroduce;
import com.xqx.ych.entity.UserEnroll;
import com.xqx.ych.small.api.IOrganizationApi;

import javax.annotation.Resource;

@Service
public class OrganizationApiImpl implements IOrganizationApi {
    @Resource
    private IOrganizationService iOrganizationService;

    @Override
    public PageRes<SchoolInfo> findByMajorId(int pageNum, int pageSize, Integer MajorId) {
        return iOrganizationService.findByMajorId(pageNum, pageSize, MajorId);
    }

    @Override
    public SchoolIntroduce findByIdAndMajor(Integer id, Integer majorId) {
        return iOrganizationService.findByIdAndMajor(id, majorId);
    }

    @Override
    public PageRes<PopSchool> findPopSchool(int pageNum, int pageSize, Integer isHot) {
        return iOrganizationService.findPopSchool(pageNum, pageSize, isHot);
    }

    @Override
    public PageRes<SchoolType> findByOrgLevel(int pageNum, int pageSize, Integer orgLevel) {
        return iOrganizationService.findByOrgLevel(pageNum, pageSize, orgLevel);
    }

    @Override
    public SchoolMajor<Majors> findByOrgId(Integer id) {
        return iOrganizationService.findByOrgId(id);
    }

    @Override
    public SchoolMajor<IntroduceDetail> findOrgIntroduce(Integer id) {
        return iOrganizationService.findOrgIntroduce(id);
    }

    @Override
    public SchoolMajor<OrganizationDynamic> findOrgDynamic(Integer id) {
        return iOrganizationService.findOrgDynamic(id);
    }

    @Override
    public UserEnroll findByOrgMajorIdAndUserId(Integer orgMajorId, Integer userId) {
        return iOrganizationService.findByOrgMajorIdAndUserId(orgMajorId, userId);
    }


}
