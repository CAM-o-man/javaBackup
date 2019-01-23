package hendricks.lab58;
import java.util.Scanner;
import mcdermid.connor.database;
@SuppressWarnings("SpellCheckingInspection")
public class Main {
    /**
     * Author: Connor McDermid
     * Lab: 5.8
     * Extra: Cents to Dollars
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        database d = new database();
        System.out.println("What's your favourite word?");
        String word = input.next();
        System.out.println("WHats your favourite number?");
        int num = input.nextInt();
        redundant(word, num);
        d.asterisks();
        System.out.println("Please input 2 intergers");
        int int1 = input.nextInt();
        int int2 = input.nextInt();
        System.out.println(add(int1, int2) + " " + multiply(int1, int2));
        d.asterisks();
        System.out.println("Please input your name.");
        String name = input.next();
        nameSplitter(name);
        System.out.println("Goodbye, " + name);
        System.out.println("How many days past due is this?");
        int days = input.nextInt();
        givememoney(days);
        System.out.println("Please enter a number.");
        System.out.println(fakefactorial(input.nextInt()));
    }
    private static void redundant(String word, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(word);
        }
    }
    private static int add(int x, int y) {
        return x + y;
    }
    private static int multiply(int x, int y) {
        return x * y;
    }
    private static void nameSplitter(String name) {
        for (int i = 0; i < name.length(); i++) { //foreach not applicable to strings, sadly
            System.out.println(name.charAt(i));
        }
    }
    private static void givememoney(int days) {
        int cents = days * 15;
        int dollars = 0;
        if (days > 10) {
            System.out.println("WAY OVERDUE");
        }
        while (true) {
            if (cents > 100) {
                dollars += 1;
                cents -= 100;
            }
            else {
                break;
            }
        }
        System.out.println(dollars + "." + cents);
    }
    private static int fakefactorial(int x) {
        int ans = 0;
        for (int i = 0; i < x; i++) {
            ans += x + (x - i);
        }
        return ans;
    }


}
