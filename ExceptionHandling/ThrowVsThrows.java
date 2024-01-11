package com.ExceptionHandling;

class ThrowVsThrows {
    void div(int a,int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException();
        }
        else{
            int c = a/b;
            System.out.println(c);
        }
    }
    public static void main(String[] args) {
        ThrowVsThrows t = new ThrowVsThrows();
        try{
            t.div(20,0);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
    }
}
