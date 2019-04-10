package hendricks.lab817;

import mcdermid.connor.Database.Database;

public class Main {

    public static void main(String[] args) {
        Database base = new Database();
        int[] testArr = new int[] {
                26, 19, 45, 22, 79, 35, 21, 4, 76, 45, 56, 90, 88, 32, 45, 3, 66, 74, 77, 35, 24, 33, 42, 55, 76, 74, 88, 90
        };
        int[] sortedArray = new int[testArr.length];
        sortedArray = base.bubbleSort(testArr);
        int[] hist = new int[10];
        hist = counter(sortedArray);
        for (int item: hist) {
            base.asterisks(item);
            System.out.println();
        }
    }

    /**
     * Takes the sorted array from 0-99 and counts the number of values in each increment of 10
     * NOTE: I know it's ugly, but <code>switch(){case:}</code> wouldn't work.
     * @param arr The array to be passed, not necessarily sorted
     * @return The number values in each increment of 10
     */
    public static int[] counter(int[] arr) {
        int[] count = new int[10];
        for (int item: arr) {
            if (0 < item && item < 10) {
                count[0]++;
            } else if (9 < item && item < 20) {
                count[1]++;
            } else if (19 < item && item < 30) {
                count[2]++;
            } else if (29 < item && item < 40) {
                count[3]++;
            } else if (39 < item && item < 50) {
                count[4]++;
            } else if (49 < item && item < 60) {
                count[5]++;
            } else if (59 < item && item < 70) {
                count[6]++;
            } else if (69 < item && item < 80) {
                count[7]++;
            } else if (79 < item && item < 90) {
                count[8]++;
            } else if (89 < item && item < 100) {
                count[9]++;
            }
        }
        return count;
    }
}
