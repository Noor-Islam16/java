package com.Placements.ConditionsAndLoops;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;
        while(true){
            //taking operator as input
            System.out.println("Enter Operators");
            char op = in.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                //taking input two numbers
                System.out.println("Enter two numbers:");
                int n1 = in.nextInt();
                int n2 = in.nextInt();

                if(op == '+'){
                    ans = n1 + n2;
                }
                if(op == '-'){
                    ans = n1 - n2;
                }
                if(op == '*'){
                    ans = n1 * n2;
                }
                if(op == '/'){
                    if(n2 != 0) {
                        ans = n1 / n2;
                    }
                }
                if(op == '%'){
                    ans = n1 % n2;
                }
            } else if (op == 'x' || op == 'X') {
                break;
            }else{
                System.out.println("Invalid Operation");
            }
            System.out.println(ans);
        }
    }
}
