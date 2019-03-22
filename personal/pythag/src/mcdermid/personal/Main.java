package mcdermid.personal;

//imports
import org.jetbrains.annotations.NotNull;

import java.util.Scanner;
import java.lang.Math;

/**
 * @author cam-o
 * This is simply a program designed to complete the Pythagorean theorem, given two values.
 * It was reallu only made to save me time.
 */
public class Main {
    /**
     * Sort of the 'hub', if you will. This takes user input and decides which functions to execute.
     * @param args N/A
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the side letter you would like to solve for.");
        String user = input.nextLine();
        switch (user) {
            case "a":
                System.out.println("Side a is " + solvea());
                break;
            case "b":
                System.out.println("Side b is" + solveb());
                break;
            case "c":
                System.out.println("Side c is" + solvehypot());
                break;
            default:
                System.out.println("An error has occurred.");
                System.exit(-1);
        }
    }

    /**
     * This is called when main detects the user wants to solve for A. Returns the value of A.
     * @return A, the shortest leg of the right triangle.
     */
    @SuppressWarnings("Duplicates")
    private static String solvea() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input b.");
        int b = input.nextInt();
        System.out.println("Now please input c.");
        int c = input.nextInt();
        double a = Math.sqrt(Math.pow(c, 2) - Math.pow(b, 2));
        if (a == Math.floor(a) && !Double.isInfinite(a)) {
            @SuppressWarnings("UnnecessaryLocalVariable") final String s = Integer.toString((int) a);
            return s;
        } else {
            return "\u221A" + (Math.pow(c, 2) - Math.pow(b, 2));
        }
    }

    /**
     * This is called when main detects that the user wants to solve for b.
     * @return B, the longest leg of the right triangle.
     */
    @SuppressWarnings("Duplicates")
    private static String solveb() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a.");
        int a = input.nextInt();
        System.out.println("Please input c.");
        int c = input.nextInt();
        double b = Math.sqrt(Math.pow(c, 2) - Math.pow(a, 2));
        if (b == Math.floor(b) && !Double.isInfinite(b)) {
            @SuppressWarnings("UnnecessaryLocalVariable") final String s = Integer.toString((int) b);
            return s;
        } else {
            return "\u221A" + (Math.pow(a, 2) - Math.pow(c, 2));
        }
    }

    /**
     * Called when main detects the user wants to solve for c.
     * @return C, the hypotenuse of the right triangle.
     */
    @NotNull
    private static String solvehypot() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a.");
        int a = input.nextInt();
        System.out.println("Please input b.");
        int b = input.nextInt();
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        if (c == Math.floor(c) && !Double.isInfinite(c)) {
            return Integer.toString((int)c);
        } else {
            return "\u221A" + (Math.pow(a, 2) + Math.pow(b, 2));
        }
    }
}
