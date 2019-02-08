package hendricks.lab61;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive or negative decimal.");
        double deci = input.nextDouble();
        long deciRound = Math.round(deci);
        System.out.println(deciRound);
        System.out.println("Now enter 2 ages");
        int agex = input.nextInt();
        int agey = input.nextInt();
        int diff = Math.abs(agey - agex);
        System.out.println("A chart of numbers and their roots.");
        System.out.println(diff);
        for (int i = 0; i < 20; i++) {
            System.out.println(i + "\t\t" + Math.sqrt(i));
        }
        System.out.println("A chart of numbers and their powers.");
        for (int i = 1; i < 6; i++) {
            System.out.println(i + "\t" + Math.pow(i, 2) + "\t" + Math.pow(i, 3));
        }
        System.out.println("Enter 2 integers.");
        int int1 = input.nextInt();
        int int2 = input.nextInt();
        System.out.println(Math.max(int1, int2));
    }
    private static void halloween() {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, students!");
        System.out.println("Input your height.");
        int height = input.nextInt();
        double Area = 2 * (Math.PI * (Math.pow((height / 2.0d), 2)));
        long roundedArea = Math.round(Area);
        System.out.println(roundedArea);

    }
}
