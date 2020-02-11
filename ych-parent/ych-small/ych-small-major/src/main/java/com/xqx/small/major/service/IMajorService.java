package com.xqx.small.major.service;

import com.xqx.ych.common.protocol.major.*;
import com.xqx.ych.common.protocol.pageHelper.PageRes;
import com.xqx.ych.entity.Major;
import com.xqx.ych.entity.MajorCategory;

public interface IMajorService {
    public PageRes<MajorCategory> findAllMajor(int pageNum, int pageSize);

    public PageRes<Major> findByCateId(int pageNum, int pageSize, Integer majorCategoryId);

    public PageRes<MajorPop> findPopMajor(int pageNum, int pageSize, Integer isHot);

    QueryOrgMajorRes queryOrgMajorById(QueryOrgMajorReq queryOrgMajorReq) throws Exception;

    ChangeMajorNumberRes reduceOrgMajorNumber(ChangeMajorNumberReq reduceMajorNumberReq);
}
