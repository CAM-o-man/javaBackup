/**
 * Author: Connor McDermid
 * Lab: Methods Quiz
 */
package mcdermid.connor;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the dimensions of your rectangle");
        int x = input.nextInt();
        int y = input.nextInt();
        asterisks();
        System.out.println( "\n" + area(x, y)); //Newline escape necessary to work with asterisks
        asterisks();
        System.out.println("\n" + perimeter(x, y));
    }
    public static void asterisks() { //Left public to be imported in to later projects
        for (int i = 0; i < 16; i++) {
            System.out.print("*");
        }
    }
    private static int area(int x, int y) {
        return x * y;
    }
    private static int perimeter(int x, int y) {
        return (y * 2) + (x * 2);
    }
}
