package hendricks.lab82;

import java.util.Scanner;

/**
 * @author Connor McDermid
 * Lab 8.2
 * Extra: TBD
 */
public class Main {
    /**
     * All interaction with the user occurs here.
     * @param args N/A
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers do you plan to enter?");
        int user = input.nextInt();
        System.out.println("Please enter your " + user + " numbers.");
        int[] numbers = new int[user];
        for (int i = 0; i < user; i++) {
            numbers[i] = input.nextInt();
        }
        System.out.println("Calculating...");
        int sum = sum(numbers);
        System.out.println("The sum is " + sum);
        double[] percentages = percentage(numbers, sum, user);
        System.out.println("The percentages are: ");
        for (int i = 0; i < user; i++) {
            System.out.println(numbers[i] + ": " + percentages[i]);
        }
    }

    /**
     * Takes the integer array and sums it.
     * @param x Integer array.
     * @return Sum.
     */
    private static int sum(int[] x) {
        int sum = 0;
        for (Integer object: x) {
            sum += object;
        }
        return sum;
    }

    /**
     * Takes the integer array and returns an array of doubles representing the percentages of the numbers.
     * @param x The integer array
     * @param sum The sum of all integers in the array
     * @param total The total number of integers in the array
     * @return A double array containing percentages, ordered respective to the order of integers in original array.
     */
    private static double[] percentage(int[] x, int sum, int total) {
        double[] percents = new double[total];
        int counter;
        int iterator = 0;
        for (Integer object: x) {
            counter = 0;
            for (Integer duplicate: x) {
                if (duplicate.equals(object)) {
                    counter++;
                }
            }
            //noinspection IntegerDivisionInFloatingPointContext
            percents[iterator] = (counter/sum) * 100;
        }
        return percents;
    }
}
