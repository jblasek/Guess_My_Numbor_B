package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int guessingNumber = 50;
        System.out.println("Enter your secret number");
        int yourGuess = 0;
        Scanner keyboard = new Scanner(System.in);
        yourGuess = keyboard.nextInt();

        String lower = "lower";
        String higher = "higher";
        String correct = "yes";
        while (true) {

            System.out.println("My guess is " + guessingNumber + ". Is my guess higher or lower?");

            String highOrLow = "";

            highOrLow = keyboard.next();

            if (highOrLow.equals(correct)) {
                System.out.println("I guessed your number!");
                System.exit(0);

                if (highOrLow.equals(lower)) {

                    int previousGuess = guessingNumber;
                    System.out.println("Ok, I will guess a lower number.");

                    guessingNumber = (int) (Math.random() * 100 + 1);

                    if (guessingNumber >= previousGuess) {
                        while (guessingNumber >= previousGuess) {
                            guessingNumber = (int) (Math.random() * 100 + 1);
                        }
                    }

                    if (highOrLow.equals(correct)) {
                        System.out.println("I guessed your number!");
                        System.exit(0);
                    }

                } else if (highOrLow.equals(higher)) {

                    int previousGuess = guessingNumber;
                    System.out.println("Ok, I will guess a higher number.");

                    guessingNumber = (int) (Math.random() * 100 + 1);

                    if (guessingNumber <= previousGuess) {
                        while (guessingNumber <= previousGuess) {
                            guessingNumber = (int) (Math.random() * 100 + 1);
                        }
                    }

                    if (highOrLow.equals(correct)) {
                        System.out.println("I guessed your number!");
                        System.exit(0);
                    }


                } else {
                    System.out.println("Sorry, I do not know what you mean.");
                }
            }
        }
    }
}
