package com.Placements.Array;


public class Pair {
    public static void main(String[] args) {
        int count = 0;
        int[] arr = {1,1,1,1};
        int j = arr.length-1;
        for(int i = 0 ; i < arr.length;i++){
            if(i<j){
                j = arr.length-1;
            }
            while(i<j){
                if (arr[i] == arr[j]) {
                    count++;
                }
                j--;
            }
        }
        System.out.println(count);
    }
}
