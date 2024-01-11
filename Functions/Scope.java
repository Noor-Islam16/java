package com.Placements.Functions;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        { //block scope
            //   int a = 85;        //already initialised outside block in the main().
            a = 100; //reassign the original ref variable to some other value
            System.out.println(a);
            int c = 30;
            //values initialised in this block, will remain in this block
        }
        System.out.println(a);
        //  System.out.println(c);   //cannot use outside the block

        //scoping in for loops
        for(int i =1; i<4;i++){
//            System.out.println(i);
            int num = 86;
          a = 1000;
        }
        System.out.println(a);
    }
    static void random(int marks){  //method/funtion scope
        int num = 127;
        System.out.println(num);
        System.out.println(marks);
    }
}
