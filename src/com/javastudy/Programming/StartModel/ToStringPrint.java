package com.javastudy.Programming.StartModel;

import com.javastudy.Programming.Model.PersonDTO;

public class ToStringPrint {
    public static void main(String[] args) {
        PersonDTO p = new PersonDTO("김지환", 24,
                "010-7553-6092");

        System.out.println(p.getName() + "\t" +
                p.getAge() + "\t" + p.getPhone());
        System.out.println(p.toString());
        System.out.println(p); // toString 생략 가능
    }
}
