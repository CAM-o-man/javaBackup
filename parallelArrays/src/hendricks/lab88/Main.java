package hendricks.lab88;

import org.jetbrains.annotations.Contract;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] data = new String[][] {
                {"Barney Fife", "10 Warbler Rd.", "Mountainville, SC 34765" },
                {"Luke Skywalker", "R2 Death Star Ave.", "Jupiter, MD 44623" },
                {"Cruella Deville 123", "Witchey Way", "Hollywood, CA 12345" },
                {"Sally Smith", "3862 Street Blvd.", "Springfield, IL 31733" },
                {"Marsha Brady", "1970 Groovy Street", "Arlington, VA 51266" },
                {"Gomez Addams", "1 Spooky Circle", "Tombstone, AZ 63341" },
                {"John Adams", "3445 Presidential Plaza", "New York, NY 11220" },
                {"Marie Antoinette", "2 Rue Morgue", "New Orleans, LA 25993" },
                {"Albert Einstein", "7 Relativity Rd.", "Topeka KS 63121" },
                {"Mick Jagger", "100 Rolling Stone Path", "Seattle, WA 23733" },
                {"Mickey Mouse", "2 Disney Lane", "Orlando, FL 72272" },
        };
        System.out.println("Welcome to the National Terrorist Watchlist");
        System.out.println("I think.");
        System.out.println("Please input \"name\" if you would like to sort by name, \n \"city\", to sort by city, and \"zip\" to sort by zipcode.");
        String user = input.nextLine();
        if (user.equalsIgnoreCase("name")) {
            data = byLastName(data);
        } else if (user.equalsIgnoreCase("city")) {
            data = byCity(data);
        } else if (user.equalsIgnoreCase("zip")) {
            data = byZipCode(data);
        } else {
            System.out.println("That's not valid.");
        }
        System.out.println(Arrays.deepToString(data));
    }


    @Contract("_ -> param1")
    private static String[][] byLastName(String[][] data) {
        Comparator<String[]> comparator = (o1, o2) -> {
            //Get the name
            String s1 = String.valueOf(o1[0]);
            String s2 = String.valueOf(o2[0]);
            String lastNameOne = s1.substring(s1.indexOf(' '));
            String lastNameTwo = s2.substring(s1.indexOf(' '));
            char lastInit = lastNameOne.charAt(1);
            char lastInit2 = lastNameTwo.charAt(1);
            return Character.compare(lastInit, lastInit2);
        };
        Arrays.sort(data, comparator);
        return data;
    }
    @Contract("_ -> param1")
    private static String[][] byCity(String[][] data) {
        Comparator<String[]> comparator = (o1, o2) -> {
            //Get the city and state name
            String s1 = String.valueOf(o1[1]);
            String s2 = String.valueOf(o2[1]);
            return s1.compareTo(s2);
        };
        Arrays.sort(data, comparator);
        return data;
    }
    private static String[][] byZipCode(String[][] data) {
        Comparator<String[]> comparator = (o1, o2) -> {
            //Get zipcode
            String s1 = String.valueOf(o1[3]);
            String s2 = String.valueOf(o2[3]);
            String zipcodeOne = s1.substring(s1.indexOf(' ')).substring(s1.indexOf(' '));
            String zipcodeTwo = s2.substring(s2.indexOf(' ')).substring(s2.indexOf(' '));
            int zipOne = Integer.parseInt(zipcodeOne);
            int zipTwo = Integer.parseInt(zipcodeTwo);
            if (zipOne > zipTwo) {
                return 1;
            } else if (zipOne < zipTwo) {
                return -1;
            } else {
                return 0;
            }
        };
        Arrays.sort(data, comparator);
        return data;
    }
}
