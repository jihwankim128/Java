package com.javastudy.Basic.Logical;

public class ArithmeticOperTest {
    public static void main(String[] args) {
        int digit = 3625;
        for(int i = 1;digit>0; i*=10, digit/=10) {
            System.out.println(i+"의 자리수 : " + (digit%10));
        }
    }
}
