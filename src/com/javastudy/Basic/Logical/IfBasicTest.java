package com.javastudy.Basic.Logical;

import java.util.Scanner;

public class IfBasicTest {
    public static void main(String[] args) {
        int x = 10;
        if(x > 0) {
            System.out.println("양수 입니다.");
        }

        Scanner scan = new Scanner(System.in);

        int num;

        System.out.print("정수를 입력 하세요 : ");
        num = scan.nextInt();

        if(num % 7 == 0) System.out.println("7의 배수입니다.");

        scan.close();
    }
}
