package com.example.mergeTwoMaps;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoStreamsTest {
    public static void main(String[] args) {
        System.out.println("hey");


        List<String> list1 = Arrays.asList("Java", "8");
        List<String> list2 = Arrays.asList("explained", "through", "programs");
        List<List<String>> lists = Arrays.asList(list1, list2);
        System.out.println(lists);
        String[] arr={"A"};
        Stream.of(arr);
        Arrays.asList(arr);
        LinkedHashSet<String> collect2 = Stream.of(arr).collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println(collect2);

        List<String> collect = Stream.of(list1, list2).flatMap(list -> list.stream()).collect(Collectors.toList());
        System.out.println(collect);
        List<String> collect1 = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
        System.out.println(collect1);
    }
}
