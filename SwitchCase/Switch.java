package com.Placements.SwitchCase;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit) {
            case "Mango" -> System.out.println("King of fruit");
            case "Apple" -> System.out.println("Sweet Red Fruit");
            case "Orange" -> System.out.println("Round Fruit");
            default -> System.out.println("Invalid Fruit");
        }
    }
}
