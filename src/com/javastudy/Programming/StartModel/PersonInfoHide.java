package com.javastudy.Programming.StartModel;

import com.javastudy.Programming.Model.PersonDTO;

public class PersonInfoHide {
    public static void main(String[] args) {
        PersonDTO p = new PersonDTO();
        //p.setName("김지환");
        //p.setAge(24);
        //p.setPhone("010-7553-6092");
        System.out.println(p.getName() + "\t" +
        p.getAge() + "\t" + p.getPhone());
    }
}
