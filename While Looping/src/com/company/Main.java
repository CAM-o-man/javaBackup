package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i = 10;
        while (i > 0) {
            System.out.println(i--);
        }
        oddInts();
    }
    public static void oddInts() {
        System.out.println("\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n");
        int x = 5;
        while (x <= 51) {
            System.out.println(x);
            x += 2;

        }
        Name();
    }
    public static void Name() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input your name.");

        String name = input.nextLine();
        input.nextLine();
        char[] nameChars = new char[name.length()];
        int x = 0;
        while (x < name.length()) {
            try {
                nameChars[x] = name.charAt(x);
                x++;
            } catch (Exception e) {
                System.out.println("Yeah, it's failing right here.");
                throw e;
            }
        }
        for (int i = 0; i < name.length(); i++) {
            int l = 1;
            System.out.println(l + "." + "\r" + nameChars[i]);
            l++;

        }

    }
}
