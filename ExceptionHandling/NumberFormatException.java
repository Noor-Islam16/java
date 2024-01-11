package com.ExceptionHandling;

class NFE {
    public static void main(String[] args) {
         String str = "noor";
         try{
             int a = Integer.parseInt(str);
             System.out.println(a);
         }
         catch(NumberFormatException e){
             System.out.println(e);
             System.out.println("String "+str+" cannot be converted to Integer");
         }
    }
}
