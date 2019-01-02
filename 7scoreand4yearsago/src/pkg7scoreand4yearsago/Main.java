/*

 */
package pkg7scoreand4yearsago;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author cam-o
 */

public class Main {

    
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner (System.in);
        
        int year, score, leftover;
        
        System.out.println("Enter year:");
        
        year = input.nextInt();
        
        year -= 1776;
        
        score = year/20;
        leftover = year % 20;
        
        
        System.out.println(score + " score and " + leftover + 
                " years ago, the Declaration of Independence was a thing");
        
        howtallareyou();
        
    }
    public static void howtallareyou() {
        System.out.println("How tall are you, in integer inches?");
        Scanner input = new Scanner (System.in);
        int inch = input.nextInt();
        
        int feet = inch/12;
        
        int leftover = inch%12;
        
        int metres = feet/3;
        
        System.out.println("You are " + feet + "'" + leftover + " or roughly " + metres + " metres.");
        Raiders();
    }
    public static void Raiders() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("You know that movie Raiders of the Lost Ark? Yeah,"
                + " I don't either. In the opening scenes, Indiana Jones or "
                + "someone like \n"
                + "that takes a golden figurine from some dungeon or other"
                + " place. Guess the weight of that figurine."
                + " In pounds please.");
        
        int pounds = input.nextInt();
        
        int ounces = pounds * 16;
        
        int kilogrammes = pounds / 3;
        
        System.out.println("Although I'm sure you don't care, your answer was"
                + " also " + ounces + " ounces and " 
                + kilogrammes + " kilogrammes.");
        Milespergallon();
    }
    public static void Milespergallon() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your average commute length, in miles.");
        
        int Miles = input.nextInt();
        
        System.out.println("Please enter your average fuel purchases in a week, in gallons.");
        
        int Gallons = input.nextInt();
        
        double MPG = (Miles * 10) / Gallons;
        
        System.out.println("YOur MPG is " + MPG);
        
        Bond();
        
        
    }
    public static void Bond() {
        Scanner input = new Scanner(System.in);
        int bond = 007;
        
        int bondx = bond * 10;
        
        double bonded = bond;
        
        double cubed = 3;
        
        double bond3 = Math.pow(bonded, cubed);
        
        System.out.println("If James Bond is 00 " + bond + " then 10 of him would be 0 " + bondx + " and bond cubed would be " + bond3);
        
        hairdye();
    }
    public static void hairdye() {
        Scanner input = new Scanner(System.in);
        boolean prob = new Random().nextInt(1) == 0;
        
        System.out.println("Stop! Who cross the Bridge of Death must answer me these questions three, 'ere the other side he see.");
        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("What is your quest?");
        String quest = input.nextLine();
        if(prob == false) {
            System.out.println("What is your favourite colour?");
            String colour = input.nextLine();
            System.out.println("Well, off you go.");
            System.exit(0);
        }
        else {
            System.out.println("What is the airspeed velocity of an unladen swallow?");
            String airspeed = input.nextLine();
            if("What do you mean? An African or a European swallow?".equals(airspeed)) {
                System.out.println("What? I-I don't know that! *falls*");
                
            }
            else {
                System.out.println("You fall in the pit and die.");
                System.exit(0);
            }
        }
        
        
    }
}
