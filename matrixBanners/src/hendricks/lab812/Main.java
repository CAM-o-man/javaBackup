package hendricks.lab812;

import mcdermid.connor.Database.Database; //My module containing things like searches and sorters

import java.util.Arrays;

/**
 * @author cam-o
 * Lab: 8.12
 * Extra: TBD
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        Database base = new Database();
        String banner1 = "Which pill will you take? The Matrix awaits.";
        String banner2 = "The Matrix has you";
        String banner3 = "Follow the White Rabbit";
        String banner4 = "Knock, knock, Neo";
        String reeves = "Keanu Reeves";
        //Banner 1
        base.asterisks(50); //Just prints out asterisks as a separator.
        banner(banner1);

        //delay
        Thread.sleep(2000);

        //banner 2
        banner(banner2);

        //banner 3
        banner(banner3);

        //banner 4
        banner(banner4);




        System.out.println();
        System.out.println();

        //Search reeves for space, print last, first
        System.out.println(reeves.substring(reeves.indexOf(" ")));
        System.out.print(", ");
        System.out.print(reeves.substring(0, reeves.indexOf(" ")));


        System.out.println();

        banner("Matrix Reloaded");
        System.out.println();
        System.out.println();

        String[] names = new String[] {
                "Neo",
                "Morpheus",
                "Trinity",
                "Smith",
                "Mouse",
                "Cypher"
        };

        String[] sortedNames = base.bubbleSort(names); //My own String bubble sort algorithm
        System.out.println(Arrays.toString(sortedNames));
    }

    private static void banner(String banner) throws InterruptedException {
        Database base = new Database();
        base.asterisks(50);
        System.out.println();
        for (int i = 0; i < banner.length(); i++) {
            System.out.print(banner.charAt(i));
            Thread.sleep(600); //Speed is just right there
        }
        System.out.println();
        base.asterisks(50);
    }
}
