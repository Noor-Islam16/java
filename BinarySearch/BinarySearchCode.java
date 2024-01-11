package com.Placements.BinarySearch;

public class BinarySearchCode {

    //It is used for sorted arrays
    //Best Case Complexity: 0(1)
    //Worst Case Complexity: 0(log N)
    //Step 1: Find the middle element
    //Step 2: Check if target > middle => search in right otherwise in left
    //Step 3: If middle == target then it is the answer

    public static void main(String[] args) {
        int[] arr = {2,3,4,15,16,18,85,127,129};
        int target = 127;
        int ans = binarySearch(arr,target);
        System.out.println(ans);
    }

    //return the index
    //return -1 if element does not exist
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            //finding the middle element
            //int mid = (start + end)/2 if we do this then at some point the value exceeds the int class values which is defined in java
            int mid = start + (end - start) / 2;

            if(target <  arr[mid]){
                end = mid -1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else {
                return mid; // answer
            }
        }
        return -1;
    }
}
