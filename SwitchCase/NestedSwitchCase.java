package com.Placements.SwitchCase;

import java.util.Scanner;

public class NestedSwitchCase {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

        switch (empID) {
            case 1 -> System.out.println("Noor");
            case 2 -> System.out.println("Muskan");
            case 3 -> {
                System.out.println("Fuzail");
                switch (department) {
                    case "IT" -> System.out.println("IT Dept");
                    case "Management" -> System.out.println("Management Dept");
                    default -> System.out.println("No dept");
                }
            }
            default -> System.out.println("No Employee");
        }

    }
}
