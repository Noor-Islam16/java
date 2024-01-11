package com.Placements.Array;

public class UnionintersectionofTwoArrays {
    public static void union(int[] arr1, int[] arr2, int m, int n) {
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j])
                System.out.print(arr1[i++] + " ");
            else if (arr1[i] > arr2[j])
                System.out.print(arr2[j++] + " ");
            else {
                System.out.print(arr2[j++] + " ");
                i++;
            }
        }
        while (i < m)
            System.out.print(arr1[i++]);
        while (j < n)
            System.out.print(arr2[j++]);
    }

    public static void intersection(int[] arr1, int[] arr2, int m, int n) {
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j])
                i++;
            else if (arr1[i] > arr2[j])
                j++;
            else {
                System.out.print(arr2[j++] + " ");
                i++;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,4,5,7};
        int[] arr2 = {2,3,5,6};
        int m = arr1.length;
        int n = arr2.length;

        System.out.println("Union is: ");
        union(arr1,arr2,m,n);

        System.out.println(" ");

        System.out.println("Intersection is:");
        intersection(arr1,arr2,m,n);

    }
}