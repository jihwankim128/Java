package com.javastudy.API.StartModel;

import com.javastudy.API.Utility.MinMaxFinder;

public class MinMaxTest {
    public static void main(String[] args) {
        int[] arr = {5, 3, 9, 1, 7};
        System.out.println("Max = " + MinMaxFinder.findMax(arr));
        System.out.println("Min = " + MinMaxFinder.findMin(arr));
    }
}
