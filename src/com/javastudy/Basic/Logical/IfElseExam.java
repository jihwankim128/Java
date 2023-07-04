package com.javastudy.Basic.Logical;

import java.util.Scanner;

public class IfElseExam {
    public static void main(String[] args) {
        int year;
        Scanner scan = new Scanner(System.in);

        System.out.print("년도를 하나 입력 해주세요 : ");
        year = scan.nextInt();

        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            System.out.println(year + "은(는) 윤년 입니다.");
        else System.out.println(year + "은(는) 윤년이 아닙니다.");
        System.out.println("프로그램 종료");

        scan.close();
    }
}
