package com.codewithharry;

public class IncrementDecrement {
    public static void main(String[] args) {
        int i = 57;
        System.out.println("Post Increment:"+ i++);
        System.out.println("Post Incremented Number:"+ i);
        System.out.println("Pre Increment:"+ ++i);
        System.out.println("After Pre Increment:"+ i);
        System.out.println("Post Decrementing the number:"+ i--);//i = 59
        System.out.println("Post Decremented Number:"+ i);
        System.out.println("Pre Decrement:"+ --i);
        System.out.println("Initial Value of i:"+ i);

        //Quick Quiz
        int y = 7;
        System.out.println("The Value will be:"+ ++y * 8);

        //Incrementing Character
        char ch = 'a';
        System.out.println("Incrementing Character:"+ ++ch);
    }
}
