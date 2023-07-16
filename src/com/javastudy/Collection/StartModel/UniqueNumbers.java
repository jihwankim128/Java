package com.javastudy.Collection.StartModel;

import java.util.HashSet;
import java.util.Set;

public class UniqueNumbers {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 2, 4, 6, 7, 1, 3};

        Set<Integer> uniqueNum = new HashSet<>();

        for(int number : nums) {
            uniqueNum.add(number);
        }

        for (int number : uniqueNum) {
            System.out.print(number + " ");
        }
    }
}
