package com.javastudy.Collection.StartModel;

import com.javastudy.Collection.Model.StringOperation;

public class LambdaApply {
    public static void main(String[] args) {
        StringOperation toUpperCase = s-> s.toUpperCase();
        StringOperation toLowerCase = s-> s.toLowerCase();
        //StringOperation으로 s가 String 객체로 전달됨.
        //toUpperCase시 s는 Converter에 의해 대문자로
        //toLowerCase시 s는 Converter interface로 소문자로

        String input = "lambda lower, upper test";

        System.out.println(toLowerCase.apply(input));
        System.out.println(toUpperCase.apply(input));
    }

    /*public static String processingString(String input, StringOperation operation) {
        return operation.apply(input);
    }*/

}
