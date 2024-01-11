package com.Placements.LinearSearch;

public class SearchInRange {
    //Q: Search for 3 in the range of index [1,4]
    static int linearsearch(int[] arr, int target,int start, int end){
        if(arr.length == 0){
            return  -1;
        }
        for (int i = start; i <= end; i++) {
            //checking the element which is equal to the target element
            int element = arr[i];
            if(element == target){
                return  i;
            }
        }
        return  -1;
    }
    public static void main(String[] args) {
        int[] arr = {12,43,65,3,2,1,8,9,85,127};
        int target = 3;
        int result = linearsearch(arr,target,1,3);
        System.out.println("The element found at index:"+result);
    }
}
