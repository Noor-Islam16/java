//Q2: Bubble Sort
package com.InterviewPrep;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,2,5,4,3};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int k = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = k;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
//Time Complexity: O(n) => if array is sorted otherwise 0(n2)
