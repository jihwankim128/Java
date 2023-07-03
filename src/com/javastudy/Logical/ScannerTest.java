package com.javastudy.Logical;
import java.util.*;
public class ScannerTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int i = scan.nextInt();
        System.out.print("실수 입력 : ");
        float f = scan.nextFloat();
        System.out.print("실수 입력 : ");
        double d = scan.nextDouble();
        System.out.print("문자열 입력 : ");
        String notSpace = scan.next(); // 공백 앞까지 문자열 입력
        scan.nextLine();
        System.out.print("공백을 포함한 문자열 입력 : ");
        String includeSpace = scan.nextLine(); // 엔터 앞까지 입력

        System.out.println("입력받은 정수 : " + i);
        System.out.println("입력받은 플롯 : " + f);
        System.out.println("입력받은 더블 : " + d);
        System.out.println("입력받은 문자열 : " + notSpace);
        System.out.println("입력받은 문자열 : " + includeSpace);
    }
}
