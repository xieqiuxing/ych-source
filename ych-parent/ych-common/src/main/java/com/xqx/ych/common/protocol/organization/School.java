package com.xqx.ych.common.protocol.organization;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class School implements Serializable {
    private Integer id;
    private String name;
    private String coverImg;
    private Integer orgType;
    private String orgNature;
    private String orgLicenceImg;
    private String legalPerson;
    private String legalPersonIdcard;
    private String legalPersonPhone;
    private Integer orgLevel;
    private Integer orgAuditStatus;
    private String adress;
}
