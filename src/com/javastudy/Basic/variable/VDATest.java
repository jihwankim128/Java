package com.javastudy.Basic.variable;
public class VDATest {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        int c = b * 10;
        System.out.println(a + ", " + b + ", " + c);
        int sum = 1; System.out.println(sum);
        sum += 1; System.out.println(sum);
        sum += 1; System.out.println(sum);
        sum += 1; System.out.println(sum);
        sum += 1; System.out.println(sum);
        int x = 10;
        int y = 20;
        int temp = y;
        y = x;
        x = temp;
        System.out.println(x + ", " + y);
    }
}
