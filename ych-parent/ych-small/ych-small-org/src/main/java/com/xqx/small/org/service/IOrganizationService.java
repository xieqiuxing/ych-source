package com.xqx.small.org.service;

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

public interface IOrganizationService {
    public PageRes<SchoolInfo> findByMajorId(int pageNum, int pageSize, Integer majorId);

    public SchoolIntroduce findByIdAndMajor(Integer id, Integer majorId);

    public PageRes<PopSchool> findPopSchool(int pageNum, int pageSize, Integer isHot);

    public PageRes<SchoolType> findByOrgLevel(int pageNum, int pageSize, Integer orgLevel);

    public SchoolMajor<Majors> findByOrgId(Integer id);

    public SchoolMajor<IntroduceDetail> findOrgIntroduce(Integer id);

    public SchoolMajor<OrganizationDynamic> findOrgDynamic(Integer id);

    public UserEnroll findByOrgMajorIdAndUserId(Integer orgMajorId, Integer userId);
}
