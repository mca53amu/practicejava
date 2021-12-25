package com.example.mergeTwoMaps;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicateFromList {
    public static void main(String[] args) {
        Integer[] arr1 = new Integer[] { 1, 9, 8, 7, 7, 8, 9 };
        List<Integer> integers = Arrays.asList(arr1);
        Set<Integer> collect = integers.stream().collect(Collectors.toCollection(TreeSet::new));
        System.out.println(collect);

        Set<Integer> collect1 = integers.stream().collect(Collectors.toSet());
        System.out.println(collect1);
        List<Integer> collect2 = integers.stream().distinct().collect(Collectors.toList());
        System.out.println(collect2);
    }
}
