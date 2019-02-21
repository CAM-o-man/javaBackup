package hendricks.lab64;

public class Main {

    public static void main(String[] args) {
        String horses = "35 horses";
        int numHorse = Integer.parseInt(horses.substring(0, 2));
        System.out.println(horses + " have " + (numHorse * 4) + "legs");
        wordy();
    }
    public static void wordy() {
        String circumlocutory = "AB2CD8EF9G";
        int[] numsInString;
        for (Character object: circumlocutory.toCharArray()) {
            if (Character.isDigit(object)) {
                //TODO: yeet the digits into numsInString and then make it an int
            }
        }
    }
}
