package com.example.java8;

import java.lang.reflect.Type;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        List<Employee> empList = EmployeeData.getEmpList();





        Optional<Employee> max = empList.stream().max((m1, m2) -> {
            return m1.getSal().intValue() - m2.getSal().intValue();
        });
        System.out.println(max);

        empList.stream().collect(Collectors.groupingBy(a -> a.getSal("")));
        System.out.println();
        //empList.stream().filter(Employee::predicate(1)).collect(Collectors.toList());

        List<Employee> emptylist = Optional.ofNullable(empList).orElse(Collections.emptyList());

        //employee = empList.stream().max(Employee::biFn).get();

       // Map map = emptylist.stream().filter(a -> a.getEmpNumber() % 2 == 0).collect(Collectors.toMap(Employee::getEmpNumber, Employee::getName,LinkedHashMap:: new));

        Map<String,Integer> map1 = new LinkedHashMap();

        map1.put("key1", 1);
        map1.put("key2", 2);
        map1.put("key3", 3);

        System.out.println(map1);

        Map map2 = map1.keySet()
                .stream()
                .collect(Collectors.toMap(key -> key,
                        key -> (map1.get(key) + 10),
                        (e1, e2) -> e1,
                        TreeMap::new));
        System.out.println(map2);
        map1.keySet()
                .stream()
                .collect(Collectors.toMap(key -> key, Function.identity()));

        System.out.println();

       /* Stream<String> st = Stream.iterate("", (str) -> str + "x");
        System.out.println(st.limit(3).map(str -> str + "y"));

*/

        Stream<String> st = Stream.iterate("", (str) -> str + "x");
        st.limit(3).map(str -> str + "y").forEach(f-> System.out.println(f));
    }
}
