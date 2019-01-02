package hendricks.lab4point4;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i <= 128; i *= 2) {
            System.out.println(i);
        }
        Inputs();
    }
    private static void Inputs() {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> usrin = new ArrayList<>();
        int temp;
        for (int i = 0; i >= 0; i++) {
            System.out.println("Please enter your desired number. If you do not enter a number, this program will end.");
            try {
                temp = input.nextInt();
            }
            catch (Exception e) {
                System.out.println("Program ending. Displaying statistics.");
                break;
            }
            usrin.add(temp);
        }
        Integer sum = 0;
        int average = 0;
        for (Integer object: usrin) {
            sum += object;
            average = sum / usrin.size();
        }
        System.out.println("The sum of the numbers you entered is " + sum + " and the average is " + average);
        Pets();
    }
    private static void Pets() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the name of your favourite pet?");
        String petname = input.nextLine();
        input.nextLine();
        System.out.println("How many times should the name appear on the screen?");
        int times = input.nextInt();
        if (Math.abs(times) != times) {
            System.out.println("That's a negative number! YOU HATE YOUR PET AND WANT IT TO DIE! YOU MONSTER!");
            System.exit(666);
        }
        System.out.println("Would you like the name to appear horizontally or vertically? '1' for horizontal and '0' for vertical");
        int choice = input.nextInt();
        if (choice == 0) {
            for (int i = 0; i <= times; i++) {
                System.out.println(petname);
            }
        }
        else if (choice == 1) {
            for (int i = 0; i <= times; i++) {
                System.out.print(petname + " ");
            }
        }

    }
}
