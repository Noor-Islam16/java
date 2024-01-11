package com.codewithharry;

public class PrecedenceAssociativity {
    public static void main(String[] args) {
     //   int a = 6*5-34/2;
        /* Highest Precedence goes to * and / they are then evaluated to left to right associativity
           = 30-34/2
           = 30-17
           =13
         */
     //   int b = 60/5-34*2;
        /* Associativity
           = 12-34*2
           = 12-68
           = -56
         */
     //   System.out.println(a);
     //   System.out.println(b);
        // Quick Quiz
        double x = 6;
        double y = 1.2;
        double k = x * y / 2;
        System.out.println(k);

        double b = 1;
        double a = 5;
        double c = 4;
        double r = (b * b - 4 * a * c) / (2 * a);
        System.out.println(r);
    }
}
