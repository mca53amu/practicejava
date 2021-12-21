package com.example.designpanttern.builder;

public class User {
    private String fname;
    private String lname;
    private int age;


    public User(UserBuilder builder){
        this.fname=builder.fname;
        this.lname=builder.lname;
        this.age=builder.age;
    }
}
