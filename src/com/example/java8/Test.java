package com.example.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.*;
import java.util.stream.Collectors;

public class Test {

    public static void main(String a[]){

        int[] list = { 2, 3, 6, 2, 5, };

       OptionalInt max= Arrays.stream(list).max();
        System.out.println(max);
        OptionalInt min= Arrays.stream(list).min();
        System.out.println(min);


        LocalTime now = LocalTime.now();
        System.out.println(now);
        LocalDate now1 = LocalDate.now();
        System.out.println(now1);

        LocalDateTime now2 = LocalDateTime.now();
        System.out.println(now2);

        Date date = new Date(System.currentTimeMillis());
        LocalDateTime localDateTime = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        System.out.println(localDateTime);


        String s = "abcd";

        StringBuilder reverse = new StringBuilder(s).reverse();
        System.out.println(reverse);
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length/2; i++) {
            char temp=chars[i];
            chars[i]=chars[chars.length-i-1];
            chars[chars.length-i-1]=temp;

        }
        System.out.println(chars);

    }
}
