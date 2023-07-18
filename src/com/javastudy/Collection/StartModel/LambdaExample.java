package com.javastudy.Collection.StartModel;

import com.javastudy.Collection.Model.MathOperation;

public class LambdaExample {
    public static void main(String[] args) {
        MathOperation add = new MathOperation() {
            @Override
            public int operation(int x, int y) {
                return x+y;
            }
        };

        System.out.println(add.operation(10, 20));
        // --- 기존에 사용하던 익명함수 방식

        MathOperation lambdaAdd = (int x, int y) -> { return x+y;};
        //lambdaAdd = (x, y) -> {return x+y}; 로 표현도 가능
        //lambdaADd = (x, y -> x+y; 도 가능

        System.out.println(lambdaAdd.operation(10, 20));

    }
}
