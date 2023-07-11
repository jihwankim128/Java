package com.javastudy.Modeling.StartModel;

import com.javastudy.Modeling.Poly.Animal;
import com.javastudy.Modeling.Poly.Dog;
import com.javastudy.Modeling.Poly.Pet;
import com.javastudy.Modeling.Poly.Robot;

public class DogTest {
    public static void main(String[] args) {
        Animal ani = new Dog();
        Pet pet = new Dog();
        Robot rob = new Dog();
        ani.move();
        pet.walk();
        rob.Sound();
    }
}
