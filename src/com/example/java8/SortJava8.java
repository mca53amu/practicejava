package com.example.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortJava8 {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,4,2,9,3);

      List<Integer> limit= list.stream().sorted().limit(3).collect(Collectors.toList());

        System.out.println(limit);


    }
}
