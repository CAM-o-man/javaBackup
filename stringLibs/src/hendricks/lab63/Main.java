package hendricks.lab63;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;
/**
 * Author: Connor McDermid
 * Mr. Hendricks
 * Lab 6.3
 * Extra: PASSWORD HASHES
 */
public class Main {

    public static void main(String[] args) throws InterruptedException, NoSuchAlgorithmException { //Required for Thread.sleep();
	    Scanner input = new Scanner(System.in);
        SecureRandom random = new SecureRandom();
        byte[] salt = new byte[16];
        random.nextBytes(salt);
        MessageDigest md = MessageDigest.getInstance("SHA-512");
	    String pass = "Correct Horse Battery Staple"; //Actually a very secure password
        byte[] hashedPassword = md.digest(pass.getBytes(StandardCharsets.UTF_8)); //Bad hash but doesn't matter
        System.out.println("Please enter the password:");
        String usr = input.nextLine();
        input.nextLine();
        byte[] usrpass = md.digest(usr.getBytes(StandardCharsets.UTF_8));
        if (Arrays.equals(usrpass, hashedPassword)) {
            System.out.println("Authenticating");
            for (int i = 0; i < 3; i++) {
                Thread.sleep(1000);
                System.out.print(".");
            }
            System.out.println("Authentication succeeded. Welcome.");
            Main main = new Main();
            main.movies();
        } else {
            System.out.println("Authenticating.");
            for (int i = 0; i < 3; i++) {
                Thread.sleep(1000);
                System.out.println(".");
            }
            System.out.println("Authentication failed. Restarting.");
            System.exit(0);
        }
    }
    public void movies() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two movie titles.");
        String title1 = input.nextLine();
        String title2 = input.nextLine();
        if (title1.length() == title2.length()) {
            System.out.println("The titles are equal in length.");
        } else if (title1.length() > title2.length()) {
            System.out.println(title1 + " has a longer title.");
        } else {
            System.out.println(title2 + " has a longer title");
        }
        words();
    }
    public void words() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two words.");
        String word1 = input.nextLine();
        String word2 = input.nextLine();
        int compare = word1.compareToIgnoreCase(word2); //Tests lexicographic order
        if (compare < 0) {
            System.out.println(word1 + "\n" + word2);
        } else if (compare > 0) {
            System.out.println(word2 + "\n" + word1);
        } else {
            System.out.println("They both begin with the same letter.");
        }
        aol();
    }
    public void aol() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input your new screen name for America Online. No spaces please.");
        String name = input.next();
        if (testWhitespace(name)) {
            name = name.concat("@aol.com");
            System.out.println(name);
        } else {
            System.out.println("This contains spaces. Please remove any spaces and try again.");
        }
        charlie();
    }
    public boolean testWhitespace(String name) { //Whitespace detector
        if (name != null) {
            for (int i = 0; i < name.length(); i++) {
                if (Character.isWhitespace(name.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }
    public void charlie() {
        Scanner input = new Scanner(System.in);
        String person = "Charlie Brown.";
        System.out.println(person.toUpperCase());
        System.out.println("Please input your name.");
        person = input.nextLine();
        System.out.println(person.toLowerCase());
        city();
    }
    public void city() { //There is probably an easier way to do this. This is far too complicated.
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the name of a city.");
        String city = input.nextLine();
        char[] cityCharArray = city.toCharArray();
        for (int i = 0; i < cityCharArray.length; i++) { //Foreach is inappropriate; does not keep track of index and does not modify
            if (Character.isUpperCase(cityCharArray[i])) {
                cityCharArray[i] = Character.toLowerCase(cityCharArray[i]);
            } else {
                cityCharArray[i] = Character.toUpperCase(cityCharArray[i]);
            }
        }
        city = String.valueOf(cityCharArray);
        System.out.println(city);
        counter();
    }
    public void counter() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a sentence.");
        String sentence = input.nextLine();
        int count = 0;
        for (Character object : sentence.toCharArray()) { //Foreach *is* appropriate here, as index doesn't matter and we're not modifying.
            //Foreach is more concise and easier to read.
            if (Character.isLowerCase(object)) {
                count++;
            }
        }
        System.out.println(count);
        Sherlock();
    }
    public void Sherlock() {
        //FOR LOOPS ARE AMAZING
        int space = -2;
        String name = "Sherlock Holmes";
        for (int i = 0; i < name.length(); i++) {
            if (Character.isWhitespace(name.charAt(i))) {
                space = i;
            }
        }
        System.out.println(name.substring(space + 1));
        findNumber();
    }
    public void findNumber() {
        String address = "West 103rd Street";
        char[] number = new char[3];
        int count = 0;
        for (Character object : address.toCharArray()) { //Foreach is acceptable here, concision is better.
            if (Character.isDigit(object)) {
                number[count] = object;
                count++;
            }
        }
        String addressNum = new String(number);
        System.out.println(addressNum);
        int num = Integer.parseInt(addressNum);
        num *= 12;
        System.out.println(num);
        ford();
    }
    public void ford() {
        String name = "Ford, Harrison";
        int printFrom = name.indexOf(',') + 1;
        System.out.println(name.substring(printFrom));
    }
}
