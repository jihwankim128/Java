package com.javastudy.Programming.StartModel;

import com.javastudy.Programming.Model.StudentDTO;

public class StudentArrayTest {
    public static void main(String[] args) {
        StudentDTO[] std = new StudentDTO[4];
        std[0] = new StudentDTO("홍길동", "컴공",
                33,"bit@empas.com",
                2023110, "010-1111-1111");
        std[1] = new StudentDTO("나길동", "전기",
                33,"bit@empas.com",
                2023111, "010-1111-2222");
        std[2] = new StudentDTO("김길동", "건축",
                25,"bit@empas.com",
                2023112, "010-1111-3333");
        std[3] = new StudentDTO("이길동", "통신",
                51,"bit@empas.com",
                2023113, "010-1111-4444");

        /*for(int i = 0; i < std.length; i++) {
            System.out.println(std[i]+"\n");
        }*/
        for (StudentDTO st : std)
            System.out.println(st+"\n");
    }
}
