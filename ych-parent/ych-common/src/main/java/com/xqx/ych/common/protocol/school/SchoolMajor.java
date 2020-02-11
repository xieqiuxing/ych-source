package com.xqx.ych.common.protocol.school;

import lombok.Data;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

@Data
public class SchoolMajor<T> implements Serializable {
    private Integer id;
    private String name;
    private String coverImg;
    private String adress;
    private String admissionCounseling;
    private List<T> list = Collections.emptyList();
}
