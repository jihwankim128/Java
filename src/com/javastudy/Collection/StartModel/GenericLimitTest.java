package com.javastudy.Collection.StartModel;

import com.javastudy.Collection.API.AverageCalculator;

public class GenericLimitTest {
    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4, 5};
        Double[] doubles = {2.0, 1.2, 3.2, 1.1, 4.2};

        AverageCalculator<Integer> IntCal = new AverageCalculator<>(integers);
        AverageCalculator<Double> dbCal = new AverageCalculator<>(doubles);

        System.out.println(IntCal.calculatorAverage());

        System.out.println(dbCal.calculatorAverage());
    }
}
