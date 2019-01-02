package hendricks.paint;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
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
    public static void billing(double red, double green) {

    }
}
