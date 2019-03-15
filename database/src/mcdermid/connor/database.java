package mcdermid.connor;
import java.io.IOException;
import java.util.Scanner;
import java.awt.Desktop;
import java.net.URI;
import java.net.URISyntaxException;
import java.io.IOException;

/**
 * Database is my personal repository of useful methods.
 */
public class database {
    /**
     * Provides Database constructor
     */
    public database() {
        //TODO: Expand further on database, include more useful functions
    }

    /**
     * Takes an argument of the length of the string of asterisks and prints that many.
     * @param length
     */
    public void asterisks(int length) {
        for (int i = 0; i < length; i++) {
            System.out.print("*");
        }
    }

    /**
     * Takes an argument of cents and returns the same value in dollars
     * @param cents
     * @return
     */
    public String toDollars(int cents) {
        int dollars = 0;
        while(true) {
            if (cents > 100) {
                dollars += 1;
                cents -= 100;
            }
            else {
                break;
            }
        }
        String dollarString = Integer.toString(dollars);
        String centsString = Integer.toString(cents);
        return (dollarString + "." + centsString);

    }

    /**
     * Prints an open triangle figure made of ampersands
     */
    public static void otri() {
        System.out.print("\n");
        for (int i = 0; i < 5; i++) {
            switch (i) {
                case 0:
                    spaces(4);
                    chars(1, 4);
                    break;
                case 1:
                    spaces(3);
                    chars(1, 4);
                    spaces(1); //Why.
                    chars(1, 4);
                    break;
                case 2:
                    spaces(2);
                    chars(1, 4);
                    spaces(1);
                    System.out.print("*");
                    spaces(1);
                    chars(1, 4);
                    break;
                case 3:
                    spaces(1); //But doing it here would be so much more PRACTICAL and would save resources!
                    chars(1, 4);
                    spaces(5);
                    chars(1, 4);
                    break;
                case 4:
                    chars(9, 4);
                    break;
                default:
                    System.out.println("Main.otri, Case/Nested Fors");
                    System.exit(-2);
            }
            System.out.print("\n");
        }
    }

    /**
     * Takes an integer value as an argument and prints that number of spaces
     * @param x
     */
    public static void spaces(int x) {
        for (int i = 0; i < x; i++) {
            System.out.print(" ");
        }
    }

    /**
     * Takes an argument of integers and prints out that many characters of the specified type
     * @param x
     * @param chara
     */
    public static void chars(int x, int chara) {
        char pchar;
        switch (chara) {
            case 0:
                pchar = '@';
                break;
            case 1:
                pchar = '#';
                break;
            case 2:
                pchar = '$';
                break;
            case 3:
                pchar = '%';
                break;
            case 4:
                pchar = '&';
                break;
            default:
                System.out.println("database.chars");
                System.exit(-1);
                pchar = '!';
        }
        for (int i = 0; i < x; i++) {
            System.out.print(pchar);
        }
    }

    /**
     * Takes a url argument as a string and opens the client's browser to navigate to that page.
     * @param url
     * @throws URISyntaxException
     * @throws IOException
     */
    public static void navWeb(String url) throws URISyntaxException, IOException {
        Desktop dtop = Desktop.getDesktop();
        dtop.browse(new URI(url));
    }
}
