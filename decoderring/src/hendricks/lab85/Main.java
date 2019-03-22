package hendricks.lab85;

/**
 * @author Connor McDermid
 * Lab: 8.5
 * Extra: StringBuilder
 */
public class Main {

    private static String[] code = new String[] {
            "AH3ae",
            "LaePlc",
            "QptAr",
            "BrCiot",
            "5mOst",
            "G3eHt",
            "Sheb",
            "W4B6yT",
            "7S4X",
            "aaeSa"
    };
    public static void main(String[] args) {
        StringBuilder message = new StringBuilder();
        for (int i = 0; i < code.length; i++) {
            if (i % 2 == 0) {
                message.append(code[i].charAt(1));
            } else {
                message.append(code[i].charAt(2));
                message.append(code[i].charAt(4));
            }
        }
        System.out.println(message);
    }
}
