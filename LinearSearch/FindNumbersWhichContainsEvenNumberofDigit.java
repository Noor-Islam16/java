package com.Placements.LinearSearch;

public class FindNumbersWhichContainsEvenNumberofDigit {
    public static void main(String[] args) {
        int[] arr = {12,6,127,128,85,7865};
        System.out.println(findEvenNum(arr));
    }
    static int findEvenNum(int[] arr){
        int count = 0;
        for (int num:arr) {
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int numberofDigits = digits(num);
        if(numberofDigits % 2 == 0){
            return true;
        }
        return false;
    }
    static int digits(int num){

        if(num < 0){
            num = num * -1;
        }
        if(num == 0){
            return 1;
        }
        int count = 0;
        while(num > 0){
            count++;
            num = num / 10;
        }
        return count;
    }
}
