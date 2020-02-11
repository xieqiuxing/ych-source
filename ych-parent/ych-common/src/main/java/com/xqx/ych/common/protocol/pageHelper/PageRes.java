package com.xqx.ych.common.protocol.pageHelper;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@Data
public class PageRes<T> implements Serializable {
    private Integer pageNum;
    private Integer pageSize;
    private Integer startRow;
    private Integer endRow;
    private Integer total;
    private Integer pages;
    private Boolean count;
    private List<T> list = Collections.emptyList();
}

