package com.example.designpanttern.builder;

public class UserBuilderTest {
    public static void main(String[] args) {
        UserBuilder builder=new UserBuilder();
        User user = builder.fname("mohammad").lname("miyan").build();
    }
}
