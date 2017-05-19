package com.seckill.exception;

/**
 * 重复秒杀异常(运行时异常)
 * Created by lsy on 2017/5/17.
 */
public class RepeatKillException extends SeckillException{

    public RepeatKillException(String message) {
        super(message);
    }

    public RepeatKillException(String message, Throwable cause) {
        super(message, cause);
    }
}
