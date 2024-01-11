package com.Placements.Array;

public class missingNumber {
    static int MissingNumber(int[] array) {
        int xor = 0;

        int xor1toN = 0;
        for(int i = 1; i <= array.length; i++){
            xor1toN = xor1toN ^ i;
        }

        for(int i = 0; i < array.length-1; i++){
            xor = xor ^ array[i];
        }
        return (xor ^ xor1toN);
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,5};
        System.out.println(MissingNumber(array));


    }
}
