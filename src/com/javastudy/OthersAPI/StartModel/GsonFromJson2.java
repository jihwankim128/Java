package com.javastudy.OthersAPI.StartModel;

import com.google.gson.Gson;
import com.javastudy.OthersAPI.Model.Person;

public class GsonFromJson2 {
    public static void main(String[] args) {
        Gson gson = new Gson();
        String s =
                "{" +
                "\"name\":\"김지환\"," +
                "\"age\": 24," +
                "\"email\":\"jihwangim128@gmail.com\"," +
                "\"address\":{" +
                    "\"city\":\"부산\"," +
                    "\"country\":\"대한민국\"" +
                    "}" +
                "}";
        Person p = gson.fromJson(s, Person.class);
        System.out.println(p);
    }
}
