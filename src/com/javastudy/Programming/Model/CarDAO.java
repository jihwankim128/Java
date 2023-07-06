package com.javastudy.Programming.Model;

public class CarDAO {
    public void carInsert(CarDTO car) {
        System.out.println("car 정보가 DB에 저장이 되었습니다.");
    }
    public void carSelect(CarDTO car) {
        System.out.println("car 정보가 출력이 되었습니다.");
    }
}
