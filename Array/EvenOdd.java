package com.Placements.Array;

public class EvenOdd {
    public static void main(String[] args) {
        int[] arr = {10,21,30,33,32,29,34};
        int countEven = 0;
        int countOdd = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                countEven++;
            }else {
                countOdd++;
            }
        }
        System.out.println("Even Numbers in Array: "+countEven);
        System.out.println("Odd Numbers in Array: "+countOdd);
    }
}
