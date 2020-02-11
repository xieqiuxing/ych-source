package com.xqx.ych.common.protocol.major;

import com.xqx.ych.common.protocol.BaseRes;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Description: 用一句话描述
 * @Auther: 新梦想*陈超
 * @Date: 2019-12-14 20:48
 */
@Data
public class QueryOrgMajorRes extends BaseRes implements Serializable {
    private Integer id;//orgMajorId

    private String majorName;

    private Integer enrollmentQuota;

    private BigDecimal tuition;

}
