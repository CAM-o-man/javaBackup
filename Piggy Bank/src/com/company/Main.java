package com.company;
import java.util.Scanner;
public class Main implements Globals.GlobalVars {
    double balance;
    public static void main(String[] args) throws InterruptedException {
        /*
        Scanner input = new Scanner(System.in);

        String softwaretitle = "IOT for Kids";
        System.out.println(softwaretitle);
        Thread.sleep(4000);
        //for (i = 0; i == 0; i++) {
            //balance = 0.00;
            //System.out.println("Initial Setup");
            //System.out.println("Hello! What's your name?");
            //final String name = input.nextLine();
            //System.out.println("Hello " + name);
            //System.out.println("Your balance is" + balance);


        //}
        if (balance == null) {
            balance = 0.00;
        }
        System.out.println("Your balance is " + balance);
        System.out.println("Would you like to add more? Y/N");
        String addmore = input.nextLine();

        if (addmore.equals("Y")) {
            Main main = new Main();
            balance = main.addbal(balance);
        }
        else {
            System.out.println("Have a nice day!");
            System.exit(0);
        }
        System.out.println("Your balance is " + balance);
        System.out.println("How many weeks have you saved for?");
        int weeks = input.nextInt();
        double predictedBal = balance / weeks;
        System.out.println("At this rate, by next week you'll have " + predictedBal);
        standby();
        */
        Main main = new Main();
        main.main2();
    }

    public void main2() throws InterruptedException {
        Scanner input = new Scanner(System.in);

        String softwaretitle = "IOT for Kids";
        System.out.println(softwaretitle);
        Thread.sleep(4000);
        //for (i = 0; i == 0; i++) {
        //balance = 0.00;
        //System.out.println("Initial Setup");
        //System.out.println("Hello! What's your name?");
        //final String name = input.nextLine();
        //System.out.println("Hello " + name);
        //System.out.println("Your balance is" + balance);


        //}
        if (initcode == 0) {
            Globals.Initialization();
        }
        System.out.println("Your balance is " + balance);
        System.out.println("Would you like to add more? Y/N");
        String addmore = input.nextLine();

        if (addmore.equals("Y")) {
            Main main = new Main();
            balance = main.addbal(balance);
        }
        else {
            System.out.println("Have a nice day!");
            System.exit(0);
        }
        System.out.println("Your balance is " + balance);
        System.out.println("How many weeks have you saved for?");
        int weeks = input.nextInt();
        double predictedBal = (balance / weeks) + balance;
        System.out.println("At this rate, by next week you'll have " + predictedBal);
        standby();
    }
    public double addbal(double balance) {
        Scanner input = new Scanner(System.in);
        //double pennies = 0.01;
        //double nickels = 0.05;
        //double dimes = 0.10;
        //double quarters = 0.25;
        //double halfdollar = 0.50;
        //double dollar = 1.00;

        System.out.println("How many pennies did you add?");
        double penniesAdded = input.nextInt() * 0.01;
        System.out.println("How many nickels?");
        double nickelsAdded = input.nextInt() * 0.05;
        System.out.println("How many dimes?");
        double dimesAdded = input.nextInt() * 0.10;
        System.out.println("Quarters?");
        double quartersAdded = input.nextInt() * 0.25;
        System.out.println("How many 50 cent coins?");
        double halfDollarsAdded = input.nextInt() * 0.50;
        System.out.println("How many dollar coins?");
        double DollarsAdded = input.nextInt() * 1.00;

        double valueAdded = penniesAdded + nickelsAdded + dimesAdded + quartersAdded + halfDollarsAdded + DollarsAdded;

        balance += valueAdded;

        return balance;




    }
    //This is so InitialSetup doesn't run every time the bank is started up. Instead it waits in standby mode.
    public static void standby() throws InterruptedException {
        Scanner input = new Scanner(System.in);
        input.nextLine();
        String[] arguments = new String[] {"123"};
        Main.main(arguments);
    }




}
