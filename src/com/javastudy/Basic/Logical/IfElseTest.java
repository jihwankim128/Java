package com.javastudy.Basic.Logical;

import java.util.Scanner;

public class IfElseTest {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);

        System.out.print("정수 하나를 입력하세요 : ");
        n = scan.nextInt();
        if(n%2 == 0) {
            System.out.println(n + "은(는) 짝수 입니다.");
        }
        else System.out.println(n + "은(는) 홀수 입니다.");
        System.out.println("프로그램 1 종료");

        if(n%12 == 0) System.out.println(n +"은(는) 12의 " +
                "배수입니다.");
        else System.out.println(n + "은(는) 12의" +
                "배수가 아닙니다.");
        System.out.println("프로그램 2 종료");

        scan.close();
    }
}
