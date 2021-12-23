package com.example.defaultmethod;

@FunctionalInterface
public interface ITest {

    public void test();

    public default void test2() {
        System.out.println("i am default method");
    }

    public static void test3(){
        System.out.println("i am static method");
    }
}
