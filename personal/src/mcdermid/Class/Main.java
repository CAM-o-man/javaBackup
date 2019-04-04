package mcdermid.Class;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        String operator = user.nextLine();

        switch (operator) {
            case "+":
                plus();
                break;
            case "-":
                minus();
                break;
            case "*":
                mult();
                break;
            case "/":
                div();
                break;
            default:
                System.out.println("That's not a valid character.");
                System.exit(-1);
        }
    }

    private static void plus() {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println(num1 + num2);
    }

    public static void minus() {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println(num1 - num2);

    }
    public static void mult() {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println(num1 * num2);
    }
    public static void div() {
        Scanner input = new Scanner(System.in);
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        System.out.println(num1 / num2);
    }
}
