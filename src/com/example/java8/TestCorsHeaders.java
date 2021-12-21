package com.example.java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestCorsHeaders {
    static int a=3,b;

    public static void main(String[] args) {

    String fre=frequency("phqgh");
        System.out.println(fre);

    }

    private static String frequency(String intput1) {
        StringBuilder builder=new StringBuilder("");
        Stream<Map.Entry<String, Long>> stream = Stream.of(intput1.split("")).
                collect(Collectors.groupingBy(e -> e, Collectors.counting())).
                entrySet().stream();
        Stream<String> ssss = stream.sorted(Map.Entry.comparingByKey()).map(e -> e.getKey() + e.getValue() + "");
        ssss.forEach(f->builder.append(f));
        return builder.toString();

    }


}
