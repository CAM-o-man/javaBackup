package hendricks.lab811;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    @SuppressWarnings("Duplicates")
    public static void main(String[] args) {
        Person[] people = new Person[10];

        String[][] customers = new String[][] { // I made this first and realised it was terribly inefficient.
                {"Gomes, Frank", "93810", "1", "5", "3"},
                {"Mehta, Tejas", "46829", "2", "1", "0"},
                {"Daptardar, Sanay", "7832", "3", "5", "9"},
                {"Stulak, Brendan", "84384", "4", "1", "1"},
                {"Ewell, Bob", "84798", "5", "5", "21634"},
                {"Gordon, Joe", "2093", "6", "5", "6"},
                {"Mother, Your", "2010", "7", "1", "2"},
                {"Christianssen, Hans", "0", "8", "5", "7"},
                {"Daley, George", "3931", "9", "1", "10"},
                {"Sigda, Filip", "1093", "10", "5", "2"}
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
