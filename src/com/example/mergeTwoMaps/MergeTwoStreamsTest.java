package com.example.mergeTwoMaps;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoStreamsTest {
    public static void main(String[] args) {
        System.out.println("hey");


        List<String> list1 = Arrays.asList("Java", "8");
        List<String> list2 = Arrays.asList("explained", "through", "programs");
        List<String> collect = Stream.of(list1, list2).flatMap(list -> list.stream()).collect(Collectors.toList());
        System.out.println(collect);
        List<String> collect1 = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
        System.out.println(collect1);
    }
}
