/**
 * Author: Connor McDermid
 * Lab 5.2
 * Extra: TBD
 */
package com.company;
import java.util.Scanner;
//import java.text.DecimalFormat;
public class Main {
    //TODO: COme up with an extra.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a number to be doubled.");
        int x = input.nextInt();
        System.out.println(duoble(x));
        System.out.println("DO you want to find the harmonic mean of two numbers? Of course you don't!" +
                "\n Please enter two numbers.");
        int harx = input.nextInt();
        System.out.println(harx);
        int hary = input.nextInt();
        System.out.println(hary);
        System.out.println(harmony(harx, hary));

        //--------------------------------------------------------------------------------------------------------------------------------
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.println("Which number should I cube or square?");
        double usr = input.nextInt();
        System.out.println("Now, should I cube or square it? [C|S]");
        String choice = input.next(); //nextLine() is a bit buggy
        if (choice.equals("C")) {
            System.out.println(cube(usr));
        }
        else if (choice.equals("S")) {
            System.out.println(sqr(usr));
        }
        else {
            System.out.println("One of the options, please.");
        }
    }
    private static int duoble(int x) { //Yes I know it's spelled wrong. That's intentional.
        return x * 2;
    }
    private static double harmony(double x, double y) {
        System.out.println(x);
        x = 1/x;
        System.out.println(x);
        y = 1/y;
        System.out.println(y);
        double z = x + y;
        System.out.println(z);
        double ans =  z/2;
        return ans;
    }
    private static double cube(double x) {
        return Math.pow(x, 3);
    }
    private static double sqr(double x) {
        return Math.pow(x, 2);
    }
    /*private static String decSimp(double x) { //Here I attempt to simplify the decimal down to 2 sig. digits and make it repeating
        String fix = null;
        Double temp = x;
        String dec = temp.toString();
        char number = (char)(dec.indexOf(".") + 2);
        DecimalFormat df = new DecimalFormat("*.##");
        //noinspection SpellCheckingInspection
        Double tempdou = Double.parseDouble(dec);
        df.format(tempdou);
        System.out.println(tempdou + "is tempdou");
        dec = tempdou.toString();
        if (number == dec.charAt(dec.indexOf(".") + 3) && number == dec.charAt(dec.indexOf(".") + 4) && number == dec.charAt(dec.indexOf(".") + 5)) {
            switch (dec.charAt(dec.indexOf(".") + 2)) {
                case '0':
                    break;
                case '1':
                    fix = dec.replaceFirst("1", "1\u0305");
                    break;
                case '2':
                    fix = dec.replaceFirst("2", "2\u0305");
                    break;
                case '3':
                    fix = dec.replaceFirst("3", "3\u0305");
                    break;
                case '4':
                    fix = dec.replaceFirst("4", "4\u0305");
                    break;
                case '5':
                    fix = dec.replaceFirst("5", "5\u0305");
                    break;
                case '6':
                    fix = dec.replaceFirst("6", "6\u0305");
                    break;
                case '7':
                    fix = dec.replaceFirst("7", "7\u0305");
                    break;
                case '8':
                    fix = dec.replaceFirst("8", "8\u0305");
                    break;
                case '9':
                    fix = dec.replaceFirst("9", "9\u0305");
                    break;
                default:
                    System.out.println("Something has happened that shouldn't have. Do some debugging.");
                    System.exit(5);
                    fix = null;
                    break;
            }
        }

        return fix;

    }
    */

}
