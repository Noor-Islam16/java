package com.Placements.Array;

public class RepeatingElement {
    public static void main(String[] args) {
        int[] arr = {10,10,20,23,3,21,20};
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count>1){
                System.out.println(arr[i]);
            }
        }
    }
}
