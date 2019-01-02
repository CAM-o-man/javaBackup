package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please choose your conversion: LBS to OZS(L), Minutes to Seconds(M), Months to Weeks(W). Please hit Enter twice.");
        String in = input.nextLine();
        input.nextLine();
        switch (in) {
            case "L":
                System.out.println(PoundsConv());
                break;
            case "M":
                System.out.println(MinsConv());
                break;
            case "W":
                System.out.println(WeekConv());
                break;
            default:
                System.out.println("We're sorry, that isn't a valid input.");
                System.exit(1);
        }

    }
    public static int PoundsConv() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input your pounds.");
        int lbs = input.nextInt();
        int ozs = lbs * 16;
        return ozs;
    }
    public static String MinsConv() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input your minutes.");
        int mins = input.nextInt();
        int hours = mins/60;
        int rem = mins % 60;
        String ans = hours + " hours and " + rem + " minutes";
        return ans;
    }
    public static String WeekConv() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input your weeks.");
        int weeks = input.nextInt();
        int months = weeks / 4;
        int rem = weeks % 4;
        String ans = "roughly " + months + " months and " + rem + " weeks";
        return ans;


    }
}
