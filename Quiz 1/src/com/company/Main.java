package com.company;
import java.util.Scanner;
import java.lang.Math.*;

import static java.lang.Integer.parseInt;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	    Scanner input = new Scanner(System.in);
        System.out.println("Please enter two positive integers.");
        int xtmp = input.nextInt();
        int ytmp = input.nextInt();

        if (Math.abs(xtmp) != xtmp) {
            System.out.println("Your first integer is not positive!");
            System.exit(2); //Using Status Code 2 to indicate a shutdown here
        }
        if (Math.abs(ytmp) != ytmp) {
            System.out.println("Your second integer is not positive!");
            System.exit(2);
        }

        if (xtmp == 7) {
            if (ytmp == 11) {
                System.out.println("So I see you'd like a slurpee.");
            }
        }
        //Using Number to try and avoid some BS type incompatibilities. *cough* Division *cough*
        Number x = xtmp;
        Number y = ytmp;

        //Proceeding to calculator, starting with clean method
        CalcHome(x, y);

    }

    public static void CalcHome(Number x, Number y) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to add(A), subtract(S), multiply(M), or divide(D)?");
        String usraction = input.nextLine();
        input.nextLine();
        Number ans = 0;
        switch (usraction) {
            case "A":
                ans = CalcAdd(x, y);
                System.out.println(ans);
                break;
            case "S":
                ans = CalcSub(x, y);
                System.out.println();
                break;
            case "M":
                ans = CalcMult(x, y);
                System.out.println(ans);
                break;
            case "D":
                ans = CalcDiv(x, y);
                System.out.println(ans);
                break;
            default:
                System.out.println("Sorry, that's not an operation I can perform.");
                System.exit(1);
        }
        Thread.sleep(1000);
        Cont(ans);

    }
    public static int CalcAdd(Number x, Number y) {
        int ans = (Integer)x + (Integer)y;
        return ans;

    }
    public static int CalcSub(Number x, Number y) {
        int ans = (Integer)x - (Integer)y;
        return ans;
    }
    public static int CalcMult(Number x, Number y) {
        int ans = (Integer)x * (Integer)y;
        return ans;
    }
    public static double CalcDiv(Number x, Number y) {
        double xdub = (double) x;
        double ydub = (double) y;
        double ans = xdub / ydub;
        return ans;
    }
    public static void Cont(Number ans) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        Number x = ans;
        System.out.println("Input 'R' to reset, otherwise input a second number. Your previous answer is x.");
        String usrin = input.nextLine();
        input.nextLine();
        Number y = null;
        if (usrin.equals("R")) {
            String[] arguments = new String[1];
            main(arguments);
        } else {
            y = parseInt(usrin);
        }
        CalcHome(x, y);

    }

}
