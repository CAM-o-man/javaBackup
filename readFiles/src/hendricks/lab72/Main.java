package hendricks.lab72;
import java.io.*;
public class Main {
    /**
     * Connor McDermid
     * Lab 7.2
     * Extra: NullPointerException handling
     * @param args
     * @throws Exception
     */

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
        boolean stoooop = false;
        do {
            try {
                employee = reader.readLine();
                if (employee.isEmpty()) { //References a null value, *will* throw NullPointerException
                    stoooop = true;
                } else {
                    System.out.println(employee);
                }
            } catch (NullPointerException e) {
                System.out.println("NullPointerException caught."); //Will catch specifically the error thrown by that and *nothing* else
                stoooop = true;
                break;
            }
        } while(!stoooop);
        mason();
    }
    public static void mason() throws IOException {
        File numbers = new File("C:\\javaRepo\\createFiles\\numbers.txt");
        BufferedReader reader = new BufferedReader(new FileReader(numbers));
        String number;
        boolean youquitthisrightnowyouhearme = false;
        do {
            try {
                number = reader.readLine();
                if (number.isEmpty()) {
                    youquitthisrightnowyouhearme = true;
                } else {
                    System.out.println(number);
                }
            } catch (NullPointerException e) { //See above
                System.out.println("NullPointerException caught");
                youquitthisrightnowyouhearme = true;
                break;
            }
        } while (!youquitthisrightnowyouhearme);
    }
}
