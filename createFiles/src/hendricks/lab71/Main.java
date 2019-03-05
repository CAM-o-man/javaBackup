package hendricks.lab71;
import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Main {
    /**
     * Connor McDermid
     * Lab 7.1
     * Extra: System-specific line breaks
     * @param args
     * @throws IOException
     */

    public static void main(String[] args) throws IOException {
        File create = new File("create.txt"); //Should use a relative path and put it in createFiles/src/hendricks/lab71/create.txt
        FileOutputStream outputStream = new FileOutputStream(create);
        String name = "Connor McDermid";
        String course = "Java\n";
        String grades = "B, B, B\n";
        String teacher = "Hendricks\n";
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
               outputStream.write(userBytes); //Should append the information.
               outputStream.write(System.lineSeparator().getBytes());
           }
        } while (true);
        numbers();
    }
    public static void numbers() throws IOException {
        Scanner input = new Scanner(System.in);
        Random randgen = new Random();
        File numbers = new File("numbers.txt");
        FileOutputStream outputStream = new FileOutputStream(numbers);
        //DataOutputStream dos = new DataOutputStream(outputStream);
        System.out.println("Please input the amount of random numbers to be generated.");
        int amount = input.nextInt();
        for (int i = 0; i < amount; i++) {
            outputStream.write(Integer.toString(randgen.nextInt()).getBytes()); //Ridiculously convoluted, I know
            outputStream.write(System.lineSeparator().getBytes());
        }
            /*dos.writeUTF(Integer.toString(randgen.nextInt())); //Will write several special characters in midst of file, must fix.
        }
        String content = "";
        String line = br.readLine();
        while (line != null) {
            content = content + line + " ";
            line = br.readLine();
        }
        for (Character object: content.toCharArray()) {
            if (Character.isAlphabetic(object) || Character.isUnicodeIdentifierPart(object)) { //isUnicodeIdentifierPart might be wrong

            }
        }*/
    }

}
