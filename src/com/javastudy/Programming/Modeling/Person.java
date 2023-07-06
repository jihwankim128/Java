package com.javastudy.Programming.Modeling;

public class Person {
    public String name;
    public int age;
    public String phone;
    public static void play() {
        System.out.println("운동");
    }
    public static void eat() {
        System.out.println("식사");
    }
    public static void walk() {
        System.out.println("걷기");
    }
    public void print() {
        System.out.println(this.name + "\t"
        + this.age + "세\t" + this.phone);
    }
}
