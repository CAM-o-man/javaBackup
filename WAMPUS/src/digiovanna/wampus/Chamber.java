package digiovanna.wampus;

@SuppressWarnings("WeakerAccess")
public class Chamber {
    final boolean isHazard;
    final boolean isExit;
    final boolean isStartRoom;
    final boolean isPit;
    final boolean isBats;
    final boolean isWampusStart;
    boolean containsWampus;
    final boolean exists = true;
    Wampus wamp = null;
    Chamber (boolean haz, boolean x, boolean start, boolean pit, boolean bats, boolean discord, boolean wampus) {
        this.isHazard = haz;
        this.isExit = x;
        this.isStartRoom = start;
        this.isPit = pit;
        this.isBats = bats;
        this.isWampusStart = discord;
        this.containsWampus = wampus;
        if (wampus) {
            wamp = new Wampus();
        }
    }

    public void WampusCheck() throws WampusMoveAlert {
        if (containsWampus) {
            if (wamp.WaitingPeriod == 0) {
                if (wamp.isScared) {
                    throw new WampusMoveAlert();
                }
            } else {
                wamp.WaitingPeriod--;
            }
        }
    }

}
