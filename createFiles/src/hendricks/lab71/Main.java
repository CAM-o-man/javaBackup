package hendricks.lab71;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        File create = new File("create.txt"); //Should use a relative path and put it in createFiles/src/hendricks/lab71/create.txt
        FileOutputStream outputStream = new FileOutputStream(create);
        String name = "Connor McDermid";
        String course = "Java";
        String grades = "B, B, B";
        String teacher = "Hendricks";
        byte[] nameBytes = name.getBytes();
        byte[] courseBytes = course.getBytes();
        byte[] gradeBytes = grades.getBytes();
        byte[] teacherBytes = teacher.getBytes();
        outputStream.write(nameBytes);
        outputStream.write(courseBytes);
        outputStream.write(gradeBytes);
        outputStream.write(teacherBytes);
        payroll();
    }
    public static void payroll() throws IOException{
        Scanner input = new Scanner(System.in);
        File payroll = new File("payroll.txt");
        FileOutputStream outputStream = new FileOutputStream(payroll);
        String userinput;
        byte[] userBytes;
        System.out.println("Please enter employee information and pay on one line.");
        do {
           userinput = input.nextLine();
           if (userinput.equals(":wq")) {
               break;
           } else {
               userBytes = userinput.getBytes();
               outputStream.write(userBytes);
           }
        } while (true);
    }
    public static void numbers() {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        File numbers = new File("numbers.txt");
        FileOutputStream outputStream = new FileOutputStream(numbers);
        System.out.println("Please input the amout of random numbers to be generated.");
        int amount = input.nextInt();
        
    }

}
