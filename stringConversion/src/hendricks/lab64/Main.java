package hendricks.lab64;

/**
 * Author: Connor McDermid
 * Lab: 6.4
 * Extra: StringBuilders
 */
public class Main {

    public static void main(String[] args) {
        String horses = "35 horses";
        int numHorse = Integer.parseInt(horses.substring(0, 2));
        System.out.println(horses + " have " + (numHorse * 4) + "legs");
        wordy();
    }
    public static void wordy() {
        String circumlocutory = "AB2CD8EF9G";
        StringBuilder numstring = new StringBuilder(); //More efficient than an ArrayList, as I'd just have to iterate through the ArrayList.
        int count = 0;
        for (Character object: circumlocutory.toCharArray()) {
            if (Character.isDigit(object)) {
                numstring.append(object);
            }
        }
        int number = Integer.parseInt(numstring.toString());
        System.out.println(number);
        int sum = 0;
        while (number > 0) {
            sum = sum + (number % 10);
            number = number / 10;
        }
        System.out.println(sum);
        launch();
    }
    public static void launch() {
        String Launch = "54321";
        StringBuilder go = new StringBuilder();
        int sum = 0;
        for (Character object: Launch.toCharArray()) {
            go.append(object);
            go.append(" - ");
            sum += Integer.parseInt(Character.toString(object)); //Should get the integer from the current char
        }
        go.replace(16, 18, "GO!");
        System.out.println(go);
        System.out.println(sum + " - GO!");
        //TODO: Test program and debug
    }
}
