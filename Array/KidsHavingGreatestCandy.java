package com.Placements.Array;

import java.util.ArrayList;

public class KidsHavingGreatestCandy {
    public static void main(String[] args) {
        int[] Candies = {2,3,5,1,3};
        int extraCandies = 3;
        int n = Candies.length;
        ArrayList<Boolean> ans = new ArrayList<>();

        for(int i = 0; i < n; i++){
            boolean test = false;
            for(int j = 0; j < n; j++){
                if (Candies[i] + extraCandies < Candies[j]){
                    test = true;
                    break;
                }
            }
            if(test){
                ans.add(false);
            }else {
                ans.add(true);
            }
        }
        System.out.println(ans);
    }
}
