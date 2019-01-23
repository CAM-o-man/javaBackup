package mcdermid.connor;

public class Main {

    public static void main(String[] args) {
        int x = 6;
        System.out.println(fakefactorial(x));
    }
    private static int fakefactorial(int x) {
        int ans = 0;
        try {
            for (int i = 0; i < x; i++) {
                ans += x + (x - i);
            }
        } catch (Exception e) {
            System.out.println("Main.fakefactorial");
            throw e;
        }
        return ans;
    }
}
