package com.example.mergeTwoSets;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoSets {

    public static void main(String[] args) {
        Set<String> s1 = new HashSet<>();
        s1.add("A");
        Set<String> s2 = new HashSet<>();
        s2.add("B");
        s2.add("A");
        Collection<String> collect = Stream.of(s1, s2).flatMap(a -> a.stream()).collect(Collectors.toCollection(LinkedList::new));
        System.out.println(collect);

        Map<Integer, Long> collect1 = Stream.of(1, 2, 2, 3).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(collect1);



    }
}
