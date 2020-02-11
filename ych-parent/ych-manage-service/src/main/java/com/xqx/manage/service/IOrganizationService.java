package com.xqx.manage.service;

import com.xqx.ych.common.protocol.organization.OrganizationInfo;
import com.xqx.ych.common.protocol.organization.OrganizationRes;
import com.xqx.ych.common.protocol.pageHelper.PageRes;

public interface IOrganizationService {
    public PageRes<OrganizationRes> findAll(Integer page, Integer pageSize, Integer auditStatus);

    public OrganizationInfo getOrganizationInfo(Integer id);

    public int changeAudio(Integer id, Integer orgAuditStatus);

    public PageRes<OrganizationInfo> findByExample(int pageNum, int pageSize, String province, String city, String county, String condition);
}
