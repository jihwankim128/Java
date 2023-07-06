package com.javastudy.Programming.StartModel;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("자동차 번호 : ");
        int carSn = scan.nextInt();
        scan.nextLine();

        System.out.print("자동차 이름 : ");
        String carName = scan.nextLine();

        System.out.print("자동차 가격 : ");
        int carPrice = scan.nextInt();
        scan.nextLine();

        System.out.print("자동차 소유자 : ");
        String carOwner = scan.nextLine();

        System.out.print("자동차 년식 : ");
        int carYear = scan.nextInt();
        scan.nextLine();

        System.out.print("자동차 타입 : ");
        String carType = scan.nextLine();

        System.out.println(carSn + "\t" + carName +
                "\t" + carPrice + "\t" + carOwner
        +"\t" + carYear + "\t" + carType);
    }
}
