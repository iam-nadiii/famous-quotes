package com.pluralsight;

import java.util.Scanner;

import static java.lang.Math.random;

public class App {
    public static void main(String[] args) {
        String[] quotes = {
                "The only way to do great work is to love what you do. - Steve Jobs",
                "Success is not final, failure is not fatal: it is the courage to continue that counts. - Winston Churchill",
                "Believe you can and you're halfway there. - Theodore Roosevelt",
                "Don't watch the clock; do what it does. Keep going. - Sam Levenson",
                "Your time is limited, so don't waste it living someone else's life. - Steve Jobs",
                "The future belongs to those who believe in the beauty of their dreams. - Eleanor Roosevelt",
                "It always seems impossible until it's done. - Nelson Mandela",
                "Do what you can, with what you have, where you are. - Theodore Roosevelt",
                "Hardships often prepare ordinary people for an extraordinary destiny. - C.S. Lewis",
                "Keep your face always toward the sunshine—and shadows will fall behind you. - Walt Whitman"
        };

        Scanner input = new Scanner(System.in);
        char keepRunning = 'y';
        int quoteNumber;

        do {
            System.out.println("Choose one: ");
            System.out.println("(1) Enter a number");
            System.out.println("(2) A random quote");
            int userChoice = input.nextInt();

            if (userChoice == 1){
                System.out.print("Enter a number: ");
                quoteNumber = input.nextInt();
            } else {
                quoteNumber = (int) (Math.random()* 9 ) + 1;
            }



            try {
                System.out.println(quotes[quoteNumber]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid index! Please enter a number between 0 and " + (quotes.length - 1));
            }

            System.out.println("Do you want to do this again? (y/n)");
            keepRunning = input.next().charAt(0);

        } while(keepRunning == 'y');


    }
}
