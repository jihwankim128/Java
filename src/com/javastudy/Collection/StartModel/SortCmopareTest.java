package com.javastudy.Collection.StartModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//특정 객체의 메서드 참조.
public class SortCmopareTest {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("홍길동", "김길동", "이길동");
        //names.add("Test");  // asList에서 add 안됨.
        //아규먼트의 내용을 List로 반환하는데 get, set, contains 메서드 뿐
        //따로 list형식으로 출력하기 위해서 그럼.

        Collections.sort(names, String::compareTo);
        //String 객체의 compareTo 메서드
        //compareTo -> 오름차순, default

        System.out.println(names);

        for (String name : names){
            System.out.println(name);
        }
    }
}
