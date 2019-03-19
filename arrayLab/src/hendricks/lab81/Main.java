package hendricks.lab81;

//imports
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Connor McDermid
 * Lab 8.1
 * Extra: Array Libraries
 */
public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        double[] finalGrade = new double[]{85.8, 93.7, 76, 88.5, 100, 91.3};
        double sum = 0;
        for (Double object: finalGrade) {
            sum += object;
        }
        System.out.println("The average of all values is " + (sum / 6));
        int[] intarray = new int[10];
        for (int i = 0; i < 10; i++) {
            intarray[i] = rand.nextInt(10) + 1;
        }
        System.out.println(Arrays.toString(intarray)); //Prints array forwards
        for (int i = 9; i >= 0; i--) { //Prints array backwards
            System.out.println(intarray[i]);
        }
        int evens = 0;
        for (Integer object: intarray) { //Finds even numbers in array
            if (object % 2 == 0) {
                evens++;
            }
        }
        System.out.println("There are " + evens + " even numbers in the array.");

        //___________________________________________________________________________

        System.out.println("************************************************************************************");

        int[] ages = new int[20];
        for (int i = 0; i < 20; i++) {
            System.out.println("Please input age #" + (i + 1));
            ages[i] = input.nextInt();
        }
        System.out.println("Finding ages over 15");
        for (Integer object: ages) {
            if (object >= 15) {
                System.out.println(object);
            }
        }
    }
}
