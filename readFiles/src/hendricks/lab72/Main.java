package hendricks.lab72;
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        File coursegrades = new File("/javarepo/createFiles/src/create.txt");
        BufferedReader reader = new BufferedReader(new FileReader(coursegrades));
        String name = reader.readLine();
        String course = reader.readLine();
        String grades = reader.readLine();
        System.out.println("Grade report for " + name);
        System.out.println("Favourite course is: " + course);
        System.out.println("His last 3 grades in this course were: " + grades);
        payroll();
    }
    public static void payroll() throws IOException {
        File payroll = new File("/javarepo/createFiles/src/payroll.txt");
        BufferedReader reader = new BufferedReader(new FileReader(payroll));
        String employee;
        boolean remainingworkers;
        do {
            employee = reader.readLine();
            System.out.println(employee);
            if (employee.isBlank()) {
                remainingworkers = false;
            } else {
                remainingworkers = true;
            }
        } while(remainingworkers);
        

    }
}
