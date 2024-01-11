package com.Placements.Array;

public class JugglingAlgorithm {
    public static int gcd(int a, int b){
        if(b == 0)
            return a;
        else
            return gcd(b,a%b);
    }

    public static void rotate(int[] arr, int d, int n){
        int i,j,k,temp;
        for (i = 0; i < gcd(d,n); i++) {
            temp = arr[i];
            j = i;
            while (true) {
                k = j + d;
                if(k >= n)
                    k = k - n;
                if(k == i)
                    break;
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12};
        int m = 3; //number of rotation
        int n = arr.length;

        rotate(arr,m,n);
        System.out.println("Arrays after rotate:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
