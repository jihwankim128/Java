package com.javastudy.OthersAPI.StartModel;

import com.google.gson.Gson;
import com.javastudy.OthersAPI.Model.Member;

public class GsonFromJson {
    public static void main(String[] args) {
        String json =
                "{\"name\":\"김지환\",\"age\":24,\"email\":\"jihwangim128@gmail.com\"}";

        Gson gson = new Gson();

        Member mv = gson.fromJson(json, Member.class);

        System.out.println(mv);
    }
}
