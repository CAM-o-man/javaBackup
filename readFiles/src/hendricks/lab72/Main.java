package hendricks.lab72;
import java.io.*;
public class Main {

    public static void main(String[] args) throws Exception {
        File coursegrades = new File("C:\\javaRepo\\createFiles\\create.txt");
        BufferedReader reader = new BufferedReader(new FileReader(coursegrades));
        String name = reader.readLine();
        String course = reader.readLine();
        String grades = reader.readLine();
        System.out.println("Grade report for " + name);
        System.out.println("Favourite course is: " + course);
        System.out.println("His last 3 grades in this course were: " + grades);
        payroll();
    }
    public static void payroll() throws Exception {
        File payroll = new File("C:\\javaRepo\\createFiles\\payroll.txt");
        BufferedReader reader = new BufferedReader(new FileReader(payroll));
        String employee;
        do {
            try {
                employee = reader.readLine();
                System.out.println(employee);
            } catch (NullPointerException e) {
                System.out.println("NullPointerException caught.");
                break;
            }
        } while(true);
        mason();
    }
    public static void mason() throws IOException {
        File numbers = new File("/javaRepo/createFiles/src/numbers.txt");
        BufferedReader reader = new BufferedReader(new FileReader(numbers));
        String number;
        boolean remainingNumbers;
        do {
            number = reader.readLine();
            if (number.isBlank()) {
                remainingNumbers = false;
            } else {
                remainingNumbers = true;
                System.out.println(number);
            }

        } while (remainingNumbers);
    }
}
