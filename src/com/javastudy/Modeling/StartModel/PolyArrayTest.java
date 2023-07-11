package com.javastudy.Modeling.StartModel;

import com.javastudy.Modeling.Model.Animal;
import com.javastudy.Modeling.Model.Cat;
import com.javastudy.Modeling.Model.Dog;

public class PolyArrayTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Animal[] ani = new Animal[2];

        ani[0] = cat;
        ani[1] = dog;

        Display(ani);
    }
    public static void Display(Animal[] ani) {
        for(int i = 0; i<ani.length; i++) {
            ani[i].eat();
            if(ani[i] instanceof Cat) {
                ((Cat) ani[i]).night();
            }
        }
    }
}
