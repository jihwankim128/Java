package com.javastudy.Modeling.Poly;

//부모가 abstract가 되면서 자식도 불완전한 객체가 됨.
//완전한 객체로 재정의해주어야함.
public class Dog extends Animal implements Robot, Pet {
    @Override
    public void eat() {
        System.out.println("개처럼 먹다");
    }

    @Override
    public void Sound() {
        System.out.println("삐리릭");
    }

    @Override
    public void walk() {
        System.out.println("산책가다");
    }
}
