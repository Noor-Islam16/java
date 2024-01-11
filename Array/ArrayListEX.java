package com.Placements.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEX {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Syntax
        ArrayList<Integer> list = new ArrayList<>(10);

//        list.add(85);
//        list.add(127);
//        list.add(128);
//        list.add(86);
//        System.out.println(list);
//
//        list.set(2,77);
//        System.out.println(list);
//
//        list.remove(2);
//        System.out.println(list);

        for (int i = 0; i<5; i++){
            list.add(in.nextInt());
        }
        // to get any item at any index

        for (int i = 0; i<5; i++){
            System.out.println(list.get(i)); // pass index here, list[index] synatx will return the value of that index
        }
        System.out.println(list);
    }
}
