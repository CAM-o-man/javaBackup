package hendricks.lab68;

public class Main {

    public static void main(String[] args) {
        String motto = "java rocks";
        for (Character object: motto.toCharArray()) {
            System.out.print(Character.toUpperCase(object)); //Only method besides making new string entirely / making stringbuilder
        }                                                    //Java strings are (annoyingly) immutable
        System.out.print("\n");
        test_taking();
    }
    public static void test_taking() {
        String attendance = "32 students";
        int students = Integer.parseInt(attendance.substring(0, 2));
        System.out.println("The " + students + " test takers will prepare " + (students * 3) + " exam papers.");
    }
}
