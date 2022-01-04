package com.example.mergeTwoMaps;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortElementsUsingStream {

    public static void main(String[] args) {
        List<Integer> collect = Stream.of(10, 15, 8, 49, 25, 98, 98, 32, 15).sorted().collect(Collectors.toList());
        
        System.out.println(collect);

        Stream.of(10, 15, 8, 49, 25, 98, 98, 32, 15);

    }
}
