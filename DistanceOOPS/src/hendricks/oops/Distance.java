package hendricks.oops;


/**
 * @author Connor McDermid
 * @lab Distance
 * @date 2019.06.03
 * This finds the distance between 2 points.
 */
public class Distance {
    int x1, y1, x2, y2;
    double distance;

    Distance() {}

    Distance(int x1, int y1, int x2, int y2) {
        setCoordinates(x1, y1, x2, y2);
    }

    public void setCoordinates(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    public void calcDistance() {
        this.distance = Math.sqrt((Math.pow(this.x2 - this.x1, 2)) + (Math.pow(this.y2 - this.y1, 2)));
    }

    public double getDistance() {
        return this.distance;
    }

    @Override
    public String toString() {
        return "Class: Distance. x1: " + this.x1 + " y1: " + this.y1 + " x2: " + this.x2 + " y2: " + this.y2 + " Distance: " + this.distance;
    }
}
