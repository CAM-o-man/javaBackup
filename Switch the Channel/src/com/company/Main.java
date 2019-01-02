package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	TV();
	Grades();
	Number();
    }
    public static void TV() { //Code for this just copy-pasted from previous lab
        Scanner input = new Scanner(System.in);
        System.out.println("Please input your favourite cable channel.");
        int channelnum = input.nextInt();
        switch (channelnum) {
            case 2:
                System.out.println("Channel 2 got top ratings last week!");
                break;
            case 4:
                System.out.println("Channel 4 shows primarily news!");
                break;
            case 6:
                System.out.println("Channel 6 shows old movies!");
                break;
            case 8:
                System.out.println("Channel 8 covers local events!");
                break;
            case 11:
                System.out.println("Channel 11 is public broadcasting!");
                break;
            default:
                System.out.println("Yeah, no, that's not a channel.");

        }
    }
    public static void Grades() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a letter grade for the Automatic Teacher Criticism Machine");
        String Grade = input.nextLine();
        input.nextLine();
        switch (Grade) {
            case "A":
                System.out.println("You're doing great work!");
                break;
            case "B":
                System.out.println("You're doing good work!");
                break;
            case "C":
                System.out.println("You're doing par work.");
                break;
            case "D":
                System.out.println("You're going to need to try a little harder.");
                break;
            case "F":
                System.out.println("Please see me after class.");
                break;
            default:
                System.out.println("Yeah, no, that's not a letter grade. The Automatic Teacher Criticism Machine only accepts letter grades.");
                break;
        }
    }
    public static void Number() {
        Scanner input = new Scanner(System.in);
        String lowodd = "Your number is a low odd number";
        String loweven = "Your number is a low even number";
        String middleodd = "Your number is the middle odd number";
        String middleeven = "Your number is the middle even number";
        String highodd = "Your number is a high odd number";
        String higheven = "YOur number is a high even number";
        System.out.println("Please input a number between 1 and 10 inclusive.");
        int num = input.nextInt();
        switch (num) {
            case 1: //For some reason, 1 || 3 is not valid. Apparently OR cannot be applied to integers
                System.out.println(lowodd);
                break;
            case 2:
                System.out.println(loweven);
                break;
            case 3:
                System.out.println(lowodd);
                break;
            case 4:
                System.out.println(loweven);
                break;
            case 5:
                System.out.println(middleodd);
                break;
            case 6:
                System.out.println(middleeven);
                break;
            case 7:
                System.out.println(highodd);
                break;
            case 8:
                System.out.println(higheven);
                break;
            case 9:
                System.out.println(highodd);
                break;
            case 10:
                System.out.println(higheven);
                break;
            default:
                System.out.println("That's not a valid number.");

        }
    }
}
