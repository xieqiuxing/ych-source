package com.xqx.ych.common.protocol.enroll;

import com.xqx.ych.common.protocol.BaseRes;
import lombok.Data;

import java.io.Serializable;

/**
 * @Description: 用一句话描述
 * @Auther: 新梦想*陈超
 * @Date: 2019-12-14 20:33
 */
@Data
public class ConfirmEnrollRes extends BaseRes implements Serializable {
    private String enrollId;

}
