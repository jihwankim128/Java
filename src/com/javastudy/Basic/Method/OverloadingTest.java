package com.javastudy.Basic.Method;

public class OverloadingTest {
    public static int add(int a, int b) {
        return a+b;
    }
    public static float add(float a, float b) {
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(add(1, 5));
        System.out.println(add(1.4f, 2.5f));
    }
}
