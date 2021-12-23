package com.example.methodreference;

import com.example.java8.Employee;
import com.example.java8.EmployeeData;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MethodRefTest {

    public static void main(String[] args) {
        System.out.println("hi");
        List<Employee> empList = EmployeeData.getEmpList();
        System.out.println(empList);
        Stream<Employee> sorted = empList.stream().sorted(Employee::biFn);
        System.out.println(sorted.collect(Collectors.toList()));

        List<Employee> list = empList.stream().filter(Employee::fun).collect(Collectors.toList());
        System.out.println(list);

    }
}
