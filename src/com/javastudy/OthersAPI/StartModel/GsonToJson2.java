package com.javastudy.OthersAPI.StartModel;

import com.google.gson.Gson;
import com.javastudy.OthersAPI.Model.Address;
import com.javastudy.OthersAPI.Model.Person;

public class GsonToJson2 {
    public static void main(String[] args) {
        Address address = new Address("부산", "대한민국");
        Person p = new Person("김지환", 24, "jihwangim128@gmail.com", address);

        Gson gson = new Gson();
        String json = gson.toJson(p);

        System.out.println(json);
    }
}
