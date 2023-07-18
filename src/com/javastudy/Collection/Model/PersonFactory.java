package com.javastudy.Collection.Model;

import com.javastudy.API.Model.Person;

@FunctionalInterface
public interface PersonFactory {
    public Person create(String name, int age);
}
