package com.javastudy.Collection.StartModel;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapStreamExample2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("my", "name", "is", "jihwan");
        List<String> upperList = list.stream()
                .map(n->n.toUpperCase())
                .collect(Collectors.toList());

        System.out.println("List = " + upperList);
        for (String str : upperList) {
            System.out.print(str + " ");
        }
    }
}
