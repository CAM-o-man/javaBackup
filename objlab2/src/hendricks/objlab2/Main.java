package hendricks.objlab2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the distance, then the hours, then the minutes.");
        MilesPerHour mph = new MilesPerHour(input.nextInt(), input.nextInt(), input.nextInt());

        System.out.println("To print the state of the speedometer, input 1. TO calculate your speed,\n" +
                "input 2.");
        if (input.nextInt() == 1) {
            System.out.println(mph.toString());
        } else {
            System.out.println(mph.calcMPH());
        }
    }
}

interface Template {
    int distance = 0;
    int hours = 0;
    int minutes = 0;
    double mph = 0;

    public void setNums(int dist, int hrs, int mins);

    public double calcMPH();

    public String toString();
}

class MilesPerHour implements Template {

    private int distance = 0;
    private int hours = 0;
    private int minutes = 0;
    private double mph = 0;

    public MilesPerHour() {

    }

    public MilesPerHour(int dist, int hrs, int mins) {
        setNums(dist, hrs, mins);
    }

    public void setNums(int dist, int hrs, int mins) {
        this.distance = dist;
        this.hours = hrs;
        this.minutes = mins;
    }

    public double calcMPH() {
        double dist = this.distance; //Avoiding integer division context
        double mins = this.minutes;
        double hrs = this.hours;
        double miph;

        hrs += mins / 60;
        miph = dist / hrs;
        this.mph = miph;
        return miph;
    }

    public String toString() {
        return " State Variables: Distance = " + distance + " Hours = " + hours + " Minutes = " + minutes + " MPH = " + mph + ".";
    }
}

