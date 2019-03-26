package mcdermid.connor.Database;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * @author cam-o
 * A class containing a load of useful methods for many different purposes.
 */
public class Database {
    /**
     * Just here for the constructor.
     * @param args N/A
     */
    public static void Database(String[] args) {
        //Purely for the constructor, really.
    }

    /**
     * Prints a number of asterisks, to be used as a separator.
     * @param length The number of asterisks.
     */
    public void asterisks(int length) {
        for(int i = 0; i < length; ++i) {
            System.out.print("*");
        }

    }

    /**
     * Takes a value in cents and returns a value in dollars.
     * @param cents The number of cents
     * @return The number of dollars
     */
    public String toDollars(int cents) {
        int dollars;
        for(dollars = 0; cents > 100; cents -= 100) {
            ++dollars;
        }

        String dollarString = Integer.toString(dollars);
        String centsString = Integer.toString(cents);
        return centsString;
    }

    /**
     * Prints an open triangle shape.
     */
    public static void otri() {
        System.out.print("\n");

        for(int i = 0; i < 5; ++i) {
            switch(i) {
                case 0:
                    spaces(4);
                    chars(1, 4);
                    break;
                case 1:
                    spaces(3);
                    chars(1, 4);
                    spaces(1);
                    chars(1, 4);
                    break;
                case 2:
                    spaces(2);
                    chars(1, 4);
                    spaces(1);
                    System.out.print("*");
                    spaces(1);
                    chars(1, 4);
                    break;
                case 3:
                    spaces(1);
                    chars(1, 4);
                    spaces(5);
                    chars(1, 4);
                    break;
                case 4:
                    chars(9, 4);
                    break;
                default:
                    System.out.println("Main.otri, Case/Nested Fors");
                    System.exit(-2);
            }

            System.out.print("\n");
        }

    }

    /**
     * Prints a number of spaces
     * @param x Number of spaces
     */
    @SuppressWarnings("WeakerAccess")
    public static void spaces(int x) {
        for(int i = 0; i < x; ++i) {
            System.out.print(" ");
        }

    }

    /**
     * Prints an number of characters of the chosen character.
     * @param x Number
     * @param chara Character
     */
    @SuppressWarnings("WeakerAccess")
    public static void chars(int x, int chara) {
        char pchar;
        switch(chara) {
            case 0:
                pchar = '@';
                break;
            case 1:
                pchar = '#';
                break;
            case 2:
                pchar = '$';
                break;
            case 3:
                pchar = '%';
                break;
            case 4:
                pchar = '&';
                break;
            default:
                System.out.println("database.chars");
                System.exit(-1);
                pchar = '!';
        }

        for(int i = 0; i < x; ++i) {
            System.out.print(pchar);
        }

    }

    /**
     * This takes control of the user's default web browser to navigate to a certain page.
     * @param url THe url to be navigated to.
     * @throws URISyntaxException Required declaration for browse
     * @throws IOException Required declaration for browse.
     */
    public static void navWeb(String url) throws URISyntaxException, IOException {
        Desktop dtop = Desktop.getDesktop();
        dtop.browse(new URI(url));
    }

    /**
     * This is a basic binary search algorithm for an integer array.
     * @param array The array to be searched
     * @param min The minimum bound of the array
     * @param max The maximum bound of the array
     * @param key The integer to be found within the array
     * @return Returns an integer array with 2 values: the first being the index, the second the number of comparisons. If index is -1, the item was not found.
     */
    @Contract(pure = true)
    public static int[] binarySearch(@NotNull int[] array, int min, int max, int key) {
        int[] returnValue = new int[2];
        int position;
        int comparisons = 0;

        position = (min + max) / 2;

        while(array[position] != key && min <= max) {
            if (array[position] > key) {
                max = position - 1;
            } else if (array[position] < key) {
                min = position + 1;
            } else if (array[position] == key) {
                break;       //Yes, technically under this condition the loop will break anyway, but I don't trust while loops.
            }
            position = (max + min) / 2;
            comparisons++;
        }
        if (min <= max) {
            returnValue[0] = position;
            returnValue[1] = comparisons;
            return returnValue;
        } else {
            returnValue[0] = position;
            return returnValue;
        }
    }

    /**
     * This Binary Search algorithm puts strings in alphabetical order.
     * @param array THe String array to be searched.
     * @param min The lower bound of the array.
     * @param max The upper bound of the array.
     * @param key The search term.
     * @return The index of the search term in the array.
     */
    public static int binarySearch(String[] array, int min, int max, String key) {
        int position;
        position = (min + max) / 2;

        while (!array[position].equals(key) && min <= max) {
            if (array[position].equalsIgnoreCase(key)) {
                break; //Again, under this condition loop will break anyway. Still don't trust them.
            } else if (array[position].compareTo(key) < 0) {
                min = position + 1;
            } else if (array[position].compareTo(key) > 0) {
                max = position - 1;
            }
            position = (min + max) / 2;
        }
        if (min <= max) {
            return position;
        } else {
            return -1;
        }
    }
}
