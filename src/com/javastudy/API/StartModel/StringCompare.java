package com.javastudy.API.StartModel;

public class StringCompare {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        if(str1.equals(str2)) {
            System.out.println(str1 + "과 "
            + str2 + "은(는) 같다.");
        }
        else {
            System.out.println(str1 + "과 "
            + str2 + "은(는) 다르다.");
        }

        str1 = "apple";
        str2 = "banana";
        int result = str1.compareTo(str2);

        if(result == 0) {
            System.out.println(str1 + "과 "
            + str2 + "은(는) 같다.");
        }
        else if(result < 0) {
            System.out.println(str1 + "은(는) "
            + str2 + "보다 앞에 있다.");
        }
        else {
            System.out.println(str1 + "은(는) "
            + str2 + "보다 뒤에 있다.");
        }
    }
}
