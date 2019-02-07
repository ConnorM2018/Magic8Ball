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
        System.out.println("Please ask a question.");
        question = keyboard.nextLine();
        System.out.println("Type a number between 1-100");
        number = keyboard.nextInt();

        if(number<10) {
            System.out.println("Yes.");
        }
        else if(number<20) {
            System.out.println("Probably.");
        }
        else if(number<30) {
            System.out.println("Outlook good.");
        }
        else if(number<40) {
            System.out.println("Outlook not so good.");
        }
        else if(number<50) {
            System.out.println("Signs point to yes.");
        }
        else if(number<60) {
            System.out.println("Signs point to no.");
        }
        else if(number<70) {
            System.out.println("No.");
        }
        else if(number<80) {
            System.out.println("Most unlikely.");
        }
        else if(number<90) {
            System.out.println("Most likely.");
        }
        else if(number<100) {
            System.out.println("Probably not.");
        }
        else {
            System.out.println("Reply hazy, try again later.");
        }
    }
}
