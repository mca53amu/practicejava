package com.example.java8;

import java.util.stream.Stream;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println("hi");
        String s = "QABBAQ";
        StringBuilder reverse = new StringBuilder(s).reverse();

        if (s.equals(reverse.toString())) {
            System.out.println("palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        char[] chars = s.toCharArray();
        int i = 0;
        for (; i < chars.length / 2; i++) {
            if (chars[i] == chars[chars.length - 1 - i]) {
                continue;
            } else {
                break;
            }

        }
        if (i == chars.length / 2) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        System.out.println("checking palindrom Using stream api");
        boolean b = Stream.iterate(0, n -> n < s.length(), nn -> ++nn).allMatch(a -> s.charAt(a) == s.charAt(s.length() - 1 - a));
        System.out.println(b);

        System.out.println("Number palindrome");
        int num = 1212;
        int temp = num;
        int revNum = 0;
        do {
            int n = temp % 10;
            revNum = revNum * 10 + n;
            temp = temp / 10;

        } while (temp > 0);
        System.out.println("Number is palindrom "+(revNum==num));

    }
}
