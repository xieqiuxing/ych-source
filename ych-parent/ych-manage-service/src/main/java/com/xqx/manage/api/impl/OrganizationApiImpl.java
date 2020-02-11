package com.xqx.manage.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.xqx.manage.service.IOrganizationService;
import com.xqx.ych.common.protocol.organization.OrganizationInfo;
import com.xqx.ych.common.protocol.organization.OrganizationRes;
import com.xqx.ych.common.protocol.pageHelper.PageRes;
import com.xqx.ych.manage.api.OrganizationApi;

import javax.annotation.Resource;

;

@Service
public class OrganizationApiImpl implements OrganizationApi {
    @Resource
    private IOrganizationService iOrganizationService;

    @Override
    public PageRes<OrganizationRes> findAll(Integer pageNum, Integer pageSize, Integer auditStatus) {
        return iOrganizationService.findAll(pageNum, pageSize, auditStatus);
    }

    @Override
    public OrganizationInfo getOrganizationInfo(Integer id) {
        return iOrganizationService.getOrganizationInfo(id);
    }

    @Override
    public int changeAudio(Integer id, Integer orgAuditStatus) {
        return iOrganizationService.changeAudio(id, orgAuditStatus);
    }

    @Override
    public PageRes<OrganizationInfo> findByExample(int pageNum, int pageSize, String province, String city, String county, String condition) {
        return iOrganizationService.findByExample(pageNum, pageSize, province, city, county, condition);
    }
}
