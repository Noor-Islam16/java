package com.codewithharry;

import java.util.Scanner;

public class PracticeSet_19_Pr06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String website = sc.next();
        if(website.endsWith(".org")){
            System.out.println("Organizational Website");
        }
        else if(website.endsWith(".com")) {
            System.out.println("Commercial Website");
        }
        else if(website.endsWith(".in")) {
            System.out.println("Indian Website");
        }

    }
}
