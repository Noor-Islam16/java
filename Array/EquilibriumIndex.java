package com.Placements.Array;

public class EquilibriumIndex {
    static int equilibrium(int[] arr){
        int result = -1;

        for (int i = 0; i < arr.length; i++) {
            int l_sum = 0;
            for (int j = 0; j < i; j++)
                l_sum += arr[i];

            int r_sum = 0;
            for (int j = i+1; j < arr.length; j++)
                r_sum += arr[i];

            if(r_sum == l_sum)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,2,2};
        System.out.print("Equilibrium Index: ");
        System.out.println(equilibrium(arr));
    }
}
