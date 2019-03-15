package hendricks.lab75;

//imports
import java.io.*;
import java.util.Scanner; //Would rather use BufferedReader, but Scanner works better for this situation.

/**
 * @author Connor McDermid
 * Lab: 7.5
 * Extra: File to be parsed is determined by arguments passed to <code>main(String[] args)</code>
 */
public class Main {
    /**
     * All statistical calculations are performed in sequence here.
     * @param args File to be parsed
     * @throws IOException Accesses ScoreData.txt
     */
    public static void main(String[] args)throws IOException {
        File stats = new File(args[0]);
        System.out.println("The file size is " + stats.length() + " bytes.");
        int[] data = getScores(stats);
        int sum = 0;
        for (Integer object: data) {
            sum += object;
        }
        //noinspection IntegerDivisionInFloatingPointContext
        double average = sum / 40;
        System.out.println("x\u0304 = " + average);
        int counter = 0;
        double[] squaredDiff = new double[40];
        //Generating an array of all squared differences.
        for (Integer object: data) {
            squaredDiff[counter] = Math.pow((object - average), 2);
            counter++;
        }
        double squaredDiffSum = 0;
        for (Double object: squaredDiff) {
            squaredDiffSum += object;
        }
        System.out.println(squaredDiffSum);
        double variance = squaredDiffSum / 40;
        System.out.println("The variance is " + variance);

        System.out.println("The population standard deviation is " + (Math.sqrt(variance)));

    }

    /**
     * Takes file of integers as an argument and returns data in a more readable form
     * @param stats File containing data
     * @return Returns data in a more readable format
     * @throws IOException Accesses file
     */
    private static int[] getScores(File stats) throws IOException {
        Scanner input = new Scanner(stats);
        int temp;
        int counter = 0; //Required to insert values into data array
        int[] data = new int[40];
        do {
            temp = input.nextInt();
            if (temp != 0) {
                data[counter] = temp;
                counter++;
            }
        } while(input.hasNextInt());
        return data;
    }
}
