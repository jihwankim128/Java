package com.javastudy.API.StartModel;

public class HelloWorldString {
    public static void main(String[] args) {
        //Heap Meomory
        String str1 = new String("HelloWorld");
        //Literal Pool Memory
        String str2 = "HelloWorld";

        System.out.println(str1);
        System.out.println(str2);
    }
}
