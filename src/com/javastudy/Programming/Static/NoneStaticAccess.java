package com.javastudy.Programming.Static;

public class NoneStaticAccess {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        NoneStaticUtil st = new NoneStaticUtil();
        System.out.println(st.hap(a, b));
    }
}
