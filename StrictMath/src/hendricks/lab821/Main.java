package hendricks.lab821;

import java.util.Arrays;
import java.util.Random;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        Random rand = new Random();

        int[] rarray = new int[25];
        for (int i = 0; i < rarray.length; i++) {
            rarray[i] = rand.nextInt();
        }
        ArrayList<Integer> odds = new ArrayList<>();
        ArrayList<Integer> evens = new ArrayList<>();
        for (int obj: rarray) {
            if (obj % 2 != 0) {
                odds.add(obj);
            } else {
                evens.add(obj);
            }
        }

        for (Integer obj: evens) {
            System.out.print(obj);
            System.out.print(",");
        }
        System.out.println();
        for (Integer obj: odds) {
            System.out.print(obj);
            System.out.print(",");
        }

        //Palindromes

        int[] threeDigits = new int[10];

        for (int i = 0; i < 10; i++) {
            threeDigits[i] = rand.nextInt(899) + 100;
        }
        for (int obj: threeDigits) {
            if (palindromeFinder(obj)) {
                System.out.println(obj + " is a palindrome.");
            } else {
                System.out.println(obj + " is not a palindrome.");
            }
        }


        //Part 3
        //Uses the same array as before
        Arrays.sort(rarray);
        int sum = 0;
        for (int obj : rarray) {
            sum += obj;
        }
        int mean = sum / 25;
        int median = rarray[12];
        int max = rarray[25];
        int min = rarray[0];
        int range = max - min;
        int variance = 0;
        for (int obj: rarray) {
            variance = (obj - mean) * (obj - mean);
        }
        double standardDev = Math.sqrt(variance);
        System.out.println("Mean: " + mean);
        System.out.println("Median: " + median);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println("Range: " + range);
        System.out.println("Variance: " + variance);
        System.out.println("Standard Deviation: " + standardDev);

    }

    public static boolean palindromeFinder(int num) {
        char[] cnum = Integer.toString(num).toCharArray();
        int rnum = Integer.parseInt(Character.toString(cnum[2]) + Character.toString(cnum[1]) + Character.toString(cnum[0]));
        return num == rnum;
    }
}
