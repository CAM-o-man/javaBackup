package com.company;
import java.util.Scanner;
import java.awt.Desktop;
import java.net.URI;
import java.io.IOException;
import java.net.URISyntaxException;
public class Main {

    public static void main(String[] args) throws InterruptedException, URISyntaxException, IOException {
	Scanner input = new Scanner(System.in);
        System.out.println("Please input the side lengths of your triangle.");
        int sideOne = input.nextInt();
        int sideTwo = input.nextInt();
        int sideThree = input.nextInt();

        if(sideOne == sideTwo && sideTwo == sideThree) {
            System.out.println("YOur triangle is equilateral");
        }
        else if(sideOne == sideTwo || sideTwo == sideThree || sideOne == sideThree) {
            System.out.println("YOur triangle is isosceles");
        }
        else {
            System.out.println("Your triangle is either scalene or not a triangle, or the program has failed.");
        }
        System.out.println("YOu may now proceed to the next task.");
        Thread.sleep(2000);

        camelot.Camelot.rudimentaryCLS();

        Money();
    }

    public static void Money() throws InterruptedException, URISyntaxException, IOException {
        Scanner input  = new Scanner(System.in);
        System.out.println("Please enter a number between 50 and 100");
        int num = input.nextInt();
        if(num >=50 && num <= 100) {
            System.out.println("Congrats! You've just won " + num + " because you're not a terrible person!");
        }
        else if (num < 50) {
            System.out.println("Unfortunately, I'm going to have to FORCE YOU to take more money.");
        }
        else {
            System.out.println("You're a horrible person.");
        }
        Thread.sleep(2000);
        camelot.Camelot.rudimentaryCLS();
        virus();
    }

    public static void virus() throws InterruptedException, URISyntaxException, IOException {
        Scanner input = new Scanner(System.in);
        Desktop d = Desktop.getDesktop();
        System.out.println("This file may contain a virus. Would you like to continue? (Y/N)");
        String usrin = input.nextLine();
        if(usrin.equals("Y")) {
            Thread.sleep(4000);
            //This takes the user to a fake virus site.
            d.browse(new URI("https://geekprank.com/fake-virus/"));
        }
        else if (usrin.equals("N")) {
            System.out.println("This was a PSA fake virus warning. For more information, please read this page.");
            Thread.sleep(4000);
            //This takes the user to a site that informs them about scareware.
            d.browse(new URI("https://www.businessknowhow.com/security/scareware.htm"));
        }
        else {
            System.out.println("Defaulting to NO");
            d.browse(new URI("https://www.businessknowhow.com/security/scareware.htm"));
        }
        Dishonour();
    }


    public static void Dishonour() {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your current average");
        int avg = input.nextInt();
        System.out.println("How many courses are you taking?");
        int cours = input.nextInt();
        System.out.println("Do you have any discipline infractions? (true/false)");
        boolean disc = input.nextBoolean();
        //Nested ifs look terrible but I had to do it.
        if(avg > 90) {
            if(cours >= 5) {
                if(!disc) {
                    System.out.println("Congratulations! You are on the honour roll!");
                }
                else {
                    System.out.println("Sorry, your infractions ruin it for you.");
                }
            }
            else {
                System.out.println("Sorry, you aren't taking enough courses.");
            }
        }
        else {
            System.out.println("Sorry, your grades are too low.");
        }
    }


}
