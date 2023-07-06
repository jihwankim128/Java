package com.javastudy.Programming.StartModel;

import com.javastudy.Programming.Model.CarDTO;

import java.util.Scanner;

public class CarDTOTest {
    public static void main(String[] args) {
        CarDTO car = new CarDTO();
        Scanner scan = new Scanner(System.in);
        System.out.print("자동차 번호 : ");
        car.carSn = scan.nextInt();
        scan.nextLine();

        System.out.print("자동차 이름 : ");
        car.carName = scan.nextLine();

        System.out.print("자동차 가격 : ");
        car.carPrice = scan.nextInt();
        scan.nextLine();

        System.out.print("자동차 소유자 : ");
        car.carOwner = scan.nextLine();

        System.out.print("자동차 년식 : ");
        car.carYear = scan.nextInt();
        scan.nextLine();

        System.out.print("자동차 타입 : ");
        car.carType = scan.nextLine();

        scan.close();

        carInfoPrint(car);
    }
    public static void carInfoPrint(CarDTO car){
        System.out.println(car.carSn + "\t" + car.carName +
                "\t" + car.carPrice + "\t" + car.carOwner
                +"\t" + car.carYear + "\t" + car.carType);
    }
}
