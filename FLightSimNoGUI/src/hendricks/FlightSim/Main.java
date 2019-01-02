/**************************************
 * Author: Connor McDermid
 * Lab: 4.5
 * Extra: Arraylists and enhanced for loops
 *************************************/
package hendricks.FlightSim;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
String vehicleName;
int vehicleID; //Creating globals
ArrayList<Integer> mods = new ArrayList<Integer>();
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("[B]limp, [H]elicopter, [F]ighter Jet, [S]pace Shuttle");
        String usrin = input.next();
        Main main = new Main();
        switch (usrin) {
            case "B":
                main.Blimp(); // I'll be honest, entirely separate functions are probably unnecessary,
                break;   // But it makes the code significantly easier to read.
            case "H":
                main.Heli();
                break;
            case "F":
                main.Jet();
                break;
            case "S":
                main.Shuttle();
                break;
            default:
                System.out.println("That... is NOT an aircraft we support. Please submit a bug ticket.");
                //Add link to hilarious bug reporting system later
                break;
        }

    }
    public void Blimp() {
        System.out.println("You have chosen Blimp.");
        vehicleName = "Blimp";
        vehicleID = 1;
        choose();
    }
    public void Heli() {
        System.out.println("YOu have chosen the Helicopter.");
        vehicleName = "Helicopter";
        vehicleID = 2;
        choose();
    }
    public void Jet() {
        System.out.println("YOu have chosen a Fighter Jet.");
        vehicleName = "Fighter Jet";
        vehicleID = 3;
        choose();
    }
    public void Shuttle() {
        System.out.println("You have chosen the Space Shuttle. \n \n \t Daring.");
        vehicleName = "Space Shuttle";
        vehicleID = 4;
        choose();
    }

    public void choose() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please pick between the following options: " +
                "\n [T]rim" +
                "\n [F]orce Breakout" +
                "\n Force [G]radient" +
                "\n Force F[r]iction" +
                "\n [D]amping" +
                "\n [H]ard Stop" +
                "\n [C]ancel");
        String usrin = input.next();
        switch (usrin.toUpperCase()) {
            case "T":
                mods.add(1); //Arraylists are my extra don't judge the inefficiency
                choose();
                break;
            case "F":
                mods.add(2);
                choose();
                break;
            case "G":
                mods.add(3);
                choose();
                break;
            case "R":
                mods.add(4);
                choose();
                break;
            case "D":
                mods.add(5);
                choose();
                break;
            case "H":
                mods.add(6);
                choose();
                break;
            case "C":
                System.out.println("Finishing...");
                finalement();
                break;
            default:
                System.out.println("That isn't a valid input, CHARLES!");
                choose();
        }
    }
    public void finalement() { //Roundabout solutions are roundabout
        for (Integer object : mods) {
            switch (object) {
                case 1:
                    boolean trim = true; //Honestly just doing this so I can store the variables...
                    System.out.println("YOu've chosen Position Trim"); //Which I already had an array for...
                    break;
                case 2:
                    boolean breako = true;
                    System.out.println("YOu've chosen Force Breakout");
                    break;
                case 3:
                    boolean Gradient = true;
                    System.out.println("You've chosen Force Gradient");
                    break;
                case 4:
                    boolean friction = true;
                    System.out.println("You've chosen Force Friction");
                    break;
                case 5:
                    boolean damp = true;
                    System.out.println("You've chosen Damping");
                    break;
                case 6:
                    boolean stop = true;
                    System.out.println("You've chosen Hard Stop!");
                    break;
                default:
                    System.out.println("OK then, no mods.");
            }
        }
        System.out.println("You've chosen to fly the " + vehicleName  + " today, with the above mods. Good luck!");
    }
}
