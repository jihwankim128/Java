package com.javastudy.Basic.Logical;

import java.util.Scanner;

public class SwitchCaseTest {
    public static void main(String[] args) {
        String day;
        Scanner scan = new Scanner(System.in);

        System.out.print("요일을 입력하세요 : ");
        day = scan.nextLine();
        switch(day) {
            case "Sunday" :
                System.out.println("야구하기");
                break;
            case "Monday":
                System.out.println("농구하기");
                break;
            case "Tuesday":
                //break가 없으므로 바로 다음 case를 탐색
            case "Wednesday":
                System.out.println("수영하기");
                break;
            default:
                System.out.println("휴식");
                //마지막이므로 break를 할 필요는 없음.
        }

        scan.close();
    }
}
