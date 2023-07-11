package com.javastudy.API.StartModel;

import com.javastudy.API.Utility.IntArray;

public class MyIntArrayTest {
    public static void main(String[] args) {
        IntArray list = new IntArray();
        for (int i = 0; i<6; i++) {
            list.add(i+1);
        }
        for(int i = 0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
