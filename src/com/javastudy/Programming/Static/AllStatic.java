package com.javastudy.Programming.Static;

public class AllStatic {
    private AllStatic() {

    }
    public static int hap(int a, int b) {
        return a + b;
    }
    public static int min(int a, int b) {
        return a < b ? a : b;
    }
    public static int max(int a, int b) {
        return a > b ? a : b;
    }
}
