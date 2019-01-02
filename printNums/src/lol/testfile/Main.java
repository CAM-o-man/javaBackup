package lol.testfile;

public class Main {

    public static void main(String[] args) {
        int[] number = new int[42];
        int x = 0;
        for (int i = 0; i <= 40; i++) {
            number[i] = i;
        }
        do {
            System.out.println(number[x++]);
        } while (x <= 41);
    }
}
