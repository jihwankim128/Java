package com.javastudy.Modeling.StartModel;

import com.javastudy.Modeling.Model.Animal;
import com.javastudy.Modeling.Model.Cat;
import com.javastudy.Modeling.Model.Dog;

public class DogCatUpcastingTest {
    public static void main(String[] args) {
        Animal ani = new Dog();
        ani.eat();
        ani = new Cat();
        ani.eat();
    }
}
