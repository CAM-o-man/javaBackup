package hendricks.lab816;

import java.util.Scanner;

/**
 * @author Connor McDermid
 * Lab 8.16
 * Extra: Global fields
 */
public class Main {


    private String[] name = { //NOT dealing with these as parameters
            "Bowman",
            "Walker",
            "Christian",
            "Edwards",
            "Cummings",
            "Halpern",
            "Scott",
            "Rhineheart",
            "Haley",
            "Brooks"
    };

    String[] address = {
            "Canaan",
            "Newark",
            "Hardwick",
            "Montgomery",
            "Trenton",
            "Liverpool",
            "Sheridan",
            "Houston",
            "Westfield",
            "Syosset"
    };

    private String[] state = {
            "CT",
            "NJ",
            "VT",
            "AL",
            "NJ",
            "NY",
            "WY",
            "TX",
            "NJ",
            "NY"
    };

    private int[] age = {
            48,
            39,
            46,
            71,
            31,
            38,
            51,
            62,
            22,
            32
    };

    private String[] sex = {
            "M",
            "F",
            "M",
            "M",
            "M",
            "F",
            "M",
            "F",
            "F",
            "M"
    };

    // Salary in thousands
    private int[] salary = {
            18,
            27,
            59,
            78,
            25,
            45,
            19,
            91,
            33,
            40
    };

    int[] savings = {
            4200,
            3600,
            1900,
            500,
            7800,
            12000,
            400,
            53200,
            4700,
            3900
    };

    private String[] car = {
            "Saturn",
            "Olds",
            "Chev",
            "Chev",
            "Ford",
            "Chev",
            "Ford",
            "Cad",
            "Honda",
            "Ford"
    };

    int[] year = {
            2009,
            2006,
            2010,
            2013,
            2009,
            2012,
            2008,
            2017,
            2004,
            2011
    };

    /**
     * User interface method
     * @param args N/A
     * @throws InterruptedException Links to methods that use <code>Thread.sleep()</code>
     */
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        Main main = new Main(); //Disgusting workaround to static vs. non-static contexts




        //Begin user interface

        System.out.println("Please enter the case number.");
        int auth = input.nextInt();
        if (auth == 1) {
            System.out.println("Welcome, Inspector Holmes. Preparing your data...");
            main.holmes(); //TODO: Give methods a proper return.
        } else if (auth == 2) {
            main.clouseau();
        } else if (auth == 3) {
            main.simon();
        } else if (auth == 4) {
            main.panther();
        }
    }

    /**
     * Method producing results for Inspector Holmes case 1
     * @throws InterruptedException Uses <code>Thread.sleep()</code>
     */
    @SuppressWarnings("Duplicates")
    public void holmes() throws InterruptedException {
        System.out.println("Finding all:\n" +
                "* Men\n" +
                "* over 30\n" +
                "* Ford owners\n" +
                "* Income over 20000\n");
        Thread.sleep(2000); //Just for aesthetics
        boolean[] sexMatches = new boolean[10];
        boolean[] ageMatches = new boolean[10];
        boolean[] carMatches = new boolean[10];
        boolean[] incomeMatches = new boolean[10];
        for (int i = 0; i < name.length; i++) {
            sexMatches[i] = sex[i].equals("M");
            ageMatches[i] = age[i] >= 30;
            carMatches[i] = car[i].equals("Ford");
            incomeMatches[i] = salary[i] >= 20;
        }
        System.out.println("The following people match these criteria:");
        for (int i = 0; i < name.length; i++) {
            if (sexMatches[i] && ageMatches[i] && carMatches[i] && incomeMatches[i]) {
                System.out.println(name[i]);
            }
        }

    }

    /**
     * Gives results for Inspector Clouseau case 2
     * @throws InterruptedException Uses <code>Thread.sleep()</code>
     */
    @SuppressWarnings("Duplicates")
    public void clouseau() throws InterruptedException{
        System.out.println("Welcome, Inspector Clouseau. Preparing your data...");
        System.out.println("Finding all:\n" +
                "* Chevy, Ford, and Honda owners\n" +
                "* Salary above 15000\n" +
                "* Savings below 2000");
        Thread.sleep(2000);
        boolean[] carMatches = new boolean[10];
        boolean[] salaryMatches = new boolean[10];
        boolean[] savingsMatches = new boolean[10];
        for (int i = 0; i < name.length; i++) {
            carMatches[i] = car[i].equals("Ford") || car[i].equals("Honda") || car[i].equals("Chev");
            salaryMatches[i] = salary[i] >= 15;
            savingsMatches[i] = savings[i] <= 2000;
        }
        System.out.println("The people who match these criteria are...");
        for (int i = 0; i < name.length; i++) {
            if (carMatches[i] && salaryMatches[i] && savingsMatches[i]) {
                System.out.println(name[i]);
            }
        }
    }

    /**
     * Prints results for Inspector Simon case 3
     * @throws InterruptedException Uses <code>Thread.sleep()</code>
     */
    public void simon() throws InterruptedException {
        System.out.println("Welcome, Inspector Simon. Preparing your data...");
        System.out.println("Finding all:\n" +
                "* Females\n" +
                "* With cars");
        Thread.sleep(2000);
        for (int i = 0; i < name.length; i++) {
            if (sex[i].equals("F")) {
                System.out.print(" [ " + name[i] + " " + car[i] + " " + year[i] + "] ");
                System.out.println();
            }
        }
    }

    /**
     * Prints results for Pink Panther case 4
     * @throws InterruptedException Uses <code>Thread.sleep()</code>
     */
    @SuppressWarnings("Duplicates")
    public void panther() throws InterruptedException {
        System.out.println("Welcome, [UNDERCOVER AGENT]");
        System.out.println("Finding all:\n" +
                "* Men\n" +
                "* Under 35\n" +
                "* Ford owner\n" +
                "* NJ plates");
        Thread.sleep(2000);
        boolean[] ageMatches = new boolean[10];
        boolean[] sexMatches = new boolean[10];
        boolean[] carMatches = new boolean[10];
        boolean[] stateMatches = new boolean[10];
        for (int i = 0; i < name.length; i++) {
            ageMatches[i] = age[i] < 35;
            sexMatches[i] = sex[i].equals("M");
            carMatches[i] = car[i].equals("Ford");
            stateMatches[i] = state[i].equals("NJ");
        }
        System.out.println("The following people match these criteria:");
        for (int i = 0; i < name.length; i++) {
            if (ageMatches[i] && sexMatches[i] && carMatches[i] && stateMatches[i]) {
                System.out.println(name[i]);
            }
        }
    }
}
