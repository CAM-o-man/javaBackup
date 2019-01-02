package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

        System.out.println("Please input the temperature (F)");
        int temp = input.nextInt();
        if (temp < 32) {
            System.out.println("Brrrr. Where's the lodge?");
        }
        else if (temp > 85) {
            System.out.println("Sweat City! Where's the pool?");
        }
        else {
            System.out.println("Now THIS is a temperature I like!");
        }
    }
}
