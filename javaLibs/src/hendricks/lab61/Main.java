package hendricks.lab61;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char s = 's';
        char h = 'h';
        char p = 'p';
        char i = 'i';

        System.out.println(Character.toUpperCase(s) + "." + Character.toUpperCase(h) + ". is a " + Character.toUpperCase(p) + "." + Character.toUpperCase(i));

        char clue = 'B';
        if (clue == Character.toUpperCase(clue)) {
            System.out.println("22 Baker Street");
        } else {
            System.out.println("This could be a trap!");
        }

        System.out.println("What's your first initial?");
        String dammitScanner = input.next();
        char[] Ihatestrings = dammitScanner.toCharArray();
        try {
            if (Character.isAlphabetic(Ihatestrings[0])) {
                System.out.println(Ihatestrings[0] + ". is a P.I.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }
}
