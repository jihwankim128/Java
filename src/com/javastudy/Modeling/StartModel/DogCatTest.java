package com.javastudy.Modeling.StartModel;

import com.javastudy.Modeling.Model.Cat;
import com.javastudy.Modeling.Model.Dog;

public class DogCatTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        d.eat();
        c.eat();
        c.night();
    }
}
