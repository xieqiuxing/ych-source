package com.xqx.ych.common.protocol.school;

import lombok.Data;

import java.io.Serializable;

@Data
public class AddressLocation implements Serializable {
    private String latitude;
    private String longitude;
}
