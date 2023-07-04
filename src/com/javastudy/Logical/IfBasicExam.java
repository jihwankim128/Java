package com.javastudy.Logical;

import java.util.Scanner;

public class IfBasicExam {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int age;

        System.out.print("나이를 입력 하세요 : ");
        age = scan.nextInt();

        if(age >= 19) System.out.println("성인입니다.");
        else System.out.println("성인이 아닙니다.");

        scan.close();
    }
}
