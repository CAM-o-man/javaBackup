/**
 * Author: Connor McDermid
 * Lab 5.3
 * Extra: Homemade modules
 * NOTE: Due to how Repl.it works, I'll be commenting out my constructor and making a local method for asterisks();
 */
//TODO: Finish chars(). Possible discriminant required
package hendricks.geoLab;
import mcdermid.connor.database;
@SuppressWarnings({"SingleStatementInBlock", "DanglingJavadoc"})
public class Main {

    public static void main(String[] args) {
        database d = new database();
        System.out.print("\n");
        //Geometric Design 1
        for (int i = 0; i < 6; i++) {
            switch (i) {
                case 0:
                    chars(1, 0);
                    break;
                case 1:
                    chars(2, 0);
                    break;
                case 2:
                    chars(3, 0);
                    break;
                case 3:
                    chars(4, 0);
                    break;
                case 4:
                    chars(5, 0);
                    break;
                case 5:
                    chars(6, 0);
                    break;
                default:
                    System.out.println("Main.main, Case/Nested Fors");
                    System.exit(-2);
            }
            System.out.print("\n");
        }
        d.asterisks();
        rect(); //Rectangle
        d.asterisks();
        isotri(); //Isosceles Triangle
        d.asterisks();
        orect(); //Open Rectangle
        d.asterisks();
        otri(); //Open Triangle
        d.asterisks();
    }
    public static void rect() {
        System.out.print("\n");
        for (int i = 0; i < 3; i++) {
            chars(7, 1);
            System.out.print("\n");
        }

    }
    public static void isotri() {
        for (int i  = 0; i < 5; i++) {
            switch (i) {
                case 0:
                    spaces(4);
                    chars(1, 2);
                    break;
                case 1:
                    spaces(3);
                    chars(3, 2);
                    break;
                case 2:
                    spaces(2);
                    chars(5, 2);
                    break;
                case 3:
                    spaces(1); //It pains me to do this but apparently it HAS to be a method
                    chars(7, 2);
                    break;
                case 4:
                    chars(9, 2);
                    break;
                default:
                    System.out.println("Main.isotri");
                    System.out.println("Case/Nested Fors");
                    System.exit(-2);
            }
        }
    }
    public static void orect() {
        System.out.print("\n");
        for (int i = 0; i < 5; i++) {
            if (i == 1 || i == 2 || i == 3) {
                chars(1, 3);
                spaces(6);
                chars(1, 3);
            }
            else {
                chars(8, 3);
            }
            System.out.print("\n");
        }
    }
    public static void otri() {
        System.out.print("\n");
        for (int i = 0; i < 5; i++) {
            switch (i) {
                case 0:
                    spaces(4);
                    chars(1, 4);
                    break;
                case 1:
                    spaces(3);
                    chars(1, 4);
                    spaces(1); //Why.
                    chars(1, 4);
                    break;
                case 2:
                    spaces(2);
                    chars(1, 4);
                    spaces(3);
                    chars(1, 4);
                    break;
                case 3:
                    spaces(1); //But doing it here would be so much more PRACTICAL and would save resources!
                    chars(1, 4);
                    spaces(5);
                    chars(1, 4);
                    break;
                case 4:
                    chars(9, 4);
                    break;
                default:
                    System.out.println("Main.otri, Case/Nested Fors");
                    System.exit(-2);
            }
            System.out.print("\n");
        }
    }
    public static void spaces(int spaces) {
        /**
         * This takes the input of what is required and runs it through a for loop printing spaces
         **/
        try { //Added because I'm not sure if running through a for with spaces == 1 is a runtime error
            for (int i = 0; i < spaces; i++) {
                System.out.print(" "); //Prints a space
            }
        } catch (Exception e) {
            System.out.println("Main.spaces");
            System.out.println("THis failed for SOME REASON. Check the error message.");
            throw e;
        }
    }
    public static void chars(int chars, int func) {
        char x;
        switch (func) {
            case 0:
                x = '$';
                break;
            case 1:
                x = '%';
                break;
            case 2:
                x = '#';
                break;
            case 3:
                x = '&';
                break;
            case 4:
                x = '@';
                break;
            case 5:
                x = '@';
                break;
            default:
                System.out.println("Main.chars");
                System.out.println("Origin Sort");
                System.exit(-3);
                x = 'x'; //Will NEVER be executed, just put there to prevent an error on line 184
                break;
        }
        try {
            for (int i = 0; i < chars; i++) {
                System.out.print(x); //Would have thrown "variable might not have been initialized" if not for line 179
            }
        } catch (Exception e) {
            System.out.println("Main.chars");
            System.out.println("Failure Line 208");
            throw e;
        }

    }
}
