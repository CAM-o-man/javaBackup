/*
 * Author: Connor McDermid
 * Block: A1
 * Assignment: Lab 2.4
 */
package javaapplication8;
import java.util.Scanner;
import java.math.*;
/**
 *
 * @author cam-o
 */
public class JavaApplication8 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("How many poles do you want?");
        Scanner input = new Scanner(System.in);
        //Find volume of 1 pole
        double vol1 = Math.PI * 1.5 * 5;
        int polenum = input.nextInt();
        //FInd volume of all poles
        double vol2 = vol1 * polenum;
        //Find volume in yards3
        double vol3 = vol2 / 27;
        //Find the cost
        double money = vol3 * 12.98;
        System.out.println("$" + " " + money);
        System.out.println("Now that you see the price, do you want to perhaps rethink building that?");
        Pythagoras();
    }
    public static void Pythagoras() {
            System.out.println("Please input an integer values m and n such that m > n.");
            Scanner input = new Scanner(System.in);
            int m = input.nextInt();
            int n = input.nextInt();
            
            double a = Math.pow(m, 2) - Math.pow(n, 2);
            double b = 2 * m * n;
            double c = Math.pow(m, 2) + Math.pow(n, 2);
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
    }
}
