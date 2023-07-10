package com.javastudy.Programming.Static;

public class NoneStaticTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        NoneStaticTest nst = new NoneStaticTest();
        System.out.println(nst.hap(a, b));
    }
    public int hap(int a, int b){
        return a+b;
    }
}
