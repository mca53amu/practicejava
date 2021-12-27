package com.example.mergeTwoMaps;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FirstRepeatedCharUsingJava8 {
    public static void main(String[] args) {
        System.out.println("hi");
        List<Integer> collect = Stream.of(10, 12, 11, 11).distinct().collect(Collectors.toList());
        System.out.println(collect);
        List<Integer> collect1 = Stream.iterate(1, i -> i + 10).limit(3).collect(Collectors.toList());
        System.out.println(collect1);

        Stream.iterate(1,i->i+1).limit(100).forEach(a->{
            System.out.println("hi"+a);
        });

        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Stream.of(myList).forEach(a-> System.out.println(a));

        String input = "Java Hungry Blog Alive is Awesome";
        input.chars().forEach(f-> System.out.println((char)f));
        Stream<Character> characterStream = input.chars().mapToObj(a -> Character.valueOf(((char) a)));
        LinkedHashMap<Character, Long> collect2 = characterStream.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        System.out.println(collect2);
        //output
        //{ =5, A=2, a=2, B=1, e=3, g=2, H=1, i=2, J=1, l=2, m=1, n=1, o=2, r=1, s=2, u=1, v=2, w=1, y=1}
    }
}
