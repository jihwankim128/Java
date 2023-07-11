package com.javastudy.Modeling.StartModel;

import com.javastudy.Modeling.Model.Animal;
import com.javastudy.Modeling.Model.Cat;
import com.javastudy.Modeling.Model.Dog;

public class PolyMethodTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        PolyMethodTest.Display(dog);
        PolyMethodTest.Display(cat);
    }
    /*
    public static void Display(Dog dog){
        dog.eat();
    }
    public static void Display(Cat cat) {
        cat.eat();
    }*/

    public static void Display(Animal ani) {
        ani.eat();
        if(ani instanceof Cat) {
            ((Cat)ani).night();
        }
    }
}
