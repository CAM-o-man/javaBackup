package hendricks.midterm;
//TODO: Get this QA tested
//TODO: Logon authentication
import mcdermid.connor.database;
import java.util.Scanner;
import java.io.IOException;
import java.awt.Desktop;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Random;
@SuppressWarnings("SpellCheckingInspection")
public class Main {
    /**
     * Author: Connor McDermid
     * Project: MidTerm 2
     */
    int[] productNums = new int[1024];
    int iterator = 0;
    int[] products = new int[1024];
    String name;
    String[] addresses = new String[1024];
    public static void main(String[] args) throws InterruptedException, IOException, URISyntaxException {
        Main main = new Main();
        main.menu();
    }
    public void menu() throws InterruptedException, IOException, URISyntaxException {
        database d = new database();
        Scanner input = new Scanner(System.in);
        login(); //Log in to system
        //Illuminati logo
        System.out.println("Welcome to Illuminati Incorporated.");
        //noinspection AccessStaticViaInstance
        d.otri();
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

    private void login() throws InterruptedException, IOException, URISyntaxException {
        Scanner input = new Scanner(System.in);
        System.out.println("Username:");
        name = input.next();
        System.out.print("\n");
        System.out.println("Checking authorization...");
        System.out.print(".");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.println("\nAuthorization complete. Welcome, " + name);

    }

    @SuppressWarnings("SpellCheckingInspection")
    private void employeeList() throws URISyntaxException, IOException, InterruptedException {
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
            menu();
        }
        else {
            menu();
        }
    }
    private void services() throws InterruptedException, IOException, URISyntaxException {
        Scanner input = new Scanner(System.in);
        System.out.println("We here at Illuminati, Inc. offer many products and services. Here is a list.");
        System.out.println("______________________________________________________________________________");
        System.out.println("|Products                |Services               |Cost Per Unit              |");
        System.out.println("|________________________|_______________________|___________________________|");
        System.out.println("|1.Intelligence Agency   |Free Assistance        |2200 Rubles                |");
        System.out.println("|Subjugation Kit         |                       |                           |");
        System.out.println("|________________________|_______________________|___________________________|");
        System.out.println("|2.Alien Invasion DIY Kit|Free Delivery          |8000 Rubles                |");
        System.out.println("|________________________|_______________________|___________________________|");
        System.out.println("|3.Home Spy Kit          |N/A                    |50 Rubles                  |");
        System.out.println("|________________________|_______________________|___________________________|");
        System.out.println("|4.Civilian Subjugation  |Optional Installation  |3000 Rubles                |");
        System.out.println("|Arcade Cabinet(Polybius)|And Delivery           |                           |");
        System.out.println("|________________________|_______________________|___________________________|");

        System.out.println("Do you wish to make a purchase ([P]) or return to the menu([M])?");
        String usr = input.next();
        if (usr.toUpperCase().equals("P")) {
            purchase();
        } else if (usr.toUpperCase().equals("M")) {
            menu();
        } else {
            System.out.println("That is not valid input.");
        }
    }
    public void purchase() throws InterruptedException, IOException, URISyntaxException {
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to: \n" +
                "1.\tView our product list?\n" +
                "2.\tMake a purchase?\n" +
                "3.\tTrack a purchase?");
        int usr = input.nextInt();
        switch(usr) {
            case 1:
                services();
                break;
            case 2:
                purchaseItem();
                break;
            case 3:
                System.out.println("Please input the product number.");
                trackPurchase(input.nextInt());
                break;
            default:
                System.out.println("Main.purchase");
                System.out.println("An error has occurred. Restarting program.");
                menu();
        }
    }
    public void purchaseItem() throws InterruptedException, IOException, URISyntaxException {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the number of the product you would like to purchase:");
        int product = input.nextInt();
        finalStep(product);

    }
    public void finalStep(int product) throws InterruptedException, IOException, URISyntaxException {
        Scanner input = new Scanner(System.in);
        int cost;
        switch (product) {
            case 1:
                cost = 2200;
                break;
            case 2:
                cost = 8000;
                break;
            case 3:
                cost = 50;
                break;
            case 4:
                cost = 3000;
                break;
            default:
                System.out.println("Main.finalStep");
                System.out.println("An error has occurred. Shutting down.");
                System.exit(-10000);
                cost = 0; //Only so Java doesn't throw a fit about cost not being initialized
                break;
        }
        System.out.println("That will be " + cost + " rubles.");
        System.out.println("Please specify a delivery address.");
        String address = input.next();
        System.out.println("Delivering to: " + address);
        Random rand = new Random();
        int productNum = rand.nextInt(1024) + 1;
        iterator++;
        productNums[iterator] = productNum;
        addresses[iterator] = address;
        products[iterator] = product;
        System.out.println("The product number is: " + productNum);
        System.out.println("Thank you for shopping with us.");
        menu();
    }
    public void trackPurchase(int productNum) throws InterruptedException, IOException, URISyntaxException {

        for (Integer object : productNums) {
            if (object == productNum) {
                findProduct(productNum);
            }
        }
    }
    public void findProduct(int productNum) throws InterruptedException, IOException, URISyntaxException {
        int iter = 0;
        String address = null;
        for (int productNum1 : productNums) {

            if (productNum1 == productNum) {
                address = addresses[iter];
                break;
            }
            iter++;
        }
        System.out.println("Your order of one " + findProductName(products[iter]));
        System.out.println("Will be delivered to " + address);
        menu();
    }
    public String findProductName(int product) {
        switch (product) {
            case 1:
                return "Intelligence Agency Subjugation Kit";
            case 2:
                return "Alien Invasion DIY Kit";
            case 3:
                return "Home Spy Kit";
            case 4:
                return "Polybius Arcade Cabinet";
            default:
                System.out.println("Main.findProductName");
                System.out.println("Error encountered. Shutting down.");
                System.exit(-10);
                return null;
        }
    }
}
