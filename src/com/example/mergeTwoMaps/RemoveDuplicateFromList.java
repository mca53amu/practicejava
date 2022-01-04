package com.example.mergeTwoMaps;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicateFromList {
    public static void main(String[] args) {
        Integer[] arr1 = new Integer[]{1, 9, 8, 7, 7, 8, 9};

        HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(arr1));
        System.out.println(hashSet);
        Set<Integer> collect1 = Stream.of(arr1).collect(Collectors.toSet());
        System.out.println(collect1);
        HashSet<Integer> collect = Stream.of(arr1).collect(Collectors.toCollection(HashSet::new));
        System.out.println(collect);
        System.out.println("sort the elements");
        TreeSet<Integer> collect2 = Stream.of(arr1).collect(Collectors.toCollection(TreeSet::new));
        System.out.println(collect2);
        Stream.of(arr1).collect(Collectors.toCollection(HashSet::new));
        System.out.println("preserve the order");
        LinkedHashSet<Integer> collect3 = Stream.of(arr1).collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println(collect3);
    }
}
