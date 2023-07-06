package com.javastudy.Programming.Model;

public class PersonDTO {
    private String name;
    private int age;
    private String phone;
    public PersonDTO() {
        //this.name = "지환";
        //this.age = 23;
        //this.phone = "010-2236-6092";
    }
    public PersonDTO(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public String getPhone() {
        return this.phone;
    }

    public String toString() {
        return name + "\t" + age + "\t" + phone;
    }
}
