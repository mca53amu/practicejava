package com.example.mergeTwoMaps;

import com.example.java8.Employee;
import com.example.java8.EmployeeData;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoMapsTest {

    public static void main(String[] args) {
        System.out.println("merge two maps");
        Employee e1 = EmployeeData.createEmpObject("MOHAMMAD", 100L, "ONE");
        Employee e2 = EmployeeData.createEmpObject("MIYAN", 200L, "TWO");
        HashMap<String, Employee> map1 = new HashMap<String, Employee>();
        map1.put("1",e1);
        map1.put("2",e2);
        System.out.println(map1);
        Employee e3 = EmployeeData.createEmpObject("RASHID", 300L, "THREE");
        Employee e4 = EmployeeData.createEmpObject("BEG", 400L, "FOUR");
        HashMap<String, Employee> map2 = new HashMap<String, Employee>();
        map2.put("3",e3);
        map2.put("4",e4);
        System.out.println(map2);
        Stream<HashMap<String, Employee>> map11 = Stream.of(map1, map2);
        Map<String, Employee> collect = map11.
                flatMap(map -> map.entrySet().stream()).
                collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(a,b)->a,LinkedHashMap::new));
        System.out.println(collect);
        Stream<HashSet<String>> hashSetStream = Stream.of(new HashSet<String>());

    }
}
