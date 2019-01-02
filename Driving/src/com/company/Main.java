package com.company;
import java.util.Scanner;
import java.awt.Desktop;
import java.net.URI;
import java.io.IOException;
import java.net.URISyntaxException;
public class Main {
    public static void main(String[] args) throws InterruptedException, URISyntaxException, IOException{
	Scanner input = new Scanner(System.in);
        System.out.println("Please input your age.");
        int age = input.nextInt();
        if (age > 16) {
            System.out.println("It's scary that you're old enough to drive.");
        }
        else {
            int yrsuntil = 16 - age;
            System.out.println("It will be " + yrsuntil + " years until you can terrorize the populace in a speeding death trap!");

        }
        odd();
    }

    public static void odd() throws InterruptedException, URISyntaxException, IOException{
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a positive integer.");
        int posint = input.nextInt();
        if ((posint % 2) == 1) {
            System.out.println("Your number is odd, and so are you.");

        }
        else {
            System.out.println("YOur number is even.");
        }
        Telegram();
    }
    public static void Telegram() throws InterruptedException, URISyntaxException, IOException{
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the number of words in your telegram.");
        int mot = input.nextInt();
        if (mot <= 15) {
            System.out.println("That'll be 8.50 USD please. Would you like to send it now?");
            String now = input.nextLine();
            System.out.println("It's the first one.");
            now = input.nextLine();
            input.nextLine();
            if (now.equals("Y")) {
                Send();
            }
        }
        else {
            double cost = (mot - 15) * .25;
            System.out.println("That'll be " + cost + " USD. Would you like to send it now?");
            String sendnow = input.nextLine();
            if (sendnow == "Y") {
                Send();
            }
        }
        Sorter();
    }
    public static void Send() throws InterruptedException, URISyntaxException, IOException{
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the destination email.");
        String emil = input.nextLine();
        System.out.println("Please input the subject line, BUT THERE MUST BE NO SPACES! IF you need to add a space, type %20 INSTEAD!");
        String subj = input.nextLine();
        System.out.println("Please input the message body, BUT THERE MUST BE NO SPACES! THE SAME RULE APPLIES!");
        String body = input.nextLine();
        System.out.println("Please confirm the sending of the email.");

        Desktop d = Desktop.getDesktop();
        Thread.sleep(2000);

        d.browse(new URI("mailto:"+emil+"?subject="+subj+"&body="+body));

    }
    public static void Sorter() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input your numbers.");
        int first = input.nextInt();
        int Second = input.nextInt();
        if (first == Second) {
            System.out.println("They're equal.");
        }
        else if (first > Second) {
            System.out.println(first + "\n" + Second);
        }
        else {
            System.out.println(Second + "\n" + first);
        }
        Museum();
    }
    public static void Museum() {
        Scanner input = new Scanner(System.in);
        System.out.println("HOW OLD ARE YOU????? TELL ME NOW!!!!");
        int age = input.nextInt();
        if (age <= 5) {
            System.out.println("You enter free!");
        }
        else if (age >= 65) {
            System.out.println("THat'll be 1.50 USD please.");
        }
        else {
            System.out.println("That'll be 2.50 USD please.");
        }
        Birth();
    }
    public static void Birth() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input your birth year. If you lie, we are liable to shoot you.");
        int year = input.nextInt();
        if (year <= 1970) {
            System.out.println("YOu qualify for the Jukebox Rally.");
        }
        System.out.println("Pleas input your favourite fruit.");
        String fruit = input.nextLine();
        input.nextLine();
        if (fruit.equals("strawberry")) {
            System.out.println("Strawberry Fields Forever! RISE UP FOR THE STRAWBERRY FIELDS!!!!");
        }
        else {
            System.out.println("Bye, Bye, Miss American Pie. Let them eat CAKE!");
        }
    }
}
