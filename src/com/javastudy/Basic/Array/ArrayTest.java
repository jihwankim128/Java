package com.javastudy.Basic.Array;

public class ArrayTest {
    public static void main(String[] args) {
        int[] b = new int[5];
        for(int i = 0; i<5; i++) {
            b[i] = 10;
            System.out.println("b["+i+"] = " + b[i]);
        }
        int[] a = {10, 20, 30, 40, 50};
        for(int i = 0; i<a.length; i++) {
            System.out.println("a["+i+"] = " + a[i]);
        }
        int[] a_prime;
        a_prime = new int[]{10, 20, 30, 40, 50};

        for(int i = 0; i<a_prime.length; i++) {
            System.out.println("a_prime["+i+"] = " + a_prime[i]);
        }
    }
}
