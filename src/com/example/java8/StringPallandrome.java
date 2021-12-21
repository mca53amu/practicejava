package com.example.java8;

public class StringPallandrome {
    public static void main(String[] args) {
        String str = "a";

        boolean pallandrome = new StringBuilder(str).reverse().toString().equals(str);
        System.out.println(pallandrome);

        //checking without library

        char[] strArr = str.toCharArray();

        int i = 0;
        for (; i < strArr.length / 2; i++) {
            if (strArr[i] == strArr[strArr.length - i - 1]) {
                continue;
            } else {
                break;
            }
        }
        if (i == strArr.length / 2)
            System.out.println("pallandrome");

        // checking int pallandrome

        int num = 121;
        boolean isPala = new StringBuilder(String.valueOf(num)).reverse().toString().equals(Integer.toString(num));
        System.out.println(isPala);


        // reverse a String


        String original = "ABCDE";
        System.out.println(original);
        System.out.println("starting reverse");

        char[] originalStringArr = original.toCharArray();

        for (int j = 0; j < originalStringArr.length / 2; j++) {
            char temp = originalStringArr[j];
            originalStringArr[j] = originalStringArr[originalStringArr.length - j - 1];
            originalStringArr[originalStringArr.length - j - 1] = temp;

        }
        System.out.println(String.valueOf(originalStringArr));


    }
}
