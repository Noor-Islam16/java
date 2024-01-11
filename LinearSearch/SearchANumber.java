package com.Placements.LinearSearch;

public class SearchANumber {

        //Q: Find whether 14 exist in array or not
        //Linear Search: Start searching for that element till you find it
        //Best Case Complexity: 0(1)
        //Worst Case Complexity: 0(n) => n = Size of array.

    //search in the array: return the item if found otherwise return -1.
    static int linearsearch(int[] arr, int target){
        if(arr.length == 0){
            return  -1;
        }
        for (int i = 0; i < arr.length; i++) {
            //checking the element which is equal to the target element
            int element = arr[i];
            if(element == target){
                return  i;
            }
        }
        return  -1;
    }
    //search the target and return the element
    static int linearsearch2(int[] arr, int target){
        if(arr.length == 0){
            return  -1;
        }
        for (int i = 0; i < arr.length; i++) {
            //checking the element which is equal to the target element
            int element = arr[i];
            if(element == target){
                return  element;
            }
        }
        return  -1;
    }

    public static void main(String[] args) {
        int[] arr = {12,43,65,4,2,1,8,9,85,127};
        int target = 127;
        int result = linearsearch(arr,target);
        int result2 = linearsearch2(arr,target);
        System.out.println("The element found at index:"+result);
        System.out.println("The element we are founding is:"+result2);

    }
}
