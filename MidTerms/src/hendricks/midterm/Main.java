package hendricks.midterm;
/**
 * Author: Connor McDermid
 * Lab: MidTerm Project
 * Extra: TBD
 */

import mcdermid.connor.database;
import java.util.Scanner;
import java.io.IOException;
import java.util.Scanner;
import java.awt.Desktop;
import java.net.URI;
import java.net.URISyntaxException;
import java.io.IOException;
public class Main {

    public static void main(String[] args) {
        //Using main as a sort of director/controller, not menu
    }
    public static void menu() throws InterruptedException {
        database d = new database();
        Scanner input = new Scanner(System.in);
        //Illuminati Logo
        System.out.println("Welcome to Illuminati Incorporated.");
        //noinspection AccessStaticViaInstance
        d.otri();
        System.out.println("Username:");
        String username = input.next();
        System.out.print("\n");
        System.out.println("Checking authorization...");
        System.out.print(".");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.println("\nAuthorization complete. Welcome, " + username);

        System.out.println("To see our employee list, press 1.");
        System.out.println("To see our services, press 2.");
        System.out.println("To make a purchase, press 3.");
        System.out.println("To exit, press 4.");
        int usr = input.nextInt();
        switch (usr) {
            case 1:
                employeeList();
                break;
            case 2:
                services();
                break;
            case 3:
                purchase();
                break;
            case 4:
                System.exit(2);
            default:
                System.out.println("Main.menu");
                System.out.println("An error has occurred. Restarting.");
                menu();
        }
    }
    @SuppressWarnings("SpellCheckingInspection")
    public static void employeeList() throws URISyntaxException, IOException, InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.println("Our top employees are:");
        System.out.println("Tejas Metha");
        System.out.println("Agranya Ketha");
        System.out.println("Frank Gomes");
        System.out.println("Connor McDermid");

        System.out.println("For more employees, press \'m\'. To exit, press \\.");
        String usr = input.next();
        if (usr.toUpperCase().equals("M")) {
            Desktop dtop = Desktop.getDesktop();
            dtop.browse(new URI("https://classroom.google.com/u/1/r/MTc2MjIyNTcxNjNa/sort-last-name"));
        }
        else {
            menu();
        }
    }
}
