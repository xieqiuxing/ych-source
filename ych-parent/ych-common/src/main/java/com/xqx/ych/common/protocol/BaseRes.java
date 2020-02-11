package com.xqx.ych.common.protocol;

import lombok.Data;

import java.io.Serializable;

@Data
public class BaseRes implements Serializable {
    private String retCode;
    private String retInfo;

}

