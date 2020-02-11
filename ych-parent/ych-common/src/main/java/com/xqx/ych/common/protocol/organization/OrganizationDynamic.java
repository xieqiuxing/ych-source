package com.xqx.ych.common.protocol.organization;

import lombok.Data;

import java.io.Serializable;

@Data
public class OrganizationDynamic implements Serializable {
    private Integer id;
    private String title;
    private String content;
}
