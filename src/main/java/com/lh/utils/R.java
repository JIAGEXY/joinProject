package com.lh.utils;

import java.util.HashMap;

public class R extends HashMap<String,Object> {
    private int code;
    private String msg;


    public R() { }
    public R(int code){ this.put("code",code); }
    public R(int code, String msg){
        super.put("code",code);
        super.put("msg",msg);
    }
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public static R ok(){
        return new R(200,"SUCCESS");
    }
    public static R ok(String msg){
        return new R(200,msg);
    }
    public static R error(){
        return new R(1);
    }
    public static R error(String msg){
        return new R(1,msg);
    }
    public R put(String str, Object obj){
        super.put(str,obj);
        return this;
    }
}