package com.xqx.ych.common.rocketmq.exception;

public class TradeMQException extends Exception {
    public TradeMQException(String message) {
        super(message);
    }

    public TradeMQException() {
        super();
    }

    public TradeMQException(Throwable cause) {
        super(cause);
    }

    public TradeMQException(String message, Throwable cause) {
        super(message, cause);
    }

}
