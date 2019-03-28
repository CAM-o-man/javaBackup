package hendricks.lab811;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    @SuppressWarnings("Duplicates")
    public static void main(String[] args) {
        /*Person frank = new Person();
        frank.name = "Gomes, Frank";
        frank.cid = 83193810;
        frank.mid = 0;
        frank.code = 5;
        frank.day = 3;
        Person tejas = new Person();
        tejas.name = "Mehta, Tejas";
        tejas.cid = 42746829;
        tejas.mid = 1;
        tejas.code = 1;
        tejas.day = 0;
        Person sanay = new Person*/
        Person[] people = new Person[10];

        String[][] customers = new String[][] { // I made this first and realised it was terribly inefficient.
                {"Gomes, Frank", "83193810", "0000001", "5", "3"},
                {"Mehta, Tejas", "42746829", "0000002", "1", "0"},
                {"Daptardar, Sanay", "7832", "0000003", "5", "9"},
                {"Stulak, Brendan", "84384", "0000004", "1", "1"},
                {"Ewell, Bob", "7502384798", "0000005", "5", "21634"},
                {"Gordon, Joe", "293042093", "0000006", "5", "6"},
                {"Mother, Your", "83192010", "0000007", "1", "2"},
                {"Christianssen, Hans", "0", "0000008", "5", "7"},
                {"Daley, George", "3921731", "0000009", "1", "10"},
                {"Sigda, Filip", "38291093", "0000010", "5", "2"}
        };
        for (int i = 0; i < 10; i++) {
            people[i] = new Person();
            for (String[] arr: customers) {
                for (int j = 0; j < 5; j++) {
                    switch(j) {
                        case 0:
                            people[i].name = arr[j];
                            break;
                        case 1:
                            people[i].cid = Integer.parseInt(arr[j]);
                            break;
                        case 2:
                            people[i].mid = Integer.parseInt(arr[j]);
                            break;
                        case 3:
                            people[i].code = Integer.parseInt(arr[j]);
                            break;
                        case 4:
                            people[i].day = Integer.parseInt(arr[j]);
                            break;
                        default:
                            System.out.println("Main.main");
                            System.out.println("An error has occurred.");
                            System.exit(-10);
                    }
                }
            }
        }

        /*
        String[] clients = new String[] {
                "Gomes, Frank",
                "Mehta, Tejas",
                "Daptardar, Sanay",
                "Stulak, Brendan",
                "Ewell, Bob",
                "Gordon, Joe",
                "Sue, Mary",
                "Christianssen, Hans",
                "Daley, George",
                "Sigda, Filip"
        };
        int[] cids = new int[] {
                83193810,
                42746829,
                7832,
                84384,
                7502,
                293042093,
                83192010,
                0,
                3921731,
                38291093
        };
        int[] mids = new int[] {
                0,
                1,
                2,
                3,
                4,
                5,
                6,
                7,
                8,
                9
        };
        int[] codes = new int[] {
                5,
                1,
                5,
                1,
                5,
                5,
                1,
                5,
                1,
                5
        };
        int[] days = new int[] {
                3,
                0,
                9,
                1,
                21634,
                6,
                2,
                7,
                10,
                2
        };*/

        //Process data:
        int counter = 0;
        for (Person person: people) {
            if (person.isLate()) {
                counter++;
            }
        }
        System.out.println(counter + " people are late.");
        Comparator<Person> comp = Comparator.comparingInt(o -> o.cid);
        Arrays.sort(people, comp);
        System.out.println("People who are late:");
        for (Person person: people) {
            if (person.isLate()) {
                System.out.println(person.name);
            }
        }
        System.out.println("People who are not late:");
        for (Person person: people) {
            if (!person.isLate()) {
                System.out.println(person.name);
            }
        }
    }

}
class Person { //Simple object for each customer
    String name;
    int cid; //Customer ID
    int mid; //Movie ID
    int code;
    int day;
    Person() {}
    boolean isLate() {
        return day > code;
    }
}
