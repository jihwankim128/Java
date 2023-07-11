package com.javastudy.API.StartModel;

import com.google.gson.Gson;
import com.javastudy.API.Model.Person;

public class GsonToAPI {
    public static void main(String[] args) {
        Person person = new Person("jihwan", 24);
        Gson gson = new Gson();
        String json = gson.toJson(person);
        System.out.println(json);
    }
}
