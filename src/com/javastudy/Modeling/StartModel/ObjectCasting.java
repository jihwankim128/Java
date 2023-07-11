package com.javastudy.Modeling.StartModel;

import com.javastudy.Modeling.Model.Animal;
import com.javastudy.Modeling.Model.Cat;
import com.javastudy.Modeling.Model.Dog;

public class ObjectCasting {
    public static void main(String[] args) {
        Animal ani = new Dog();
        ani.eat();
        ani = new Cat();
        ani.eat();
        //다형성 - 다르다.
        //하나의 부모로 같은 호출을 하지만 다른 출력
        Cat cat = (Cat)ani;
        cat.night();
        ((Cat)ani).night();
    }
}
