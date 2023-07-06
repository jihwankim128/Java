package com.javastudy.Programming.StartModel;

import com.javastudy.Programming.Model.PersonDTO;

public class ConstructorOverloading {
    public static void main(String[] args) {
        PersonDTO p = new PersonDTO("김지환", 24,
                "010-7553-6092");
        PersonDTO p1 = new PersonDTO();

        System.out.println(p.getName() + "\t" +
                p.getAge() + "\t" + p.getPhone());
        System.out.println(p1.getName() + "\t" +
                p1.getAge() + "\t" + p1.getPhone());
    }
}
