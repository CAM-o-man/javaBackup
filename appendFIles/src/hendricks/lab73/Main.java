package hendricks.lab73;
import org.jetbrains.annotations.*;

import java.io.*;

/**
 * @author Connor McDermid
 * Date - 2019.03.15
 * Lab - 7.3
 * Extra: Javadoc and annotations.
 */
public class Main {
    /**
     * All file writing occurs here.
     * This is also the place where other methods are called.
     * @param args Should be null
     * @throws IOException Writes to file
     */
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

    /**
     * This reads the file and appends <code>"Young Dog"</code> or <code>"Old Dog"</code> while printing existing dog names in file
     * @param dog File containing dog names. Cannot be null.
     * @throws IOException Reads from <code>File dog</code>
     */
    private static void readFile(@NotNull File dog) throws IOException {
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

    /**
     * This takes a string parameter, and separates the age to return it.
     * @param s String containing dog name and age, cannot be null
     * @return Dog age
     */
    private static int parser(@NotNull String s) {
        String age = s.substring(s.indexOf(' ') + 1);
        int realage = Integer.parseInt(age);
        return realage;
    }

    /**
     * This takes the dog name and age as an argument and returns the name.
     * @param s Dog name and age, cannot be null.
     * @return Dog name
     */
    private static String nameGet(@NotNull String s) {
        String name = s.substring(0, s.indexOf(' '));
        return name;
    }
}
