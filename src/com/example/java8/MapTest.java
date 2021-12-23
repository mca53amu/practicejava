package com.example.java8;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapTest {
    public static void main(String[] args) {
        List<Employee> empList = EmployeeData.getEmpList();

        Map<Long, Employee> collect = empList.stream().
                collect(Collectors.toMap(k->k.getSal(), Function.identity(),(e1,e2)->e2, LinkedHashMap::new));

       // System.out.println(collect);

        Map<Long, List<Employee>> collect1 = empList.stream().collect(Collectors.groupingBy(Employee::getSal));
        //System.out.println(collect1);

        List<Employee> collect2 = collect1.entrySet().stream().flatMap(entry -> entry.getValue().stream()).collect(Collectors.toList());
        System.out.println(collect2);

    }
}
