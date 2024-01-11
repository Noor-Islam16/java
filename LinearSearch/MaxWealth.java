package com.Placements.LinearSearch;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] account = {
                {23, 14, 3},
                {44, 85, 5},
                {127, 89, 34}
        };
        System.out.println(maxWealth(account));
    }
    static int maxWealth(int[][] account){
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < account.length; i++) {
            int sum = 0;
            for (int j = 0; j < account[i].length; j++) {
                sum += account[i][j];
            }
            // now we have sum of account of person
            //check with overall answer
            if(sum>ans){
                ans = sum;
            }
        }
        return ans;
    }

}
