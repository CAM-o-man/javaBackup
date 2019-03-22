package hendricks.lab83;


import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileOutputStream;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int[] nums = new int[10];
        System.out.println("Please input 10 numbers.");
        for (int i = 0; i < 10; i++) {
            nums[i] = input.nextInt();
        }
        System.out.println(nums[0]);
        System.out.println(nums[9]);
        printIt(nums);
        System.out.println(average(nums));
        System.out.println("Would you like to write the numbers to a file?");
        String user = input.next();
        if (user.equalsIgnoreCase("Y")) {
            File numFile = new File("numFile.txt");
            FileOutputStream outputStream = new FileOutputStream(numFile);
            for (int i = 0; i < 10; i++) {
                outputStream.write(nums[i]);
            }
        } else {
            System.exit(0);
        }
    }
    private static void printIt(int[] x) {
        for (Integer z: x) {
            System.out.println(z);
        }
    }
    private static double average(int[] x) {
        int sum = 0;
        for (Integer z: x) {
            sum += z;
        }

        return sum/10.0;
    }
}
