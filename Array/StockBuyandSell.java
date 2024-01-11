package com.Placements.Array;

public class StockBuyandSell {
    public static int maxProfit(int[] arr){
        int minSofar = arr[0];
        int maxProfit = 0;

        for (int i = 0; i < arr.length; i++) {
            minSofar = Math.min(minSofar,arr[i]);
            int Profit = arr[i] - minSofar;
            maxProfit = Math.max(maxProfit,Profit);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] arr = {5,2,6,1,4};
        System.out.println("Max Profit You Make:"+ maxProfit(arr));
    }
}
