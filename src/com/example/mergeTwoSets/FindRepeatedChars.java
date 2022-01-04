package com.example.mergeTwoSets;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindRepeatedChars {
    public static void main(String[] args) {
        String input = "Java Hungry Blog Alive is Awesome";

        Map<Character, Long> collect = input.chars().mapToObj(a -> Character.valueOf((char) a)).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));
        System.out.println(collect);
        String input2="12345678967";
        Map<Character, List<Character>> collect1 = input2.chars().mapToObj(a -> Character.valueOf((char) a)).collect(Collectors.groupingBy(Function.identity()));
        System.out.println(collect1);
    }
}
