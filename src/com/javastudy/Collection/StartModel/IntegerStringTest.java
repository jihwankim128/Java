package com.javastudy.Collection.StartModel;

public class IntegerStringTest {
    public static void main(String[] args) {
        String str1 = "123";
        String str2 = "123";
        System.out.println(str1+str2);

        System.out.println(Integer.parseInt(str1)
                + Integer.parseInt(str2));

        int n1 = 123;
        int n2 = 123;
        System.out.println(n1+n2);

        System.out.println(String.valueOf(n1) +
                String.valueOf(n2));

        String n3 = n1+""+n2;
        System.out.println(n3);
    }
}
