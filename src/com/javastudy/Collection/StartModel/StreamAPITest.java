package com.javastudy.Collection.StartModel;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamAPITest {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};

        // 배열을 이용해 짝수 합 구하기
        int even = 0;
        for(int num : numbers) {
            if(num % 2 == 0) even += num;
        }
        System.out.println(even);

        // Stream을 이용해서 짝수 합 구하기
        IntStream istr = Arrays.stream(numbers);
        int sumOfEvens = istr.filter(n->n%2==0).sum();
        System.out.println(sumOfEvens);

        // Stream을 이용해서 짝수 배열 구하기
        // Stream을 일회성이다.
        istr = Arrays.stream(numbers);
        int[] evenArr = istr.filter(n->n%2==0).toArray();
        for (int evens : evenArr) {
            System.out.print(evens + " ");
        }
    }
}
