package com.xqx.ych.common.protocol.major;

import lombok.Data;

import java.io.Serializable;

/**
 * @Description: 用一句话描述
 * @Auther: 新梦想*陈超
 * @Date: 2019-12-14 21:38
 */
@Data
public class ChangeMajorNumberReq implements Serializable {
    private Integer majorId;//orgMajorId
    private Integer orgMajorNumber;
    private String enrollId;
}
