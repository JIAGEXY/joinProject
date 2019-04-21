package com.lh.utils;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;

public class ShiroUtils {
    public static void logout() {
        SecurityUtils.getSubject().logout();
    }
    public static Session getSession(){
        return SecurityUtils.getSubject().getSession();
    }
    public static Object getAttribute(String str){
        return SecurityUtils.getSubject().getSession().getAttribute(str);
    }
<<<<<<< HEAD
=======
    public static void setAttribute(String k, Object v){SecurityUtils.getSubject().getSession().setAttribute(k,v);}
>>>>>>> 6e13e5717372feaa6e93f20c55561ca38f98c880
    public static Object getCurrentUser(){
        return SecurityUtils.getSubject().getPrincipal();
    }
}
