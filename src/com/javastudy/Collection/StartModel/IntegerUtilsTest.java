package com.javastudy.Collection.StartModel;

import com.javastudy.Collection.API.IntegerUtils;
import com.javastudy.Collection.Model.Converter;

public class IntegerUtilsTest {
    public static void main(String[] args) {
        //정적 클래스 :: 메소드 참조
        Converter<String, Integer> converter = IntegerUtils::stringToInt;
        Integer result = converter.convert("123");
        System.out.println("reuslt = " + result);
    }
}
