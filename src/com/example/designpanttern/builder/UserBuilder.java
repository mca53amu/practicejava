package com.example.designpanttern.builder;

public class UserBuilder {
    public String fname;
    public String lname;
    public int age;

    public UserBuilder fname(String fname) {
        this.fname = fname;
        return this;
    }

    public UserBuilder lname(String lname) {
        this.fname = lname;
        return this;
    }

    public UserBuilder age(int age) {
        this.age = age;
        return this;
    }

    public User build() {
        User user = new User(this);
        //validate here
        return user;

    }
}
