package com.xqx.ych.common.protocol.organization;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class OrganizationInfo implements Serializable {
    private Integer id;
    private String name;
    private String coverImg;
    private Integer orgType;
    private String orgNature;
    private String orgLicenceImg;
    private String legalPerson;
    private String legalPersonIdcard;
    private String legalPersonPhone;
    private String contactName;
    private String contactMobile;
    private Integer orgLevel;
    private Integer orgAuditStatus;
    private Date createtime;
    private Date updatetime;
    private String adress;
    private Integer addressId;
}
