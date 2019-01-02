package com.company;

import java.util.Scanner;


public class classThatWorks {
    int LordQuantity;
    int DentistQuantity;
    int KidsQuantity;
    double LordCost;
    double DentistCost;
    double KidsCost;
    public void main2() {
        Scanner input = new Scanner(System.in);

        //Getting values for movies
        String Lord_name = "Lord of the Ringdings";
        String Dentist_name = "Dennis the Dentist Menace";
        String Kids_name = "Spy Kids Aged 52";
        //double Lord_Price = 29.95;
        //double Dentist_price = 34.05;
        //double Kids_price = 18.96;
        //int Lord_num = 12;
        //int Dentist_num = 23;
        //int Kids_num = 18;
        System.out.println("Please input the price of " + Lord_name);
        LordCost = input.nextDouble();
        System.out.println("Please input the price of " + Dentist_name);
        DentistCost = input.nextDouble();
        System.out.println("Please input the price of " + Kids_name);
        KidsCost = input.nextDouble();

        System.out.println("Please input the stock of" + Lord_name);
        LordQuantity = input.nextInt();
        System.out.println("Please input the value of " + Dentist_name);
        DentistQuantity = input.nextInt();
        System.out.println("Please input the value of " + Kids_name);
        KidsQuantity = input.nextInt();


        //Getting Total Values
        double Tapes_value = LordCost + DentistCost + KidsCost;
        int Tapes_num = LordQuantity + DentistQuantity + KidsQuantity;

        //Printing Values
        System.out.println(Tapes_value + " is the total value of our tapes.");
        System.out.println(Tapes_num + " is the total number of tapes in storage.");

        //User Input Step
        System.out.println("Please input next step."
                + "/n Type 'Exit' to exit."
                + "/n Type 'Interface' to change values in the above table.");

        String userInput = input.nextLine();

        if (userInput.equals("Exit")) {
            System.exit(0);
        } else if (userInput == "Interface") {
            Interface();
        }
    }

    public void Interface() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the interface. What action would you like to perform?" +
                "/n Type 'C' to change the cost of a movie." +
                "/n Type 'A' to change the quantity of tapes." +
                "/n Type 'E' to exit.");
        //Finding requested action
        String userInput = input.nextLine();

        if (userInput == "E") {
            System.exit(0);
        } else if (userInput.equals("A")) {
            System.out.println("What movie quantity would you like to change?");
            String userMovie = input.nextLine();
            System.out.println("What would you like to change it to?");
            int userQuantity = input.nextInt();

            changeQuantity(userMovie, userQuantity);
        } else if (userInput.equals("C")) {
            System.out.println("What movie cost would you like to change?");
            String userMovie = input.nextLine();
            System.out.println("What would you like to change it to?");
            int userCost = input.nextInt();
            changeCost(userMovie, userCost);
        }
    }

    public int changeQuantity(String userMovie, int userQuantity) {
        //Changing global variables to change interface
        if (userMovie == "Lord of the Ringdings") {
            LordQuantity = userQuantity;
            return LordQuantity;
        } else if (userMovie.equals("Dennis the Dentist Menace")) {
            DentistQuantity = userQuantity;
            return DentistQuantity;
        } else if (userMovie.equals("Spy Kids Aged 52")) {
            KidsQuantity = userQuantity;
            return KidsQuantity;
        } else {
            System.out.println("AN error has occurred. Please contact your system administrator.");
        }
        return userQuantity;
    }

    public double changeCost(String userMovie, double userCost) {
        //changing globals to change interface
        if (userMovie == "Lord of the Ringdings") {
            LordCost = userCost;
            return LordCost;
        } else if (userMovie == "Dennis the Dentist Menace") {
            DentistCost = userCost;
            return DentistCost;
        } else if (userMovie == "Spy Kids Aged 52") {
            KidsCost = userCost;
            return KidsCost;
        } else {
            System.out.println("An error has occurred. Please contact your system administrator.");
        }


        return userCost;
    }
}


