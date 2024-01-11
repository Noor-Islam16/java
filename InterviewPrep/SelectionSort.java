package com.InterviewPrep;

//Sabse chota element nikal swap kr diya dekho aese
//Example: 7 8 3 1 2
//Loop 1: smallest index = 0[7]  => 7 > 8 no and then 7 > 3 yes then now smallest index = 2[3] and now comparing with 3 > 1 as 1 is smallest then smallest index = 3[1] and then comparing with 1 > 2 no.
//Now array is look like: 1 8 3 7 2
//Loop 2: smallest index = 1[8] => 8 > 3 yes then smallest index = 2[3] and now comparing 3 > 7 no, then 3 > 2 yes, then smalest index = 4[2]
//Now array is look like: 1 2 3 7 8
//Loop 3: smallest index = 2[3] => 3 > 7 no, then 3 > 8 no. as it is no change
//Loop 4: smallest index = 3[7] => 7 > 8 no, then no change
//Loop 5: smallest index = 4[8]

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {7,8,3,1,2};

        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

//Time Complexity: O(n2)