package com.javastudy.Basic.Logical;

public class WhileLoopTest {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int idx = 0;
        while(idx < numbers.length) {
            System.out.println(numbers[idx++]);
        }
        idx = 0;
        do {
            System.out.println(numbers[idx++]);
        }
        while(idx < numbers.length);
    }
}
