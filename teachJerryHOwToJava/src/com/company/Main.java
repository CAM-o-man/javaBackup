package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lol = 1;
        System.out.println("Enter your age");
        int age = input.nextInt();
        if (age <= 13) {
            System.out.println("No, fuck you.");
        }
        else {
            System.out.println("Come on in.");
        }
        switch (age) {
            case 1:
                System.out.println("you're 1");
                break;
            case 2:
                System.out.println("you're 2");
                break;
            default:
                System.out.println("Fuck off");
        }
        while (age <18) {
            System.out.println("You're still a kid.");
            age++;
        }
        for (int i = 0; i <10; i++) {
            System.out.println("lol");
        }
        do {
            //code
        } while (true);
    }
}
