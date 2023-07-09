package com.javastudy.Programming.Static;

public class StaticTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(StaticTest.hap(a, b));
    }
    public static int hap(int a, int b) {
        return a + b;
    }
}
