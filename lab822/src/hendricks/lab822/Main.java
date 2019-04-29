package hendricks.lab822;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println("Please input 10 integers, excluding 0.");
        ArrayList<Integer> odd = new ArrayList<>(); //Using arraylists because I don't know how many odds and evens there will be
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            try {
                array[i] = takeInput();
            } catch (zeroException e) {
                System.out.println(e.message);
                i--;
            }
        }
        for (int obj: array) {
            if (obj > 0 && obj % 2 == 0) {
                even.add(obj);
            } else if (obj > 0 && obj % 2 != 0) {
                odd.add(obj);
            } else {
                negative.add(obj);
            }
        }

        print(odd, even, negative);
    }

    public static int takeInput() throws zeroException {
        Scanner input = new Scanner(System.in);
        int temp = input.nextInt();
        if (temp == 0) {
            throw new zeroException();
        }
        return temp;
    }
    public static void print(ArrayList<Integer> odd, ArrayList<Integer> even, ArrayList<Integer> negative) {
        System.out.println("________Odds_________");
        for (Integer obj: odd) {
            System.out.println(obj);
        }
        System.out.println("________Even_________");
        for (Integer obj: even) {
            System.out.println(obj);
        }
        System.out.println("______Negatives______");
        for (Integer obj: negative) {
            System.out.println(obj);
        }
    }
}

class zeroException extends Exception {
    String message = "I TOLD you not to input zero!";
    zeroException() {}
}
