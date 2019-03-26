package hendricks.lab810;

/**
 * @author Connor McDermid
 * Lab 8.10
 * Extra: StringBuilders
 */
public class Main {

    public static void main(String[] args) {
        //noinspection SpellCheckingInspection
        String[] cipher = new String[] {
                "Nexa2f5",
                "Z52Bizlm",
                "Diskapr",
                "emkem9sD",
                "LaWYr4Us",
                "dAStn78L",
                "mPTuriye",
                "aaeeiuUu",
                "IL8Ctmpn",
        };
        StringBuilder deciphered = new StringBuilder();
        for (int i = 0; i < cipher.length; i++) {
            if (i % 2 == 0) {
                deciphered.append(cipher[i].charAt(4));
            } else {
                deciphered.append(cipher[i].charAt(2));
                deciphered.append(cipher[i].charAt(3));
            }
        }
        System.out.println(deciphered.toString());
    }
}
