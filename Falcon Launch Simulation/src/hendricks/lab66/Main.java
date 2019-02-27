package hendricks.lab66;
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
        system(yodamode);
    }
    public static void system(boolean yodamode) {
        System.out.println("Running simulation.......");
        System.out.println("Checking readiness.......");
        System.out.println("R2D2\tC3PO\tHan \tLuke\tChewy   Leia\tLAUNCH");
        int run = 0;
        boolean launch;
        final long starttime = System.nanoTime();
        boolean r2d2, c3po, han, luke, chewy, leia;
        do {
            r2d2 = R2D2();
            c3po = C3PO();
            han = han();
            luke = luke();
            chewy = chewy();
            leia = leia();
            run++;
            System.out.print("Run " + run + ": ");
            radiocall(r2d2); //Trust me, this is way more concise than what I had before.
            radiocall(c3po);
            radiocall(han);
            radiocall(luke);
            radiocall(chewy);
            radiocall(leia);
            if (!r2d2 || !c3po || !han || !luke || !chewy || !leia) {
                launch = false;
                System.out.println("No launch.");
            } else {
                launch = true;
            }
            if (run == 20 && yodamode) {
                System.out.println("Yoda has used the Force to launch the Falcon.");
                launch = true;
            }
        } while (!launch);
        System.out.println("We are GO for launch.");
        final long endtime = System.nanoTime();
        final long totaltime = (endtime - starttime) / 1000000000;
        if (totaltime > 1) {
            System.out.println("Execution time is:" + totaltime + " seconds.");
        } else {
            System.out.println("Execution time is: Less than 1 second.");
        }
        System.out.println(endtime - starttime); //Duration of program
    }

    public static void radiocall(boolean crew) {
        if (crew) {
            System.out.print("GO\t");
        } else {
            System.out.print("NO\t");
        }
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
