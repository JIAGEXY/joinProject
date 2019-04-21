package com.lh.utils;


public class StringUtil {
    public static boolean isEmpty(String s) {
        if (s == null)
            return true;
        if (s.trim().length() == 0)
            return true;
        return false;
    }
    public static boolean isNotEmpty(String s) {
        return !isEmpty(s);
    }
}
