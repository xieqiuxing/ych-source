package com.xqx.org.service;

import com.xqx.ych.common.protocol.organization.School;
import com.xqx.ych.common.protocol.pageHelper.PageRes;
import com.xqx.ych.entity.OrgLevel;
import com.xqx.ych.entity.OrgNature;
import com.xqx.ych.entity.OrgType;
import com.xqx.ych.entity.Organization;

public interface IOrganizationService {
    public int open(Organization organization, String detail);

    public School findByUser(String legalPerson);

    public PageRes<OrgType> findAllOrgType(int pageNum, int pageSize);

    public PageRes<OrgNature> findAllNature(int pageNum, int pageSize);

    public PageRes<OrgLevel> findAllLevel(int pageNum, int pageSize);
}
