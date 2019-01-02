package com.company;
import java.util.Scanner;
public class Globals {
    public interface GlobalVars {
        int initcode = 0;
    }
    public static String  Initialization() throws InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.println("IOT for Kids");
        Thread.sleep(3000);
        System.out.println("What is your name?");
        String name = input.nextLine();
        return name;

    }
}
