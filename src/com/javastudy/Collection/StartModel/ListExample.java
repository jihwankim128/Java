package com.javastudy.Collection.StartModel;

import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("banana");

        for(int i = 0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }

        list.remove(0);
        System.out.println("삭제");

        list.set(1, "orange");

        for (String str : list) {
            System.out.println(str);
        }
    }
}
