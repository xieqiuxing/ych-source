package com.xqx.ych.common.protocol.school;

import lombok.Data;

import java.io.Serializable;

@Data
public class SchoolType implements Serializable {
    private Integer id;
    private String name;
    private String coverImg;
    private String adress;
    private AddressLocation location;
}
