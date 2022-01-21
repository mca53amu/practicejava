package com.example.java8;

import java.util.Arrays;

public class EmaratecTest {
  /*  public static void main(String[] args) {
        List<Employee> empList = EmployeeData.getEmpList();

        Map<String, List<Employee>> collect2 = empList.stream().collect(Collectors.groupingBy(Employee::getType));
        System.out.println(collect2);
        List<Employee> collect4 = collect2.entrySet().stream().flatMap(a -> a.getValue().stream()).collect(Collectors.toList());
        System.out.println("______");
        System.out.println(empList);
        System.out.println(collect4);

        System.out.println("*****");
        Map<String, String> collect3 = empList.stream().collect(Collectors.toMap(Employee::getType, Employee::getName,(a,b)-> a, LinkedHashMap::new));
        System.out.println(collect3);
        System.out.println("join two maps");
        HashMap<String, String> m1 = new HashMap<>();
        m1.put("A","1");
        HashMap<String, String> m2 = new HashMap<>();
        m2.put("B","3");

        Map<String, String> collect6 = Stream.of(m1, m2).flatMap(a -> a.entrySet().stream()).collect(Collectors.toMap(a -> a.getKey(), b -> b.getValue()));
        System.out.println("99999 "+collect6);

        List<Integer> collect = Stream.iterate(0, i -> i < 10, j -> ++j).collect(Collectors.toList());
        System.out.println(collect);

        Stream<String> a = Stream.of("A", "B", "C");
        List<String> collect1 = a.collect(Collectors.toList());
        System.out.println(collect1);
        System.out.println("join two lists");
        List<Integer> list1 = Arrays.asList(1, 2, 4);
        List<Integer> list2 = Arrays.asList(1, 3, 4);
        LinkedList<Integer> collect5 = Stream.of(list1, list2).flatMap(aa -> aa.stream()).collect(Collectors.toCollection(LinkedList::new));
        System.out.println(collect5);

        //reverse of a String

        String s="abc";
        StringBuilder builder = new StringBuilder(s);
        StringBuilder reverse = builder.reverse();
        System.out.println(reverse);
        char[] chars = new char[s.length()];
        //Fibonachi
        int n1=0,n2=1;
        for (int i = 0; i < 10; i++) {
            int fib=n1+n2;
            System.out.println(fib);
            n1=n2;
            n2=fib;
        }

        //find the frequency
        String f="findthefrequency";
        Map<Character, Long> collect7 = f.chars().mapToObj(aaa -> (char) aaa).collect(Collectors.groupingBy(k -> k, Collectors.counting()));
        System.out.println(collect7);




    }*/


    public static void main(String a[]) {

        Integer[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        Arrays.asList(arr).stream().sorted().forEach(f -> {
            System.out.println(f);
        });

    }


}
