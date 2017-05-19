package com.seckill.exception;

/**
 * 秒杀关闭异常
 * Created by lsy on 2017/5/17.
 */
public class SeckillCloseException extends SeckillException {

    public SeckillCloseException(String message) {
        super(message);
    }

    public SeckillCloseException(String message, Throwable cause) {
        super(message, cause);
    }

}
