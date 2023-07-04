package com.javastudy.Basic.UDDT;

public class MovieTest {
    public static void main(String[] args) {
        Movie m = new Movie();
        m.title = "아바타";
        m.open = "2022.12.14";
        m.mainActor = "제이크 설리";
        m.genre = "액션";
        m.time = 192;
        m.age = "12세";

        System.out.println(m.title);
        System.out.println(m.open);
        System.out.println(m.mainActor);
        System.out.println(m.genre);
        System.out.println(m.time);
        System.out.println(m.age);
    }
}
