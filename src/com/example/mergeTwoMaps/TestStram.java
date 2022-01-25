package com.example.mergeTwoMaps;
//Stream to Array
//Array to Stream
//List to Array
//Array to List
//Stream to List
//List to Stream
//Stream to Map
//Array to set
//Set to array


//Array to list
//Array to set using list
//Array to set using stream
//Array to LinkedHashSet
//Array to Stream
//joining lists
//joining sets
//joining maps


import com.example.java8.Employee;
import com.example.java8.EmployeeData;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStram {

    public static void main(String[] args) {
        String a[]={"A","B"};
        List<String> list1 = Arrays.asList(a);
        List<String> list2 = Arrays.asList("a", "b");
        Set<String> set1 = new HashSet<>(Arrays.asList(a));
        Set<String> set2 = new LinkedHashSet<>(Arrays.asList(a));

        Stream<String> a1 = Stream.of(a);
        HashSet<String> collect = Stream.of(a).collect(Collectors.toCollection(HashSet::new));
        LinkedHashSet<String> collect1 = Stream.of(a).collect(Collectors.toCollection(LinkedHashSet::new));
        Stream.iterate(0,i->i<3,integer -> ++integer).limit(5).forEach(f-> System.out.println(f));

        Map<String, String> collect2 = a1.collect(Collectors.toMap(k -> k, v -> v));

        System.out.println("Joining two lists");
        List<String> collect3 = Stream.of(list1, list2).flatMap(l->l.stream()).collect(Collectors.toList());
        System.out.println(collect3);

        System.out.println("Joining two sets");
        HashSet<String> collect4 = Stream.of(set1, set2).flatMap(s -> s.stream()).collect(Collectors.toCollection(HashSet::new));
        System.out.println(collect4);


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

        System.out.println("joining two maps");
        Map<String, Employee> collect5 = Stream.of(map1, map2).flatMap(m -> m.entrySet().stream()).
                collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(c,d)->d));
        System.out.println(collect5);

        System.out.println("grouping by");
        Map<Long, List<Employee>> collect6 = EmployeeData.getEmpList().stream().collect(Collectors.groupingBy(g -> g.getSal()));
        System.out.println(collect6);

        System.out.println("list to map");
        Map<Long, Employee> collect7 = EmployeeData.getEmpList().stream().collect(Collectors.toMap(Employee::getSal, Function.identity(), (m1, m2) -> m2));
        System.out.println(collect7);

    }

}
