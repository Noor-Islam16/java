package com.ExceptionHandling;

class NestedCatchBlock {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }
        catch (Exception e){
            System.out.println("Cannot divide by zero");
            try{
                int a[]={10,20,30};
                System.out.println(a[4]);
            }
            catch (ArrayIndexOutOfBoundsException m){
                System.out.println("Beyond Size of Array");
            }
        }
        System.out.println("Nested Catch");
    }
}
