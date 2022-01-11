package com.example.java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class LinkedInTest {
    public static void main(String[] args) {
        String[] array = new String[]{"A", "B", "C"};
        List<String> list1 = asList(array);
        List<String> list2 = new ArrayList<>(asList(array));
        List<String> list3 = new ArrayList<>(asList("A", new String("B"), "C"));
        System.out.print(list1.equals(list2));
        System.out.print(list1.equals(list3));
        Set<String> s = new HashSet<>();
        boolean s1 = s.add("S");
        Stream.of(s);
        Map<String, String> map = new HashMap<>();
        map.put("1","A");
        Stream.of(map);
        System.out.println("map of lists");
        Map<String,List<String>> mapOfList=new HashMap<>();
        mapOfList.put("1",list1);
        mapOfList.put("2",list2);
        System.out.println("flatening usng stream of ");
        List<List<String>> collect = Stream.of(mapOfList).flatMap(ss -> ss.values().stream()).collect(Collectors.toList());
        System.out.println(collect);
        System.out.println("flatening usng collection");
        List<String> stringStream = mapOfList.values().stream().flatMap(f -> f.stream()).collect(Collectors.toList());
        System.out.println(stringStream);

        System.out.println("list of lists");
        List<List<String>> listOfList=new ArrayList<>();
        listOfList.add(list1);
        listOfList.add(list2);
        System.out.println("flatening using stream of");
        List<List<String>> collect1 = Stream.of(listOfList).flatMap(l -> l.stream()).collect(Collectors.toList());
        System.out.println(collect1);
        System.out.println("flattening using collection");
        List<String> collect2 = listOfList.stream().flatMap(l -> l.stream()).collect(Collectors.toList());
        System.out.println(collect2);

        System.out.println(" for loop 1 - 100");
        Stream<Integer> iterate = Stream.iterate(0, n -> n < 100, i -> i + 1);
        System.out.println(iterate);



        List<List<String>> collection = asList(asList("Viktor", "Farcic"), asList("John", "Doe", "Third"));

        List<String> collect3 = collection.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
        System.out.println(collect3);

    }
}
