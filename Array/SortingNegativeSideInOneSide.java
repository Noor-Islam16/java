package com.Placements.Array;
import java.util.Arrays;
public class SortingNegativeSideInOneSide {
        public static void main(String[] args) {
            int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
            int temp;
            int j = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 0) {
                    if (i != j) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                    j++;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }
// sorting the negative side of number in one side in an array

