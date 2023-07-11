package com.javastudy.Modeling.StartModel;

import com.javastudy.Modeling.Poly.Animal;
import com.javastudy.Modeling.Poly.Cat;
import com.javastudy.Modeling.Poly.Dog;

public class IsNotOverride {
    public static void main(String[] args) {
        Animal ani = new Dog();
        ani.eat();
        ani = new Cat();
        ani.eat();
    }
}
