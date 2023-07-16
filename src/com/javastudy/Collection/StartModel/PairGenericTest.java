package com.javastudy.Collection.StartModel;

import com.javastudy.Collection.API.Pair;

import java.util.HashMap;
import java.util.Map;

public class PairGenericTest {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Hello", 1);
        System.out.print(pair.getKey() + " : " + pair.getValue() + "\n");

        Map<String, Integer> maps = new HashMap<>();
        maps.put("Hello", 1);
        for(Map.Entry<String, Integer> entry : maps.entrySet()){
            System.out.println(entry.getKey() + "'s = " + entry.getValue());
        }
    }
}
