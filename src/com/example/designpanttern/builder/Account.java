package com.example.designpanttern.builder;

public class Account {
    private final String fname;
    private final String lname;

    public Account(Builder builder) {
        this.fname = builder.fname;
        this.lname = builder.lname;
    }

    public static class Builder {
        private String fname;
        private String lname;

        public Builder fname(String fname) {
            this.fname = fname;
            return this;
        }

        public Builder lname(String lname) {
            this.lname = lname;
            return this;
        }

        public Account build(){
            Account account =new Account(this);
            return account;
        }

    }
}
