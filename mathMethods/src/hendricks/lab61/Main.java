package hendricks.lab61;
import java.util.Scanner;
@SuppressWarnings("SpellCheckingInspection")
public class Main {

    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive or negative decimal.");
        double deci = input.nextDouble();
        long deciRound = Math.round(deci);
        System.out.println(deciRound);
        Thread.sleep(1000);
        System.out.println("Now enter 2 ages");
        int agex = input.nextInt();
        int agey = input.nextInt();
        int diff = Math.abs(agey - agex);
        System.out.println(diff);
        Thread.sleep(1000);
        System.out.println("A chart of numbers and their roots.");
        for (int i = 0; i < 20; i++) {
            if (Math.sqrt(i) % 1 == 0) {
                System.out.println(i + "\t\t" + Math.sqrt(i));
            }
            else {
                System.out.println(i + "\t\t" + "\u221A" + i);
            }
        }
        Thread.sleep(2000);
        System.out.println("A chart of numbers and their powers.");
        for (int i = 1; i < 6; i++) {
            System.out.println(i + "\t" + Math.pow(i, 2) + "\t" + Math.pow(i, 3));
        }
        Thread.sleep(2000);
        System.out.println("Enter 2 integers.");
        int int1 = input.nextInt();
        int int2 = input.nextInt();
        System.out.println(Math.max(int1, int2));
        Thread.sleep(2000);
        halloween();
        Thread.sleep(2000);
        bacteria();
        Thread.sleep(2000);
        pythag();
    }
    private static void halloween() {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, students!");
        System.out.println("Input your height.");
        int height = input.nextInt();
        double Area = (Math.PI * (Math.pow((height / 2.0d), 2)));
        long roundedArea = Math.round(Area);
        System.out.println("You'll need:");
        System.out.println(roundedArea);
        System.out.println("square inches of fabric, and:");
        double circum = 2 * (Math.PI * height);
        System.out.println(Math.round(circum));
        System.out.println("inches of blood tubing.");
    }
    private static void bacteria() {
        System.out.println("If at time t = 0, there are 40 bacteria, then after 24 hours there will be:");
        double bac;
        int initbac = 40;
        int t = 24;
        double k = 0.25935;

        //--------------------------------------------------------

        bac = initbac * Math.pow(Math.E, (k * t));

        int roundedBac = (int)Math.round(bac);
        System.out.println(roundedBac);
        System.out.println("bacteria.");


    }
    private static void pythag() {
        double opposite = 9.0d;
        double adjacent = 13.0d;
        double hypotenuse = (int)Math.round(Math.hypot(opposite, adjacent)); //Finding hypotenuse
        double rad = Math.acos(adjacent / hypotenuse);
        long angle = Math.round(Math.toDegrees(rad));

        System.out.println("The angle is " + angle + "\u00b0");
    }
}