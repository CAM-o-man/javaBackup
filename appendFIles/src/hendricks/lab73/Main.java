package hendricks.lab73;
import org.jetbrains.annotations.NotNull;

import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        File dog = new File("dog.txt");
        FileOutputStream appendStream = new FileOutputStream(dog, true);
        readFile(dog);
        //_____________________________________________________________________________________________________
        //Add dogs to file
        String dog1 = "\nBeatrice, 3";
        String dog2 = "\nTasha 4";
        String dog3 = "\nPatty 1";
        appendStream.write(dog1.getBytes());
        appendStream.write(dog2.getBytes());
        appendStream.write(dog3.getBytes());
        System.out.println("File updated. Reading.");
        readFile(dog);
    }

    private static void readFile(File dog) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(dog));
        boolean dogs;
        String line;
        int age;
        String name;
        do {
            line = reader.readLine();
            if (line != null) {
                dogs = true;
                age = parser(line);
                name = nameGet(line);
                if (age > 7) {
                    System.out.println(name + " OLD DOG");
                } else {
                    System.out.println(name + " YOUNG DOG");
                }
            } else {
                dogs = false;
            }
        } while(dogs);
    }

    public static int parser(@NotNull String s) {
        String age = s.substring(s.indexOf(' ') + 1);
        int realage = Integer.parseInt(age);
        return realage;
    }
    public static String nameGet(@NotNull String s) {
        String name = s.substring(0, s.indexOf(' '));
        return name;
    }
}
