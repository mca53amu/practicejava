package com.example.java8;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class SortTest {

    public static void main(String[] args) {
        var list = EmployeeData.getEmpList().stream().sorted((a, b) -> {
            return a.getEmpNumber() - b.getEmpNumber();
        }).collect(Collectors.toList());
        boolean b = EmployeeData.getEmpList().stream().noneMatch(a -> a.getEmpNumber() > 12);
        System.out.println(b);

        int[] arr = {1, 2,3,3};//Arrays.asList(1,2,3,3,4,4,5).toArray();
        int k = removeDuplicates(arr);
        System.out.println(arr);


    }

    public static int removeDuplicates(int[] nums) {
        var set = new HashSet<Integer>();
        if (nums.length == 1) {
            return 1;
        }
        if (nums.length == 2) {
            if (nums[0] == nums[1])
                return 1;
            return 2;
        }

        int count = 0;
        int i = 0;
        for (; nums[i] != -1 && i < nums.length - 1; i++) {
            var added = set.add(nums[i]);

            if (added == false) {
                int k = i;
                for (; k + 1 < nums.length && nums[k] != -1; k++) {
                    nums[k] = nums[k + 1];
                }
                nums[k] = -1;
                i--;
            } else {
                ++count;
            }
        }

if(i==nums.length-1 && set.add(nums[i])){
    return count+1;
}
        return count;
    }

    public static boolean predicate(Employee e,int w){
        return  true;
    }
}
