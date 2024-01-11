package com.Placements.BinarySearch;

public class OrderAgnosticBinarySearch {
    //If we do not know whether the array is sorted in ascending or descending order then we use this
    public static void main(String[] args) {
        int[] arr = {2,3,4,15,16,18,85,127,129};
        int target = 127;
        int ans = orderAgnostic(arr,target);
        System.out.println(ans);
    }
    static int orderAgnostic(int[] arr,int target) {
        int start = 0;
        int end = arr.length - 1;

        //find whether the array is sorted in ascending or descending
//        boolean isAscen;
//        if(arr[start] < arr[end]) {
//            isAscen = true;
//        }else {
//            isAscen = false;
//        }
        boolean isAscen = arr[start] < arr[end]; //same as above


        while (start <= end) {
            //finding the middle element
            //int mid = (start + end)/2 if we do this then at some point the value exceeds the int class values which is defined in java
            int mid = start + (end - start) / 2;

            if (arr[mid] == target){
                return mid;
            }

            if(isAscen) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            }else{
                if(target > arr[mid]) {
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }
        }
        return -1;
    }
}
