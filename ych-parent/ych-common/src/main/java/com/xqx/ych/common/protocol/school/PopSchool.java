package com.xqx.ych.common.protocol.school;

import lombok.Data;

import java.io.Serializable;

@Data
public class PopSchool implements Serializable {
    private Integer id;
    private String name;
    private String coverImg;
}
