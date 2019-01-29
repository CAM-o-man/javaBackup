/**
 * Author: Connor McDermid
 * Date: 2019.01.29
 * Assignment: MidTerm College Lab
 * Extra: TBD
 */
package hendricks.midterm;
import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection, DanglingJavaDoc")
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the University Investigation Project.");
        System.out.println("Information is available for the following universities:");
        System.out.println("1.\t University of British Columbia" +
                "2.\t University of Victoria" +
                "3.\t Massachusetts Institute of Technology" +
                "4.\t Montclair State University");
        System.out.println("Please select one to continue.");
        try {
            int uni = input.nextInt();
            switch (uni) {
                case 1:
                    UBC();
                    break;
                case 2:
                    UVIC();
                    break;
                case 3:
                    MIT();
                    break;
                case 4:
                    MSU();
                    break;
                default:
                    System.exit(-2);
            }
        } catch (Exception e) {
            System.out.println("Main.main");
            System.out.println(e.getMessage());
            System.exit(-3);
        }



    }
    private static void UBC() {
        System.out.println("College Name: University of British Columbia\n" +
                "Undergraduate Acceptance(2018): 52,386\n" +
                "Diversity (% of males vs. females): 44%\n" +
                "Cost: 5,399 CAD\n" +
                "Fun Fact: The cost for international students is 5 times the cost as for Canadians.");
            visitAnotherUni();

    }
    private static void UVIC() {
        System.out.println("College Name: University of Victoria\n" +
                "Undergraduate Acceptance: [UNAVAILABLE]\n" +
                "Diversity: [UNAVAILABLE]\n" +
                "Cost: 5,761 CAD\n" +
                "Fun Fact: UVIC is the oldest post-secondary institution in BC");
        visitAnotherUni();
    }

    private static void visitAnotherUni() {
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to visit another university? [Y|N]");
        String autre = input.next();
        if (autre.toUpperCase().equals("Y")) {
            getToMain();
        } else {
            System.out.println("Have a nice day!");
            System.exit(1);
        }
    }

    private static void getToMain() {
        String[] pointless = new String[1]; //Required to access main()
        pointless[0] = "args";
        main(pointless);
    }
    private static void MIT() {
        System.out.println("Name: Massachusetts Institute of Technology\n" +
                "Undergraduate Acceptance(2018): 4,547\n" +
                "Diversity: 54% Male" +
                "Cost: 46,704\n" +
                "Fun Fact: MIT has an 8% acceptance rate.");
        visitAnotherUni();
    }
    private static void MSU() {
        System.out.println("Name: Montclair State University\n" +
                "Undergrad Acceptance: 16,810\n" +
                "Diversity: 39% male\n" +
                "Cost: 11,773 USD\n" +
                "Fun Fact: MSU has one of the US's most prestigious CS programs.");
        visitAnotherUni();
    }
}
