package com.xqx.org.api;

import com.xqx.ych.common.protocol.organization.School;
import com.xqx.ych.common.protocol.pageHelper.PageRes;
import com.xqx.ych.entity.OrgLevel;
import com.xqx.ych.entity.OrgNature;
import com.xqx.ych.entity.OrgType;
import com.xqx.ych.entity.Organization;

public interface IOrganizationApi {
    /**
     * 申请开通学校通道
     *
     * @param organization
     * @param detail
     * @return int
     */
    public int open(Organization organization, String detail);

    /**
     * 获取用户开通的学校信息
     *
     * @param legalPerson
     * @return
     */
    public School findByUser(String legalPerson);

    /**
     * 获取学校类型
     *
     * @param pageNum
     * @param pageSize
     * @return
     */
    public PageRes<OrgType> findAllOrgType(int pageNum, int pageSize);

    /**
     * 获取学校性质
     *
     * @param pageNum
     * @param pageSize
     * @return
     */
    public PageRes<OrgNature> findAllNature(int pageNum, int pageSize);

    /**
     * 获取机构等级
     *
     * @param pageNum
     * @param pageSize
     * @return
     */
    public PageRes<OrgLevel> findAllLevel(int pageNum, int pageSize);
}
