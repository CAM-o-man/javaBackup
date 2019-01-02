package com.company;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("The computer is thinking of a number between 0 and 1 inclusive. Or so I'm told. Anyway, your job is to guess the number.");
        int randint = ThreadLocalRandom.current().nextInt(1, 100 + 1);
        int iterations = 0;
        int userguess;
        do {
            System.out.println("Please enter your guess.");
            userguess = input.nextInt();
            iterations++;
            if (userguess == randint) {
                System.out.println("Congratulations! You've guessed the number!");
                if (iterations != 1) {
                    System.out.println("It took you " + iterations + " tries!");
                } else {
                    System.out.println("It took you one try! Good job!");
                }
            } else {
                if (userguess > randint) {
                    System.out.println("Nope! Too high!");
                } else {
                    System.out.println("Nope! Too low!");
                }
            }
        } while (userguess != randint);
    }
}
