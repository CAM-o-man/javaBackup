package hendricks.lab818;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Connor McDermid
 * Lab: 8.18
 * Extra: Sorting objects
 */
public class Main {

    public static void main(String[] args) {
        int[] IDs = new int[] {
                123456,
                124563,
                134522,
                143266,
                145667,
                187622,
                164522
        };
        String[] names = new String[] {
                "Smith, Kevin",
                "Jones, Sarah",
                "Kelly, Jonathan",
                "Clift, Edward",
                "Ogden, Beatrice",
                "Walter, Benjamin",
                "Edwards, Steven"
        };
        int[] hours = new int[] {
                144,
                134,
                130,
                146,
                133,
                120,
                124
        };
        double[] gpas = new double[] {
                3.0,
                2.5,
                3.5,
                1.5,
                4.0,
                3.0,
                1.8
        };
        //Actually, sorting parallel arrays is kind of difficult. I'll not bother.
        Student[] students = new Student[7];

        for (int i = 0; i < names.length; i++) { //Populate objects
            students[i] = new Student();
            students[i].name = names[i];
            students[i].ID = IDs[i];
            students[i].hours = hours[i];
            students[i].gpa = gpas[i];
        }

        //Sort objects
        Comparator<Student> comp = Comparator.comparing(o -> o.name);
        Arrays.sort(students, comp);
        for (Student student : students) { //Hoping foreach will work
            if (student.gpa > 2.0) {
                if (student.hours > 132) {
                    student.grad = true;
                } else {
                    student.grad = false;
                    student.reason = "Not enough hours";
                }
            } else if (student.hours < 132) {
                student.grad = false;
                student.reason = "not enough GPA or hours.";
            } else {
                student.grad = false;
                student.reason = "Not enough GPA";
            }
        }



        for (Student student: students) {
            if (student.grad) {
                System.out.println(student.ID + " " + student.name + " is graduating!");
            } else {
                System.out.println(student.ID + " " + student.name + " is not graduating. " + student.reason);
            }
        }
    }


}

class Student {
    String name;
    int ID;
    int hours;
    double gpa;
    boolean grad;
    String reason;
    Student() {}
}
