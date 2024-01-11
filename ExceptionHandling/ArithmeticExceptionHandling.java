package com.ExceptionHandling;

class AExceptionHandling {
    public static void main(String[] args) {
        int a =10, b = 0, c;
        //c = a/b; //java.lang.ArithmeticException this Exception occurs because we are dividing 10/0 and we get this exception
        try{  // if there is no exception than try block will be executed and catch block will not be executed
            c = a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e){  //if there is exception in c = a/b then catch block will be executed and try will not.
            System.out.println(e);
            System.out.println("Since 10 cant be divided by 0");
        }
    }
}
