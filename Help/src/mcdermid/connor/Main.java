package mcdermid.connor;

public class Main {

    public static void main(String[] args) {
        String s = "Example String";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                continue;
            }
            else {
                //Debug check statement here
            }
            System.out.print(s.charAt(i));
        }
    }
}
