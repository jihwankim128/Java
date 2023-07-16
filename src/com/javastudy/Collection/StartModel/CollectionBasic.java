package com.javastudy.Collection.StartModel;

import java.util.ArrayList;

public class CollectionBasic {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i<=5; i++) {
            list.add(i*10);
        }
        for (int data : list) {
            System.out.println(data);
        }
    }
}
