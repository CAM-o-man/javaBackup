package hendricks.lab66;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //For ease of reading main() will contain nothing of substance.
        System.out.println("Your Star Wars name is " + firstname() + " " + lastName());
    }
    public static String firstname() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input your first name.");
        String firstName = input.next();
        System.out.println("Now, your last name.");
        String lastName = input.next();
        StringBuilder starwarsFirst = new StringBuilder();
        starwarsFirst.append(firstName.substring(0, 3));
        starwarsFirst.append(lastName.substring(0, 2));
        return starwarsFirst.toString();
    }
    public static String lastName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input your mother's maiden name.");
        String maidenName = input.next();
        System.out.println("Please input the town in which you were born.");
        String townName = input.next();
        StringBuilder starwarsLast = new StringBuilder();
        starwarsLast.append(maidenName.substring(0, 2));
        starwarsLast.append(townName.substring(0, 3));
        return starwarsLast.toString();
    }
}
