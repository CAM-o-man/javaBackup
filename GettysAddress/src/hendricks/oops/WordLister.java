package hendricks.oops;

import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.*;
import java.io.File;

public class WordLister {
    ArrayList<String> listmod; //Used for mutating lists in loops / recursive functions
    int reci = 0; //recursive iterator
    int count = 0; //recursive counter
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> wordlist = new ArrayList<>();
        ArrayList<String> fishlist = new ArrayList<>();
        ArrayList<String> peaselist = new ArrayList<>();
        File fish = new File("fish.txt");
        File pease = new File("pease.txt");
        File gettysburg = new File("gettysburg.txt");
        Scanner fishreader = new Scanner(fish);
        Scanner peasereader = new Scanner(pease);
        Scanner lincoln = new Scanner(gettysburg);
        Scanner input = new Scanner(System.in);
        Thread fishies = new Thread(() -> { //Iterating through this is time consuming and can be sped up with multithreading
            while(fishreader.hasNext()) {
                fishlist.add(fishreader.next());
            }
        });

        Thread porridge = new Thread(() -> {
            while(peasereader.hasNext()) {
                peaselist.add(peasereader.next());
            }
        });
        porridge.run();
        fishies.run();
        while(lincoln.hasNext()) { //This thread can iterate through gettysburg
            wordlist.add(lincoln.next());
        }



        wordlist.forEach(System.out::println);
        fishlist.forEach(System.out::println);
        peaselist.forEach(System.out::println);
        int gettysAvgLength = avglen(wordlist);
        int gettysLongest = longest(wordlist);
        System.out.println("What word would you like to search for?");
        String key = input.nextLine();
        ArrayList<String> lexiOrder = wordlist;
        Collections.sort(lexiOrder);
        WordLister lister = new WordLister();
        int wordUses = lister.count(lexiOrder, key);
        System.out.println("The average length of words in the Gettysburg Address is " + gettysAvgLength);
        System.out.println("The longest word in the Gettysburg Address is" + gettysLongest);
        System.out.println("The word you asked for was used " + wordUses + " times.");
        lister.listmod = lexiOrder;
        Set<String> allWords = lister.staticmethodavoidance(lexiOrder);
        System.out.println(Arrays.toString(allWords.toArray()));
    }

    public static int longest(ArrayList<String> list) {
        int longest = 0;
        for (String str: list) {
            if (str.length() > longest) {
                longest = str.length();
            }
        }
        return longest;
    }

    public static int avglen(ArrayList<String> list) {
        int wordnum = 0;
        int letters = 0;
        for (String str: list) {
            wordnum++;
            letters += str.length();
        }
        return letters / wordnum; //Division in integer context here is OK, can't have half a letter.
    }

    public int count(ArrayList<String> list, String key) {
        int count = 0;
        for (String str: list) {
            if (str.equalsIgnoreCase(key)) {
                count++;
            }
        }
        return count;
    }

    public Set<String> remsuper(ArrayList<String> list) { //remsuper = remove superfluous
        Set<String> allwords = new LinkedHashSet<>();
        String temp;
        for (String str: list) {
            temp = str.replaceAll("[^a-zA-Z0-9]", "");
            allwords.add(temp);
        }
        return allwords;
    }

    /**
     * Here because I want to avoid screwing things up with more than one object reference.
     * @param list Word list, the gettysburg address
     * @return The array of all words in the Address.
     */
    public Set<String> staticmethodavoidance(ArrayList<String> list) {
        listmod = list;
        return remsuper(list);
    }
}
