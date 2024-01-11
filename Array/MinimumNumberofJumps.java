package com.Placements.Array;

public class MinimumNumberofJumps {
    public static int jump(int[] arr) {

        int jump = 0, pos = 0, des = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            des = Math.max(des,arr[i]+i);
            if(pos == i){
                pos = des;
                jump++;
            }
        }
        return jump;
    }

    public static void main(String[] args) {
        int arr[] = {2,3,1,1,4};
        int a = jump(arr);
        System.out.println("Minimum Jumps required to reach the end:" + a);
    }
}
