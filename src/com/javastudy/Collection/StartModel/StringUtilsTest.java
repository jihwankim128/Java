package com.javastudy.Collection.StartModel;

import com.javastudy.Collection.API.StringUtils;
import com.javastudy.Collection.Model.Converter;

public class StringUtilsTest {
    public static void main(String[] args) {
        StringUtils stringUtils = new StringUtils();
        // stringUtils argument = String, return type = String
        // So, <String, String>
        // Instance Class::Method Reference
        Converter<String, String> converter = stringUtils::reverse;
        String result = converter.convert("Hello");
        System.out.println("result = " + result);
    }
}
