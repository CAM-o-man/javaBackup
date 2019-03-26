package hendricks.lab89;

import mcdermid.connor.Database.Database;
import org.jetbrains.annotations.NotNull;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Database base = new Database();
        String[] array1 = new String[] {
                "camel",
                "ant",
                "dog",
                "cat",
                "horse",
                "mule",
                "java",
                "goose"
        };
        System.out.println("Unsorted: " + Arrays.toString(array1));
        System.out.println("Sorted: " + Arrays.toString(sortAlphaOrder(array1)));
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the names of 5 friends.");
        String[] friends = new String[5];
        for (int i = 0; i < 5; i++) {
            friends[i] = input.nextLine();
        }
        System.out.println("Unsorted: " + Arrays.toString(friends));
        String[] FriendsAlphaOrder = sortAlphaOrder(friends);
        System.out.println("Sorted: " + Arrays.toString(FriendsAlphaOrder));
        int pos = -1;
        for (int i = 0; i < 5; i++) {
            if (FriendsAlphaOrder[i].equalsIgnoreCase("Oscar")) {
                pos = i;
            }
        }
        if (pos > -1) {
            System.out.println("Oscar found at index " + pos);
        } else {
            System.out.println("Oscar not found.");
        }
        System.out.println("Please input 10 computer terms.");
        String[] terms = new String[10];
        for (int i = 0; i < 10; i++) {
            terms[i] = input.nextLine();
        }
        System.out.println("Unsorted" + Arrays.toString(terms));
        String[] sortedterms = sortAlphaOrder(terms);
        System.out.println("Sorted:" + Arrays.toString(sortedterms));
        //noinspection AccessStaticViaInstance
        int index = base.binarySearch(sortedterms, 0, 10, "mouse");
        if (index != -1) {
            System.out.println("The word \"mouse\" was found at index " + index + " in the sorted array.");
        } else {
            System.out.println("The word \"mouse\" was not found.");
        }
    }
    @SuppressWarnings("UnnecessaryContinue") //Just a bit more informative.
    private static String[] sortAlphaOrder(@NotNull String[] arr) {
        String temp;
        boolean swap = false;
        do {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) == 0) {
                    swap = false;
                    continue;
                } else if (arr[j].compareTo(arr[j + 1]) > 0) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    swap = true;
                } else {
                    swap = false;
                    continue;
                }
            }
        } while (swap);

        return arr;
    }
}
