package com.xqx.ych.common.protocol.major;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class Majors implements Serializable {
    private Integer id;
    private String majorName;
    private BigDecimal tuition;
}
