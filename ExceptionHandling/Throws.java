package com.ExceptionHandling;

class Throws {
    public static void main(String[] args) throws ArithmeticException{
        try{
            int a = 10, b = 0, c;
            c = a / b;
            System.out.println(c);
        }catch (ArithmeticException e){
            System.out.println(e);
        }
    }
}
