package com.example.java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest111 {

    public static void main(String[] args) {
        List<String> collect = EmployeeData.getEmpList().stream().map(a -> a.getName()).collect(Collectors.toList());
        System.out.println(collect);

        Map<String, Employee> collect1 = EmployeeData.getEmpList().stream().collect(Collectors.toMap(a -> a.getType(), Function.identity(),(a,b)->a));
        System.out.println(collect1);

        List<Employee> five = EmployeeData.getEmpList().stream().filter(a -> a.getType().contentEquals("FIVE")).collect(Collectors.toList());
        List<Employee> one = EmployeeData.getEmpList().stream().filter(a -> a.getType().contentEquals("ONE")).collect(Collectors.toList());
        System.out.println(five);
        System.out.println(one);
        Set<Employee> collect2 = Stream.of(five, one).flatMap(a->a.stream()).collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println(collect2);

        List<Integer> collect3 = Stream.iterate(0, a -> a + 1).limit(5).sorted((a,b)->-1).collect(Collectors.toList());
        System.out.println(collect3);
    }
}
