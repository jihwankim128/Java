package com.javastudy.API.StartModel;

public class StringManipulation {
    public static void main(String[] args) {
        //str은 Literal Memory에 HelloWorld를 가르킴
        String str = "HelloWorld"; // 인스턴스 변수

        System.out.println(str.charAt(1));
        System.out.println(str.replaceAll("o", "X"));
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.substring(5));
        System.out.println(str.substring(5,8));
        System.out.println(str.indexOf("W"));
        System.out.println(str.indexOf("Wr"));
        for(int i = 0; i<str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}
