package com.javastudy.Basic.Method;

public class APIOverLoading {
    public static void main(String[] args) {
        System.out.println(10);
        System.out.println(10.5);
        System.out.println('A');
        System.out.println("APPLE");
        //println 또한 Overloading 되어 있음.
        System.out.println(minValue(3, 5));
        System.out.println(maxValue(3, 5));
    }

    public static int maxValue(int a, int b){
        return (a > b) ? a : b;
    }
    public static int minValue(int a, int b){
        return (a < b) ? a : b;
    }

}
