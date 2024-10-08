package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Hello world!");

        String dice;
        String roll1;
        String roll2;
        int guessedNumber;
        int randomNumber1 = (int) (Math.random() * 10) + 1;
        do {
            System.out.println("What number do I have in mind? ");
            guessedNumber = reader.nextInt();

            if (guessedNumber < randomNumber1) {
                System.out.println("Number is too low");
            } else if (guessedNumber > randomNumber1) {
                System.out.println("Number is too high");
            }
        } while (randomNumber1 != guessedNumber);
        System.out.println("You are correct: " + randomNumber1);

    }
}

