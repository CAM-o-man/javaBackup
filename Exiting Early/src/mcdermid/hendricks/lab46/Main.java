/**********************************
 * Author: Connor McDermid        *
 * Mr. Hendricks                  *
 * CompSci                        *
 * 2018.11.30                     *
 * Lab 4.6                        *
 * Extra: foreach loops and       *
 * unicode integration            *
 *********************************/
package mcdermid.hendricks.lab46;
import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Name, please.");
        String name = input.next();
        ArrayList<Character> namearr = new ArrayList<Character>();
        for (int i = 0; i < name.length(); i++) {
            namearr.add(name.charAt(i));
        }
        int iterator = 0;
        for (Character object : namearr) {
            if (object.toString().toUpperCase().equals("A")) {
                continue;
            }
            else {
                System.out.print(object.toString());
            }

            iterator++;
            //System.out.println(namearr);
        }
        System.out.println(", ");
        youghee();
    }
    public static void youghee() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please give me a word.");
        String usrword = input.next();
        @SuppressWarnings("Duplicates") ArrayList<Character> usrarr = new ArrayList<Character>();
        for (int i = 0; i < usrword.length(); i++) {
            usrarr.add(usrword.charAt(i));
        }
        int iterator = 0;
        for (Character object : usrarr) {

            if (object.toString().equals("e") || object.toString().equals("E")) {
                System.out.println("Youghee\u203D");
                break;
            }
            System.out.println(object);
        }
            counter();
    }
    public static void counter() {
        for (int i = 0; i <= 100; i++) {
            System.out.println(i); //Simple
        }
    }
}
