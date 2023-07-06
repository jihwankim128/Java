package com.javastudy.Programming.StartModel;

import com.javastudy.Programming.Model.MemberDTO;

public class AccessModifier {
    public static void main(String[] args) {
        MemberDTO dto = new MemberDTO();
        dto.name = "지환";
        dto.phone = "234";
        System.out.println(dto.name + "\t" + dto.phone);
        dto.play();
    }
}
