package digiovanna.wampus;
/**
 * This is thrown when the Wampus moves to trigger a cascading system effect.
 */
public class WampusMoveAlert extends Exception {
    //Thrown when the Wampus moves. Triggers a cascading system effect.
    private int x = 0;
    WampusMoveAlert() {

    }
    WampusMoveAlert(int x) {
        this.x = x;
    }
}
