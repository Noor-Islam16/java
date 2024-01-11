package com.InterviewPrep;

//In, Insertion sort we are dividing the array in two parts 1 is sorted and 2 is unsorted.
//Example : 7 8 3 1 2 => 7 is sorted part and rest is unsorted
//Loop 1: Checking 7 < 8 yes then 7,8 is sorted and rest is unsorted
//Loop 2: Checking 8 < 3 no then now compare 7 < 3 no, then it looks like 3,7,8 and then unsorted
//Loop 3: Checking 8 < 1 no then 7 < 1 no then 3 < 1 no then it looks like 1,3,7,8 and then unsorted
//Loop 4: Checking 8 < 2 no then 7 < 2 no then 3 < 2 no then 1 < 2 yes then it looks like 1,2,3,7,8 and it is sorted.

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr ={7,8,3,1,2};
        for (int i = 1; i < arr.length ; i++) {
            int current = arr[i];
            int j = i - 1;
            while(j >= 0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

//Time Complexity: 0(n2)