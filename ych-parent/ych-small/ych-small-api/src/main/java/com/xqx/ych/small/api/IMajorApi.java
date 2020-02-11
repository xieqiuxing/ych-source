package com.xqx.ych.small.api;

import com.xqx.ych.common.protocol.major.*;
import com.xqx.ych.common.protocol.pageHelper.PageRes;
import com.xqx.ych.entity.Major;
import com.xqx.ych.entity.MajorCategory;

public interface IMajorApi {
    /**
     * 查询专业类别
     *
     * @param pageNum
     * @param pageSize
     * @return
     */
    public PageRes<MajorCategory> findAllMajor(int pageNum, int pageSize);

    /**
     * 查找根据专业类别查专业列表
     *
     * @param pageNum
     * @param pageSize
     * @param majorCategoryId
     * @return
     */
    public PageRes<Major> findByCateId(int pageNum, int pageSize, Integer majorCategoryId);

    /**
     * 查询热门专业
     *
     * @param pageNum
     * @param pageSize
     * @param isHot
     * @return
     */
    public PageRes<MajorPop> findPopMajor(int pageNum, int pageSize, Integer isHot);

    /**
     * 查询专业信息
     *
     * @param queryOrgMajorReq
     * @return
     */
    QueryOrgMajorRes queryOrgMajorById(QueryOrgMajorReq queryOrgMajorReq) throws Exception;

    /**
     * 减库存
     *
     * @param reduceMajorNumberReq
     * @return
     */
    ChangeMajorNumberRes reduceOrgMajorNumber(ChangeMajorNumberReq reduceMajorNumberReq);
}
