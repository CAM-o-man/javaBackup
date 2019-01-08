package hendricks.paint;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException{
        Scanner input = new Scanner(System.in);
        System.out.println("How many gallons of red paint do you need?");
        int Redgallons = input.nextInt();
        System.out.println("How many gallons of green paint do you need?");
        int greenGallons = input.nextInt();
        billing(red(Redgallons), green(greenGallons));
    }
    public static double red(int gallons) {
        return 21.95 * gallons;
    }
    public static double green(int gallons) {
        return 19.95 * gallons;
    }

    //=======================================================================================
    //BILLING
    //=======================================================================================
    public static void title() { //This method is for LITERALLY nothing else.
        System.out.println("=================================================================" +
                "HENDRICKS AND DIGIOVANNA RAINBOW PAINT STORE" +
                "====================================================================" +
                "Now in Christmas colours ONLY.");

    }
    public static void billing(double red, double green) throws InterruptedException{
        Scanner input = new Scanner(System.in);
        double price = red + green;
        final double finalprice = price * 0.08;
        System.out.println("Red Paint: " + red + "" +
                "\n Green Paint: " + green + "" +
                "\n Subtotal: " + price +
                "\n Tax: 8%" +
                "\n Total: " + finalprice);
        System.out.println("Please input your PIN on the PIN pad.");
        if(pinpad(input.next())) {
            System.out.println("PIN accepted. Continuing transaction.");
        }
        Thread.sleep(2000);
        System.out.println("Transaction completed. Have a nice day.");
    }
    public static boolean pinpad(String pin) {
        if (pin.length() == 4 || pin.length() == 6 && pin.matches("^[0-9]+$")) { //This regex took me 10 minutes
            return true;
        }
        else if (pin.length() == 4 || pin.length() == 6 && pin.matches("^[a-zA-Z_.!@#$%^&*()]")) { //This one took me 5
            return true;
        }
        else {
            return false;
        }
    }

}
