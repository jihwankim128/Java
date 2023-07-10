package com.javastudy.Programming.StartModel;

import com.javastudy.Programming.Model.StudentDTO;

public class StudentTest {
    public static void main(String[] args) {
        StudentDTO std = new StudentDTO();
        std.setName("홍길동");
        std.setDept("컴퓨터공학");
        std.setAge(37);
        std.setEmail("bitcocom@empas.com");
        std.setYear(2023110);
        std.setPhone("010-1111-1111");

        System.out.println(std);
    }
}
