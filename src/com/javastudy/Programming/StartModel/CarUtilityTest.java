package com.javastudy.Programming.StartModel;

import com.javastudy.Programming.Model.CarDTO;
import com.javastudy.Programming.Model.CarUtility;

public class CarUtilityTest {
    public static void main(String[] args) {
        CarDTO car = new CarDTO();

        car.carSn = 111;
        car.carName = "BMW";
        car.carPrice = 90000000;
        car.carOwner = "me";
        car.carYear = 2010;
        car.carType = "G";

        CarUtility carUtil = new CarUtility();
        carUtil.carPrint(car);
    }
}
