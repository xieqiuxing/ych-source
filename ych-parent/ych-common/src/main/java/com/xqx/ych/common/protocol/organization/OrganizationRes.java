package com.xqx.ych.common.protocol.organization;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class OrganizationRes implements Serializable {
    private Integer id;
    private String name;
    private String coverImg;
}
