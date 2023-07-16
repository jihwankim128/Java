package com.javastudy.Collection.StartModel;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    public static void main(String[] args) {
        String str = "Hello, World";
        Map<Character, Integer> charCntMap = new HashMap<>();

        //문자열 객체를 배열 객체로 반환
        char[] strArray = str.toCharArray();

        for(char c : strArray) {
            if(charCntMap.containsKey(c)) {
                charCntMap.put(c, charCntMap.get(c)+1);
            }
            else {
                charCntMap.put(c, 1);
            }
        }
        System.out.println("Character Counts");
        for(char c : charCntMap.keySet()) {
            System.out.println(c + " : " + charCntMap.get(c));
        }
    }
}
