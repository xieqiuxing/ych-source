package com.xqx.ych.common.protocol.user;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class UserRes implements Serializable {
    private Integer userId;
    private String userName;
    private String userEmail;
    private String nativePlace;
    private String userSex;
    private String credits;
    private String discription;
}
