package com.xqx.ych.common.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class YchExceptionHandler {
    @ResponseBody
    @ExceptionHandler
    public String handlerYchException(Exception ex) {
        ex.printStackTrace();
        return "错误--->" + ex;
    }
}
