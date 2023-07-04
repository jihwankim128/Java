package com.javastudy.Basic.Logical;

public class ForLoopTest {
    public static void main(String[] args) {
        for(int i = 0; i<26; i++) {
            char ch = (char)('A'+i);
            System.out.print("문자 = " + ch);
            System.out.println(", ASCII = " + (int)ch);
        }
    }
}
