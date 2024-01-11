package com.ExceptionHandling;

class NestedFinally{
    public static void main(String[] args) {
        try{
            String str = "noor";
            System.out.println(str.toUpperCase());
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally{
            try{
                System.out.println(10/0);
            }
            catch (ArithmeticException a){
                System.out.println(a);
            }
            finally{
                System.out.println("Completed");
            }
        }
        System.out.println("Nested Try");
    }
}