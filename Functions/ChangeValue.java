package com.Placements.Functions;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        //Create an array
        int a[]= {1,3,7,9,10};
        change(a);
        System.out.println(Arrays.toString(a));
    }
    static void change(int[] nums){
        nums[0] = 99;
    }
}
