package com.javastudy.Collection.StartModel;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Banana");

        System.out.println(set.size());

        for (String s : set) {
            System.out.println(s);
        }

        set.remove("Banana");
        System.out.println("\nRemove\n");

        for (String s : set) {
            System.out.println(s);
        }

        //삭제할 요소가 없을 경우 false
        System.out.println(set.remove("Banana"));

        //contains로 먼저 찾고 삭제하는 듯
        System.out.println(set.contains("Banana"));

        set.clear();

        System.out.println(set.isEmpty());
    }
}
