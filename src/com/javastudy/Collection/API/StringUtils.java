package com.javastudy.Collection.API;

public class StringUtils {
    public String reverse(String s) {
        //문자열 변경을 할 때 StringBuffer
        return new StringBuffer(s).reverse().toString();
    }
}
