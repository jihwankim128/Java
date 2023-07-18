package com.javastudy.Collection.StartModel;

import com.javastudy.API.Model.Person;
import com.javastudy.Collection.Model.PersonFactory;

public class PersonFactoryTest {
    public static void main(String[] args) {
        //간결한 표현 생성자::new 참조
        PersonFactory pF = Person::new;
        Person person = pF.create("홍길동", 40);
        System.out.println(person);

        //기본적인 표현
        PersonFactory pF2 = new PersonFactory() {
            @Override
            public Person create(String name, int age) {
                return new Person(name, age);
            }
        };
        Person person2 = pF2.create("이길동", 30);
        System.out.println(person2);
    }
}
