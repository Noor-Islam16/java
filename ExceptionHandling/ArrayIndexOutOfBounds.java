package com.ExceptionHandling;

class AIOOB {
    public static void main(String[] args) {
        try{
            int a[]= {10,20,30,50};
            System.out.println(a[7]);
        }
        catch(ArrayIndexOutOfBoundsException b){
            System.out.println(b);
            System.out.println("Beyond the Size of Array");
        }
    }
}
