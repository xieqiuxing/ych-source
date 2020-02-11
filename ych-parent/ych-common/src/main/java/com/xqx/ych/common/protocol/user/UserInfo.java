package com.xqx.ych.common.protocol.user;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

@Data
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class UserInfo {
    private String userName;
    private String ycyServiceStatus;
    private String zhaoshengServiceStatus;
    private String recruitServiceStatus;

}
