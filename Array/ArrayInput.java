package com.Placements.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        int[] arr = new int[5];
//
//        for(int i = 0; i < arr.length; i++){
//         arr[i] = in.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));


//        for(int i = 0; i < arr.length; i++){
//            System.out.println(arr[i]);
//        }

        //for String

        String[] str = new String[5];

        for(int i = 0; i< str.length; i++){
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
