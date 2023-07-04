package com.javastudy.Basic.Logical;

public class LogicalOperTest {
    public static void main(String[] args) {
        int x = 1, y = 0;
        System.out.println(!(x>0)); // not true
        System.out.println(x > 0 && x < 3); // true && true
        System.out.println(x > 0 && y < 0); // true && false
        System.out.println(x < 0 || y >= 0); // false || true
        System.out.println(y < 0 && y < -5); // false && false

        int a = 3, b = 5;
        System.out.println((a>=3) && (b<6)); // true && true
        System.out.println((a!=3) && (a>2)); // false && true
        System.out.println((b!=5) || (a==1)); // false || false
    }
}
