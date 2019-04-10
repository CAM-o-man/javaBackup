package hendricks.lab813;

/**
 * @author Connor McDermid
 * Lab: 8.13
 * Extra: My program tells you which column/row is wrong
 */
@SuppressWarnings("WeakerAccess")
public class Main {
    /**
     * Controller method, where matrix is defined and methods are called
     * @param args N/A for now
     */
    public static void main(String[] args) {
        int[][] testMatrix = new int[][] {
                {16, 3, 2, 13},
                {5, 10, 11, 8},
                {9, 6, 7, 12 },
                {4, 15, 14, 1}
        };
        if (testVertical(testMatrix) && testHoriz(testMatrix)) {
            System.out.println("This is a magic square.");
        } else {
            System.out.println("This is not a magic square.");
        }

    }

    /**
     * THis tests the columns of the matrix
     * @param x The matrix to be tested
     * @return Returns true if all columns match, false if not
     */
    public static boolean testVertical(int[][] x) {
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;
        for (int i = 0; i < x.length; i++) {
            sum1 += x[i][0];
            sum2 += x[i][1];
            sum3 += x[i][2];
            sum4 += x[i][3];
        }
        if (sum1 == sum2 && sum2 == sum3 && sum3 == sum4) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Tests all rows of matrix
     * @param x The matrix to be tested
     * @return Returns true if all rows match, false if not
     */
    public static boolean testHoriz(int[][] x) {
        int[] sums = new int[4];
        int iterator = 0;
        for (int[] z: x) {
            for (int obj: z) {
                sums[iterator] += obj;
            }
            iterator++;
        }
        if (sums[0] == sums[1] && sums[1] == sums[2] && sums[2] == sums[3]) {
            return true;
        } else {
           return false;
        }

    }
}
