package com.example.java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static java.util.Arrays.*;

import static java.util.stream.Collectors.*;

public class Test2 {

    public static void main(String[] args) {
      /*  List<Employee> empList = EmployeeData.getEmpList();
       System.out.println(EmployeeData.getEmpList());

        List<Employee> employees = Optional.ofNullable(empList).orElse(Collections.emptyList());
        employees.stream().collect(groupingBy(Employee::getType));
        Stream<Integer> stream = Stream.iterate(1, i -> i + 1);

        System.out.println(stream.limit(3).filter(i->i%2==0).collect(Collectors.toList()));

        String s="hellow medows";
        System.out.println(s.matches("(.*)ellow (.*)"));



        List<List<String>> collection = asList(asList("Viktor", "Farcic"), asList("John", "Doe", "Third"));

        List<String> collect = collection.stream().flatMap(list -> list.stream()).collect(toList());
        System.out.println(collect);*/

        List<Integer> list1 = Arrays.asList(1, 2, 4);
        List<Integer> list2 = Arrays.asList(1, 3, 4);
        var list3= Stream.iterate(1,a->a++).limit(200000000);
        System.out.println(list3);
        var start = System.currentTimeMillis();
        List<Integer> collect = Stream.concat(list3, list2.stream()).sorted().collect(toList());
        System.out.println("time "+(System.currentTimeMillis()-start));

    }
}
