package com.xqx.ych.manage.api;

import com.xqx.ych.common.protocol.organization.OrganizationInfo;
import com.xqx.ych.common.protocol.organization.OrganizationRes;
import com.xqx.ych.common.protocol.pageHelper.PageRes;

public interface OrganizationApi {
    /**
     * 运营管理后台学校管理查询所有学校
     *
     * @param page
     * @param pageSize
     * @param auditStatus
     * @return
     */
    public PageRes<OrganizationRes> findAll(Integer page, Integer pageSize, Integer auditStatus);

    /**
     * 运营管理后台学校管理查询单个学校详情
     *
     * @param id
     * @return
     */
    public OrganizationInfo getOrganizationInfo(Integer id);

    /**
     * 运营管理后台学校管理审核通过
     *
     * @param id
     * @param orgAuditStatus
     * @return
     */
    public int changeAudio(Integer id, Integer orgAuditStatus);

    /**
     * 运营管理后台学校管理根据省份、市、县、自己输入高级查询
     *
     * @param pageNum
     * @param pageSize
     * @param province
     * @param city
     * @param county
     * @param condition
     * @return
     */
    public PageRes<OrganizationInfo> findByExample(int pageNum, int pageSize, String province, String city, String county, String condition);
}
