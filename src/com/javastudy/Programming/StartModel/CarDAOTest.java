package com.javastudy.Programming.StartModel;

import com.javastudy.Programming.Model.CarDAO;
import com.javastudy.Programming.Model.CarDTO;

import java.util.Scanner;

public class CarDAOTest {
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

        CarDAO dao = new CarDAO();
        dao.carInsert(car);
        dao.carSelect(car);
    }
}
