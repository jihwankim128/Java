package com.javastudy.Programming.Modeling;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "지환";
        p.age = 24;
        p.phone = "010-7553-6092";
        p.print();
        p.play();
        p.eat();
        p.walk();
    }
}
