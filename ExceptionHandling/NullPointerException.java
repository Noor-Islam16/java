package com.ExceptionHandling;

class NPointerException {
    public static void main(String[] args) {
        String str = null;
        try{
            System.out.println(str.toUpperCase()); //java.lang.NullPointerException
        }
        catch(NullPointerException e){
            System.out.println(e);
            System.out.println("Null can't be casted");
        }
    }
}
