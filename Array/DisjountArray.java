package com.Placements.Array;

public class DisjountArray {
    static boolean disjount(int[] arr1, int[] arr2){
        for (int k : arr1) {
            for (int i : arr2) {
                if (k == i) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {10,91,3,43,6};
        int[] arr2 = {80,71,29,3};

        if(disjount(arr1,arr2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
