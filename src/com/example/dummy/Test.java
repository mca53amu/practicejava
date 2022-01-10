package com.example.dummy;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        Stream<String> s1 = Stream.of("A", "B", "C");
        Stream<String> s2 = Stream.of("C", "D");
        Stream<Stream<String>> s11 = Stream.of(s1, s2);
        List<String> collect = s11.flatMap(s -> s).collect(Collectors.toList());
        System.out.println(collect);

        Map<String, String> m1 = new HashMap<>();
        m1.put("1","Mohammad");
        m1.put("2","Miyan");

        Map<String, String> m2 = new HashMap<>();
        m2.put("2","Mohammad");
        m2.put("3","Miyan");
        Stream<Map<String, String>> s = Stream.of(m1, m2);
        Set<String> collect1 = s.flatMap(a -> a.keySet().stream()).collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println(collect1);

    }
}
