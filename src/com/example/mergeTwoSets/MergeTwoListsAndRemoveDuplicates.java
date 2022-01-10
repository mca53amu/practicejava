package com.example.mergeTwoSets;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoListsAndRemoveDuplicates {
    public static void main(String[] args) {
        String[] arr1 = {"a", "b", "c"};
        String[] arr2 = {"c", "d", "e"};
        Set<String> collect = Stream.of(arr1, arr2).flatMap(a -> Stream.of(a)).collect(Collectors.toSet());
        System.out.println(collect);
    }
}
