package com.javastudy.Modeling.Poly;

// 추상 클래스[불완전한 클래스]
// 불완전하므로 스스로 객체 생성 불가.
// Why? 메서드가 불완전함. 구현부가 없으니까. 출력할게 없는데 출력함?
public abstract class Animal {
    //추상 메서드 (불완전한 메서드) : 바디(구현부)가 없어도 됨.
    //Why? 어차피 실행이 안됨.
    public abstract void eat(); //호출 불가능.

    //구현 메서드
    public void move() {
        System.out.println("움직이다.");
    }
}
