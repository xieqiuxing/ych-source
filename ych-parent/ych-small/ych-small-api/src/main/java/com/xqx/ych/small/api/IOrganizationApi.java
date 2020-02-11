package com.xqx.ych.small.api;

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

public interface IOrganizationApi {

    /**
     * 根据majorId查询学校的信息
     *
     * @param pageNum
     * @param pageSize
     * @param majorId
     * @return
     */
    public PageRes<SchoolInfo> findByMajorId(int pageNum, int pageSize, Integer majorId);

    /**
     * 查询学校详情信息
     *
     * @param id
     * @param majorId
     * @return
     */
    public SchoolIntroduce findByIdAndMajor(Integer id, Integer majorId);

    /**
     * 查询热门学校信息
     *
     * @param pageNum
     * @param pageSize
     * @param isHot
     * @return PageRes
     */
    public PageRes<PopSchool> findPopSchool(int pageNum, int pageSize, Integer isHot);

    /**
     * 查询附近学校信息，根据学校性质查询
     *
     * @param pageNum
     * @param pageSize
     * @param orgLevel
     * @return
     */
    public PageRes<SchoolType> findByOrgLevel(int pageNum, int pageSize, Integer orgLevel);

    /**
     * 查询学校的专业信息
     *
     * @param id
     * @return
     */
    public SchoolMajor<Majors> findByOrgId(Integer id);

    /**
     * 查询学校的概况
     *
     * @param id
     * @return
     */
    public SchoolMajor<IntroduceDetail> findOrgIntroduce(Integer id);

    /**
     * 附近学校详情，动态
     *
     * @param id
     * @return
     */
    public SchoolMajor<OrganizationDynamic> findOrgDynamic(Integer id);

    UserEnroll findByOrgMajorIdAndUserId(Integer orgMajorId, Integer userId);
}
