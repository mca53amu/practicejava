package com.example.java8;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class ENBDTest {
    public static void main(String[] args) {
        System.out.println("Hi");

        Stream<Integer> stream = Stream.iterate(1, i -> i + 1);

        Predicate<String> p= ENBDTest::test;

        boolean b=stream.noneMatch(a -> {
            System.out.println(a);
            return a>20;
        });
        System.out.println(b);
    }

   static boolean test(String a){
        return  false;
    }
}
