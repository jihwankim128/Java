package com.javastudy.OthersAPI.StartModel;

import com.google.gson.Gson;
import com.javastudy.OthersAPI.Model.Member;

public class GsonToJson {
    public static void main(String[] args) {
        Member memver = new Member("김지환", 24, "jihwangim128@gmail.com");

        // DTO -> JSON
        Gson gson = new Gson();
        String json = gson.toJson(memver);

        System.out.println(json);
    }
}
