package com.Placements.ConditionsAndLoops;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0); //in.next() used for input string
                                              //trim() is used for removing spaces
        //charAt() is used for located the position of the character index

        //Q: Check Whether it is in Lower Case or Upper Case

        if(ch >= 'a' && ch <= 'z'){
            System.out.println("Lower Case");
        }else{
            System.out.println("Upper Case");
        }
        System.out.println(ch);
    }
}
