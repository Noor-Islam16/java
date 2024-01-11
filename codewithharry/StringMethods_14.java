package com.codewithharry;

public class StringMethods_14 {
    public static void main(String[] args) {
        String name = "Noor";
        int value = name.length(); // Returns length of string
        String ls = name.toLowerCase();
        String ts = name.toUpperCase();
        System.out.println(value);
        System.out.println(ls);
        System.out.println(ts);

        String nonTrimmedString="        Noor      ";
        System.out.println(nonTrimmedString.trim());

        System.out.println(name.substring(2)); //It prints from index number start to last in this case it is 2 and Noor it is print or
        System.out.println(name.substring(0,3));//It prints from start index and exclude end index
        System.out.println(name.replace('r','p'));
        System.out.println(name.replace("or","pe"));
        System.out.println(name.startsWith("No"));
        System.out.println(name.endsWith("No"));
        System.out.println(name.charAt(3));
        System.out.println(name.indexOf("o"));
        System.out.println(name.indexOf("or",1));
        System.out.println(name.lastIndexOf("o"));
        System.out.println(name.lastIndexOf("N",2));
        System.out.println(name.equals("Noor"));
        System.out.println(name.equalsIgnoreCase("nOoR"));

        //Escape Sequence
        System.out.println("I am Escape Sequence \" You Know");
        System.out.println("I am Escape Sequence \n  You Know");
        System.out.println("I am Escape Sequence \t You Know");
    }
}
