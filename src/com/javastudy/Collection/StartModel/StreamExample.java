package com.javastudy.Collection.StartModel;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.*;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Java 자체 FunctionalInterface API
        Predicate<Integer> isEven = n->n%2==0;

        // Integer List -> Int Variable
        int sumOfSquares = list.stream()
                .filter(isEven)
                .sorted()
                .map(n -> n * n)
                .reduce(0, Integer :: sum);

        System.out.println(sumOfSquares);
    }
}
