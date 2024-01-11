package com.ExceptionHandling;

class MultipleCatchBlock {
    public static void main(String[] args) {
        try {
            int a = 10, b = 2, c;
            c = a / b;
            System.out.println(c);

            String str = "noor";
            System.out.println(str.toUpperCase());

            int d[]= {10,20,30};
            System.out.println(d[6]);
        }
        catch (ArithmeticException m){
            System.out.println(m);
            System.out.println("Cannot be divided by 0");;
        }
        catch (NullPointerException n){
            System.out.println(n);
            System.out.println("Null can't be casted");
        }
        catch (ArrayIndexOutOfBoundsException p){
            System.out.println(p);
            System.out.println("Beyond Size of Array");
        }
        catch (Exception q){
            System.out.println("All Types of Exception");
        }
    }
}
