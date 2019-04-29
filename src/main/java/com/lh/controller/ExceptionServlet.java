package com.lh.controller;

import com.lh.exception.RZException;
import com.lh.utils.R;
import org.apache.shiro.authz.AuthorizationException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/*@RestControllerAdvice
public class ExceptionServlet {
    @ExceptionHandler(AuthorizationException.class)
    public R getRZException(AuthorizationException e){
        return R.error("您没有权限，请联系管理员");
    }

    @ExceptionHandler(RZException.class)
    public R getRZException(RZException e){
        return R.error(e.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public R getException(Exception e){
        return R.error(e.getMessage());
    }
}*/
