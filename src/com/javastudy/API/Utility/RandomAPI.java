package com.javastudy.API.Utility;

import java.util.Random;

public class RandomAPI {
    public static void main(String[] args) {
        Random rand = new Random();
        boolean[] rands = new boolean[46];
        int[] arr = new int[6];
        for(int i = 0; i < arr.length; i++) {
            int num = rand.nextInt(6)+1;
            while(rands[num] == true) {
                num = rand.nextInt(6)+1;
            }
            rands[num] = true;
            arr[i] = num;
        }
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
