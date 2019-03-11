package hendricks.lab73;
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        File dog = new File("dog.txt");
        FileOutputStream outputStream = new FileOutputStream(dog);
        FileOutputStream appendStream = new FileOutputStream(dog, true);
        BufferedReader reader = new BufferedReader(new FileReader(dog));

    }
    public static int parser(String nameandage) {
        String age = nameandage.substring(nameandage.indexOf(' '));
        int realage = Integer.parseInt(age);
        return realage;
    }
    public static String nameGet(String s) {

    }
    public static String[] dogs(String name, int age) {
        String[] dog = new String[2];
        dog[0] = name;
        if (age < 7) {
            dog[1] = "YOUNG DOG";
        } else {
            dog[1] = "OLD DOG";
        }
        return dog;
    }
}
