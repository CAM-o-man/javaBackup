package com.company;
import java.util.Scanner;

public class Main {
    int iterations = 0;
    int milestraveled = 0;
    int arsoncommitted = 0;

    public static void main(String[] args) {
        Main main = new Main(); //Need to reference global variables, need non-static context
        main.main2();
    }
    public void main2() {
        Scanner input = new Scanner(System.in);
        int weeks = 1;
        int miles;
        miles = 0;
        do {
            if (iterations == 0) {
                System.out.println("Please enter the miles you traveled today.");
                miles = input.nextInt();
                if (miles == -99) {
                    break; //Do whiles don't break until code block is completed, need to eliminate this.
                }
            } else {
                System.out.println("How many miles have you driven THIS week?");
                miles = input.nextInt();
                if (miles == -99) {
                    break; //See above
                }
            }
            System.out.println("HOW MUCH GAS HAVE YOU BOUGHT?");
            int arson = input.nextInt();

            milestraveled += miles; //Saving value of miles as it'll be reset next loop
            arsoncommitted += arson;
            int mpg = milestraveled / arsoncommitted;
            System.out.println(mpg + " is your MPG");
            weeks++;
            iterations++;

        } while (miles != -99);
        miles += 99;
        System.out.println("YOu travelled " + milestraveled + " miles in " + weeks + " weeks and bought " + arsoncommitted + " gallons of gas.");
        shutdown();
    }
    public void shutdown() {  //Because I can
        System.out.println("Thank you for using Vacation Tracker." +
                "\n Shutting down.");
        System.out.println("        ROFL:ROFL:LOL:ROFL:ROFL\n" +
                "         _________||_________\n" +
                " L      /                 [ O\\\n" +
                "LOL=====                  |_|_\\\n" +
                " L     B|O M B                 )\n" +
                "      F |______,-------¬_____/\n" +
                "     T //    }-OMGROCKET))\n" +
                "    W // _______||_||_________/_/");
    }
}
