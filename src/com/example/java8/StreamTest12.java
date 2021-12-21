package com.example.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamTest12 {
    public static void main(String[] args) {

        EmployeeData.getEmpList().stream().sorted((a, b) -> b.getEmpNumber() - a.getEmpNumber()).
                forEach(con -> System.out.println(con.toString()));
       // Stream.iterate(0,i->++i).limit(4).filter(a->a%2==0).forEach(c-> System.out.println(c.intValue()));
        Stream.iterate(0,n -> n < 200 ,nu->nu+1).filter(a->a%2==0).forEach(c-> System.out.println(c.intValue()));
        String[] arr={"list"};

        String[] objects = Arrays.asList(arr).stream().toArray(String[]::new);
        System.out.println(objects);

    }
}
