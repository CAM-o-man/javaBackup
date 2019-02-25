package hendricks.lab66;

import java.io.IOException;
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("MILLENIUM FALCON LAUNCH SIMULATION");
        System.out.println("*******************************************************");
        System.out.println("Enable Yoda Mode? [Y|N]");
        boolean yodamode;
        if (input.next().equals("Y")) {
            yodamode = true;
        } else {
            yodamode = false;
        }
    }
    public static void system() {
        String[] arg = new String[0];
        main(arg).runtime.start;
        System.out.println("Running simulation.......");
        System.out.println("Checking readiness.......");
        System.out.println("R2D2\tC3PO\tHan \tLuke\tChewy   Leia\tLAUNCH");
        int run = 0;
        boolean launch;
        long starttime = System.nanoTime();
        do {

            run++;
            System.out.print("Run " + run + ": ");
            if (R2D2()) {
                System.out.print("GO\t");
            } else {
                System.out.print("NO\t");
            }
            if (C3PO()) {
                System.out.print("GO\t");
            } else {
                System.out.print("NO\t");
            }
            if (han()) {
                System.out.print("GO\t");
            } else {
                System.out.print("NO\t");
            }
            if (luke()) {
                System.out.print("GO\t");
            } else {
                System.out.print("NO\t");
            }
            if (chewy()) {
                System.out.print("GO\t");
            } else {
                System.out.print("NO\t");
            }
            if (leia()) {
                System.out.print("GO\t");
            } else {
                System.out.print("NO\t");
            }
            if (!R2D2() || !C3PO() || !han() || !luke() || !chewy() || !leia()) {
                launch = false;
            } else {
                launch = true;
            }
        } while (!launch);
        System.out.println("We are GO for launch.");
        long endtime = System.nanoTime();
        System.out.println("Execution time is:");
        System.out.println(endtime - starttime); //Duration of program
    }
    public static boolean R2D2() {
        Random rand = new Random();
        int value = rand.nextInt(101);
        return value > 40;
    }
    public static boolean C3PO() {
        Random rand = new Random();
        int value = rand.nextInt(101);
        return value > 50;
    }
    private static boolean han() {
        Random rand = new Random();
        int value = rand.nextInt(101);
        return value > 30;
    }
    private static boolean luke() {
        Random rand = new Random();
        int value = rand.nextInt(101);
        return value > 20;
    }
    private static boolean chewy() {
        Random rand = new Random();
        int value = rand.nextInt(101);
        return value > 35;
    }
    private static boolean leia() {
        Random rand = new Random();
        int value = rand.nextInt(101);
        return value > 45;
    }
}
