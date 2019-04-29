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
    public static void setAttribute(String k,Object v){
        SecurityUtils.getSubject().getSession().setAttribute(k,v);
    }

    public static Object getCurrentUser(){
        return SecurityUtils.getSubject().getPrincipal();
    }
}
