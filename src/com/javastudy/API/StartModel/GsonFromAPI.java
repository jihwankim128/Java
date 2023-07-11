package com.javastudy.API.StartModel;

import com.google.gson.Gson;
import com.javastudy.API.Model.Person;

public class GsonFromAPI {
    public static void main(String[] args) {
        String json = "{\"name\":\"jihwan\",\"age\":24}";
        Gson gson = new Gson();
        Person p = gson.fromJson(json, Person.class);
        System.out.println(p);
    }
}
