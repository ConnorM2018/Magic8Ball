package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Declaring Variables
        Scanner keyboard;
        int number;
        String question;
        keyboard = new Scanner(System.in);

        //initialize
        System.out.println("Welcome to Magic 8 Ball.");
        System.out.print("Please ask a question.");
        question = keyboard.nextLine();
        System.out.println("Type a number between 1-100");
        number = keyboard.nextInt();

        
    }
}
