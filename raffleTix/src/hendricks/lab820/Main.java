package hendricks.lab820;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Arrays;

/**
 * @author Connor McDermid
 * Lab: 8.20
 * Extra: Object Interaction and Sorting Custom Objects
 */
public class Main {
    /**
     * Main is used for all file interaction and other really routine stuff.
     * @param args If set to "auto" the winner will be selected randomly. If set to "man" winner is selected by user (impartially)
     * @throws IOException BufferedReader may throw this.
     */
    public static void main(String[] args) throws IOException {
        File lastname = new File("lastname.txt");
        File lastnum = new File("lastnum.txt");
        File firstname = new File("firstname.txt");
        File firstnum = new File("firstnum.txt");
        BufferedReader lastnameReader = new BufferedReader(new FileReader(lastname));
        BufferedReader lastnumReader = new BufferedReader(new FileReader(lastnum));
        BufferedReader firstnameReader = new BufferedReader(new FileReader(firstname));
        BufferedReader firstnumReader = new BufferedReader(new FileReader(firstnum));
        BufferedReader counter = new BufferedReader(new FileReader(lastname));
        boolean whileLinesRemain = true;
        /* THis next section might be somewhat inefficient, but this was the best way I thought to minimise sloppy
            exception catching.
         */
        int lines = 26; //While you didn't say 
        counter.close(); //Don't want to have to deal with that anymore.
        String[] lastNames = new String[lines];
        String[] firstNames = new String[lines];
        int[] lastNums = new int[lines];
        int[] firstNums = new int[lines];
        for (int i = 0; i < lines; i++) {
            lastNames[i] = lastnameReader.readLine();
            lastNums[i] = Integer.parseInt(lastnumReader.readLine());
            firstNames[i] = firstnameReader.readLine();
            firstNums[i] = Integer.parseInt(firstnumReader.readLine());
        }
        //Data is now stored
        Ticket[] completes;
        completes = parser(firstNums, lastNums, firstNames, lastNames);


        for (Ticket ticket: completes) {
            ticket.info();
        }

        //Here, a parameter will be passed to the program that determines whether or not it runs autonomously.
        if (args[0].equals("man")) {
            manualJudge(completes);
        } else {
            auto(completes);
        }
    }

    /**
     * Parser does all the sorting and processing of data gathered by main
     * @param firstnum The number on the first ticket half
     * @param lastnum The number on the last ticket half
     * @param firstNames The name on the first ticket half
     * @param lastNames The name on the last ticket half
     * @return Returns an array of Tickets, which contain the complete number and complete name
     */
    private static Ticket[] parser(int[] firstnum, int[] lastnum, String[] firstNames, String[] lastNames) {
        HalfTicket[] firstHalves = new HalfTicket[firstNames.length];
        HalfTicket[] lastHalves = new HalfTicket[lastNames.length];
        for (int i = 0; i < firstNames.length; i++) {
            firstHalves[i] = new HalfTicket(firstnum[i], firstNames[i]);
            lastHalves[i] = new HalfTicket(lastnum[i], lastNames[i]);
        }
        Comparator<HalfTicket> comp = Comparator.comparingInt(o -> o.number);
        Arrays.sort(firstHalves, comp);
        Arrays.sort(lastHalves, comp);

        Ticket[] completes = new Ticket[firstHalves.length];

        for (int i = 0; i < completes.length; i++) {
            completes[i] = new Ticket(firstHalves[i], lastHalves[i]);
        }

        return completes;
    }

    /**
     * This is the method for having a (hopefully impartial) judge select the lottery winner.
     * @param tix The array of Tickets
     */
    private static void manualJudge(Ticket[] tix) {
        Scanner input = new Scanner(System.in);
        System.out.println("Here are the ticket numbers:");
        for (Ticket tic: tix) {
            System.out.println(tic.number);
        }

        System.out.println("Please type a number that wins.");
        int winner = input.nextInt();
        boolean win = false;
        for (Ticket tic: tix) {
            if (tic.number == winner) {
                System.out.println("Ticket number " + winner + ", owned by " + tic.name + ", is the winner!");
                win = true;
            }
        }
        if (!win) {
            System.out.println("Sorry, there is no winning ticket.");
        }
    }

    /**
     * This method uses a random number generator to select lottery winners.
     * @param tix The lottery Tickets
     */
    private static void auto(Ticket[] tix) {
        int winner = (int) (Math.random() * tix.length);
        for (Ticket tic: tix) {
            if (tic.number == winner) {
                System.out.println("Ticket number " + winner + ", owned by " + tic.name + ", is the winner!");
            }
        }
    }
}

/**
 * A HalfTicket object will be an amalgamation of the first Name and Number, or last Name and Number.
 */
class HalfTicket {
    final int number;
    final String name;

    /**
     * Sets the final values for the object's Number and Name
     * @param number The number, read directly from a file
     * @param name The name, read directly from file.
     */
    HalfTicket (int number, String name) {
        this.number = number;
        this.name = name;
    }
}

/**
 * A Ticket object will be the complete lottery Ticket, with the full number and full owner's name. THe constructor accepts two HalfTicket objects
 */
class Ticket {
    final int number;
    final String name;

    /**
     * Accepts two HalfTicket objects and restructures them into a full Ticket
     * @param first The first HalfTicket, representing the first half of the ticket
     * @param last The last HalfTicket, representing the last half of the ticket.
     */
    Ticket (HalfTicket first, HalfTicket last) {
        this.number = Integer.parseInt(first.number + Integer.toString(last.number));
        this.name = first.name + last.name;
    }

    /**
     * Prints out ticket information.
     */
    void info() {
        System.out.println("Ticket number " + number + " owned by " + name);
    }
}
