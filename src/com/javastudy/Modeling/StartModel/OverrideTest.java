package com.javastudy.Modeling.StartModel;

import com.javastudy.Modeling.Model.Animal;
import com.javastudy.Modeling.Model.Cat;
import com.javastudy.Modeling.Model.Dog;

public class OverrideTest {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        dog.eat();
        cat.eat();
    }
}
