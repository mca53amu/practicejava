package com.example.java8;

import java.util.Arrays;
import java.util.List;

public class MergeTwoSortedAndSortedSet {
    public static void main(String[] args) {

        int[] arr1 = { 1, 3, 5, 7, 8 };

        int[] arr2 = { 2, 4, 6, 9, 10 };

        int[] mergedArray = mergeArrays(arr1, arr2);

        System.out.println("Merged Array ");

        for (int i = 0; i < arr1.length + arr2.length; i++)
            System.out.print(mergedArray[i] + " ");

    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int i = 0, j = 0, k = 0;
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] arr3 = new int[n1 + n2];
        while (i < n1 && j < n2) {
            // check current value with both array and store in third array
            if (arr1[i] < arr2[j])
                arr3[k++] = arr1[i++];
            else
                arr3[k++] = arr2[j++];
        }
        // copy remaining values of array
        while (i < n1)
            arr3[k++] = arr1[i++];
        // copy remaining values of array
        while (j < n2)
            arr3[k++] = arr2[j++];
        return arr3;
    }
}
