package com.ExceptionHandling;

class Handling {
    public static void main(String[] args) {
        try{
            System.out.println("Hello");
            int a = 20, b = 0, c;
            c = a/b;
            System.out.println(c);
            System.out.println("World");
        }
        catch (ArithmeticException e){
            System.out.println("Cannot divide by 0");
        }
        finally{
            System.out.println("This an example of Try Catch and Finally");
        }
        System.out.println("Main Method Ended");
    }
}
