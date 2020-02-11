package com.xqx.ych.common.protocol.major;

import lombok.Data;

import java.io.Serializable;

@Data
public class MajorPop implements Serializable {
    private Integer id;
    private String majorName;
}
