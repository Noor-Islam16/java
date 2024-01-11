package com.Placements.Array;

import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int k= scn.nextInt();
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int j=0;
        int mins=sum;
        for(int i=k;i<n;i++){
            sum-=arr[j++];
            sum+=arr[i];
            mins= Math.min(mins,sum);
        }
        System.out.print(mins);
    }
}