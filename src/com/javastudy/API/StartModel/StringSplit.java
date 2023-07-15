package com.javastudy.API.StartModel;

public class StringSplit {
    public static void main(String[] args) {
        String str = "Hello,Wolrd,Java";
        String[] strArray = str.split(",");
        for(String s : strArray) {
            System.out.println(s);
        }

        str = "Hello World Java";
        //정규 표현식
        // \s 스페이스, + 하나 이상
        // \s+ = 하나 이상의 공백 문자
        strArray = str.split("\\s+");
        for (String s : strArray) {
            System.out.println(s);
        }
    }
}
