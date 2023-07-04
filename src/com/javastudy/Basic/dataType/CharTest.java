package com.javastudy.Basic.dataType;

public class CharTest {
    public static void main(String[] args) {
        char a = 97;
        char A = 65;
        System.out.println(A);
        System.out.println(a);
        char ga = '가';
        char c = '\uAC00';
        int intga = '가';
        System.out.println(c);
        System.out.println(ga);
        System.out.println(intga);
        char Aa = 'A';
        System.out.println("A->a = " + (Aa+32) + ", casting -> " + (char)(Aa+32));
        System.out.println("'1'+'2' = " + (('1'-'0')+('2'-'0')));
    }
}
