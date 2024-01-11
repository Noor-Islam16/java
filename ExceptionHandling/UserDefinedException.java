package com.ExceptionHandling;

class InvalidAgeException extends Exception{
    InvalidAgeException(String msg){
        System.out.println(msg);
    }
}

class UserDefinedException {
    public static void main(String[] args) {
        try{
            vote(12);
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
    public static void vote(int age) throws InvalidAgeException {
        if(age<18){
            throw new InvalidAgeException("Not eligible for voting"); //user defined exception
        }
        else{
            System.out.println("Eligible for voting");
        }
    }
}