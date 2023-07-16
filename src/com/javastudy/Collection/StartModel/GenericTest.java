package com.javastudy.Collection.StartModel;

import com.javastudy.Collection.API.ObjectArray;

public class GenericTest {
    public static void main(String[] args) {
        ObjectArray<String> array = new ObjectArray<>(5);
        array.set(0, "Hello");
        array.set(1, "World");
        array.set(2, "I'm");
        array.set(3, "Jihwan");

        for (int i = 0 ; i< array.size(); i++) {
            System.out.print(array.get(i)+ " ");
        }
    }
}
