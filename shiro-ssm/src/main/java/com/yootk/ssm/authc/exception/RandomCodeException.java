package com.yootk.ssm.authc.exception;

import org.apache.shiro.authc.AuthenticationException;

public class RandomCodeException extends AuthenticationException {
    public RandomCodeException() {}
    public RandomCodeException(String msg) {
        super(msg) ;
    }
}
