package com.javastudy.Programming.StartModel;

import com.javastudy.Programming.Model.PersonDTO;

public class ConstructorInit {
    public static void main(String[] args) {
        PersonDTO p = new PersonDTO();
        System.out.println(p.getName() + "\t" +
                p.getAge() + "\t" + p.getPhone());
    }
}
