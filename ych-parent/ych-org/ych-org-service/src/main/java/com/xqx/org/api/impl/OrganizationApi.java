package com.xqx.org.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.xqx.org.api.IOrganizationApi;
import com.xqx.org.service.IOrganizationService;
import com.xqx.ych.common.protocol.organization.School;
import com.xqx.ych.common.protocol.pageHelper.PageRes;
import com.xqx.ych.entity.OrgLevel;
import com.xqx.ych.entity.OrgNature;
import com.xqx.ych.entity.OrgType;
import com.xqx.ych.entity.Organization;

import javax.annotation.Resource;

@Service
public class OrganizationApi implements IOrganizationApi {
    @Resource
    private IOrganizationService iOrganizationService;

    @Override
    public int open(Organization organization, String detail) {

        return iOrganizationService.open(organization, detail);
    }

    @Override
    public School findByUser(String legalPerson) {
        return iOrganizationService.findByUser(legalPerson);
    }

    @Override
    public PageRes<OrgType> findAllOrgType(int pageNum, int pageSize) {
        return iOrganizationService.findAllOrgType(pageNum, pageSize);
    }

    @Override
    public PageRes<OrgNature> findAllNature(int pageNum, int pageSize) {
        return iOrganizationService.findAllNature(pageNum, pageSize);
    }

    @Override
    public PageRes<OrgLevel> findAllLevel(int pageNum, int pageSize) {
        return iOrganizationService.findAllLevel(pageNum, pageSize);
    }
}
