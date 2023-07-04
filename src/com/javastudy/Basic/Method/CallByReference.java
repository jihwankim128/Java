package com.javastudy.Basic.Method;

public class CallByReference {
    public static int add(int[] a){
        int sum = 0;
        for(int i = 0; i<a.length; i++) {
            sum += a[i];
        }
        a[3] = 10;
        return sum;
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        System.out.println(add(a));
        System.out.println(a[3]);
    }
}
