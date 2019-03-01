package hendricks.lab71;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
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
    }
    public static void payroll() throws IOException{
        File create = new File("payroll.txt");
        
    }
}
