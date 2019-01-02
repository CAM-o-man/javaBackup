
package com.company;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.Math;
public class Main {
    /**
     Author: Connor McDermid
     Lab: 5.1
     Extra: Decimal Rounding
     **/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        heading();
        System.out.println("As part of a new program, the tester will now be able to use their own input in the square method!" +
                "Simply type your first number now! (x^y)");
        int x = input.nextInt();
        System.out.println("Second number now!");
        int y = input.nextInt();
        char f = 'f';
        payRespects(f, x, squares(x, y));
    }
    private static void heading() {
        System.out.println("WELCOME TO METHODCORP!");
        System.out.println("We produce METHODS!");
        System.out.println("They are DIFFERENT than functions! We PROMISE!");
    }
    @SuppressWarnings("DanglingJavadoc")
    private static double squares(int x, int y) {
        double ans = Math.pow(x, y);
        /** Rounding answer to 2 decimal places **/
        DecimalFormat df = new DecimalFormat("*.##");
        df.setRoundingMode(RoundingMode.CEILING);
        return Double.parseDouble(df.format(ans)); //
    }
    private static void payRespects(char f, int x, double y1) {
        int y = (int)y1;
        for (int i = 0; i <= y; i++) {
            for (int a = 1; a <= x; a++) {
                System.out.print(f);
            }
            System.out.println("\n"); //For ensuring that every new set will be printed on a new line.
        }
    }
}
