package com.example.java8;

import java.util.Arrays;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 9, 15, 56, 67, 87, 98, 100};
        int first = 0, last = nums.length - 1;
        int mid = 0;
        int search = 15;
        while (first <= last) {
            mid = first + last / 2;
            if (search == nums[mid]) {
                break;
            } else if (search < nums[mid]) {
                last = mid;
            } else {
                first = mid;
            }

        }

    }

}
