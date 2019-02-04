package mcdermid.connor;

public class Main {
    public static void main(String[] args) {
        System.out.println(go(7));
    }
    public static int go(int x) {
        int q=0;
        while (x > 0) {
            q = q + x;
            x = x - 1;
        }
        return q;
    }
}