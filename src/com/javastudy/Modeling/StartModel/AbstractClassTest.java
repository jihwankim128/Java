package com.javastudy.Modeling.StartModel;

import com.javastudy.Modeling.Poly.Animal;
import com.javastudy.Modeling.Poly.Cat;
import com.javastudy.Modeling.Poly.Dog;

public class AbstractClassTest {
    public static void main(String[] args) {
        //추상 클래스는 단독으로 생성할 수 없음.
        //무조건 upcasting, 부모의 역할은 할 수 있으므로
        Animal ani = new Dog();
        ani.eat();
        ani.move();

        ani = new Cat();
        ani.eat();
        ((Cat)ani).night();
        ani.move();
    }
}
