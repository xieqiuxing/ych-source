package com.xqx.ych.common.protocol.school;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class SchoolInfomation implements Serializable {
    private Integer id;
    private String schoolName;
    private String coverImg;
    private Double tuition;
}