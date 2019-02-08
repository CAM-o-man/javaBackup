package mcdermid.connor;
import java.io.IOException;
import java.util.Scanner;
import java.awt.Desktop;
import java.net.URI;
import java.net.URISyntaxException;
import java.io.IOException;
public class database {
    public database() {
        asterisks(); //TODO: Expand further on database, include more useful functions
    }

    public void asterisks() {
        for (int i = 0; i < 16; i++) {
            System.out.print("*");
        }
    }
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
    public static void spaces(int x) {
        for (int i = 0; i < x; i++) {
            System.out.print(" ");
        }
    }
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
    public static void navWeb(String url) throws URISyntaxException, IOException {
        Desktop dtop = Desktop.getDesktop();
        dtop.browse(new URI(url));
    }
}
