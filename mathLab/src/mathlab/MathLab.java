/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathlab;
import java.util.Scanner;
/**
 *
 * @author Connor McDermid
 * @block 1A
 */
public class MathLab {
    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the number of players:");
        int Players = input.nextInt();
        int Teams = Players / 7;
        int LeftOver = Players % 7;
        System.out.println("You will have " + Teams + " teams and " + LeftOver + " leftover players.");
        Thread.sleep(1000);
        Digits();
        Sum();
        NoLimits();
    }
    public static void Digits() throws InterruptedException {
        System.out.println("Please input a 2-digit number.");
        Scanner input  = new Scanner(System.in);
        String Number = input.nextLine();
        char char1, char2;
        char1 = Number.charAt(0);
        char2 = Number.charAt(1);
        
        System.out.println("YOur first digit is " + char1 + " and your second digit is " + char2);
        Thread.sleep(1000);
    }
    public static void Sum() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a three-digit number.");
        String Number = input.nextLine();
        char char1, char2, char3;
        char1 = Number.charAt(0);
        char2 = Number.charAt(1);
        char3 = Number.charAt(2);
        int sum = char1 + char2 + char3;
        System.out.println("Your first number is " + char1 + "\n Your second number is " + char2 + "\n and your third number is " + char3 + "\n"
                + "The sum of that is " + sum);
    }
    public static void NoLimits() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a number.");
        String Number = input.nextLine();
        char[] chars = new char[0];
        for(int i = 1; i <= Number.length(); i++) {
            chars[i-1] = Number.charAt(i-1);
        }
        System.out.println(chars);
    }
    
}
