package com.example.java8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest11 {
    public static void main(String[] args) {
        EmployeeData.getEmpList().stream().limit(3).forEachOrdered(consumer -> {
            System.out.println(consumer);
        });


        Map<Integer, Long> collect = EmployeeData.getEmpList().stream().collect(Collectors.toMap(key -> key.getEmpNumber(), value -> value.getSal()));

        System.out.println(collect);

        EmployeeData.getEmpList().stream().collect(Collectors.toCollection(LinkedList::new));
    }
}