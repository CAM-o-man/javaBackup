package digiovanna.wampus;

/**
 * The Chamber object is what each room is made out of. It contains data about the state of the room, and
 * can also be ordered to perform checks on itself for Wampi.
 */
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
    //boolean containsPlayer;
    Wampus wamp = null;

    /**
     * When creating a room, each state variable must be assigned, typically via RNG in Main
     * @param haz A Boolean designating whether or not this Chamber contains a hazard.
     * @param x A Boolean designating whether or not this Chamber contains the exit.
     * @param start A Boolean designating whether or not this Chamber is a player spawn point.
     * @param pit A Boolean designating whether or not this Chamber contains a death pit.
     * @param bats A Boolean designating whether or not this Chamber contains bats. If this is true, Hazard must be true.
     * @param discord A Boolean designating whether or not this Chamber is the spawn point for a Wampus.
     * @param wampus A Boolean designating whether or not this Chamber currently contains a Wampus.
     */
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

    /**
     * This method checks the room to see if it contains a Wampus. If it does, it will tick down the waiting period timer
     * and trigger a move accordingly.
     * @throws WampusMoveAlert If the Wampus will move this turn, this is thrown so it can be caught by WampusChecker.
     */
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
