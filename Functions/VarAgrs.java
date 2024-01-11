package com.Placements.Functions;

import java.util.Arrays;

public class VarAgrs {
    public static void main(String[] args) {
        fun(12,43,23,21,44,9);
        mul(85,127,"Noor","Muskan");
    }

    static void mul(int a,int b,String ...v){
        System.out.println(a+" "+b+" "+Arrays.toString(v));
    }

    static void fun(int ...v){   //int ...v this means how many integers we are giving we are declaring or, Array of integers
        System.out.println(Arrays.toString(v));
    }
}
