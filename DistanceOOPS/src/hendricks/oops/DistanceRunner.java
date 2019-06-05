package hendricks.oops;

import java.util.Scanner;

/**
 * @author Connor McDermid
 * @lab Distance
 * @date 2019.06.03
 * This finds the distance between 2 points.
 */
public class DistanceRunner {

    public static void main(String[] args) {
        int x1, y1, x2, y2;
        Scanner input = new Scanner(System.in);
        System.out.println("Please input x1, y1, x2, and y2, in that order.");
        x1 = input.nextInt();
        y1 = input.nextInt();
        x2 = input.nextInt();
        y2 = input.nextInt();

        Distance dist = new Distance(x1, y1, x2, y2);

        System.out.printf("%.3f\n", dist.getDistance());
    }
}
