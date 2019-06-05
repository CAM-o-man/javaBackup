package digiovanna.wampus;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

/**
 * The Player class is the Player. It has several methods to check whether or not it is dead, and contains fireworks to
 * scare the Wampus. It also records the room it is currently in.
 */
public class Player implements ActionListener {
    int fireworks = 6;
    int[] currentRoom;
    boolean exists = true;
    Player(int[] cr) {
        this.currentRoom = cr;
    }

    /**
     * This checks adjacent rooms to give clues to the player.
     * @param cr The current room @DEPRECATED
     * @param map
     */
    @SuppressWarnings("Duplicates")
    void checkAdjacent(int[] cr, Chamber[][] map) { //cr for current room
        int x = cr[0]; //TODO: Replace with this.currentRoom
        int y = cr[1];
        try {
            if (map[x + 1][y].isExit || map[x - 1][y].isExit) {
                System.out.println("You can feel a draft.");
            }
        } catch (IndexOutOfBoundsException | NullPointerException e) {
            try {
                Chamber test = map[x + 1][y];
            } catch (IndexOutOfBoundsException | NullPointerException f) {
                System.out.println("The chamber above you is blocked by a cave-in.");
            } finally {
                System.out.println("The chamber below you is blocked by a cave-in.");
            }
        }
        if (y == 1) {
            if (map[x][0].isExit) {
                System.out.println("You can feel a draft.");
            }
            if (map[x][0].isHazard) {
                System.out.println("You feel a chill run down your spine.");
            }
            if (map[x][0].containsWampus) {
                System.out.println("You can smell a Wampus nearby.");
                if (map[x][0].wamp.isAggro) {
                    System.out.println("A Wampus roars.");
                }
            }
        } else if (y == 0) {
            if (map[x][1].isExit) {
                System.out.println("You can feel a draft.");
            }
            if (map[x][1].isHazard) {
                System.out.println("You feel a chill run down your spine.");
            }
            if (map[x][1].containsWampus) {
                System.out.println("You can smell a Wampus nearby.");
                if (map[x][1].wamp.isAggro) {
                    System.out.println("A Wampus roars.");
                }
            }
        }
        try {
            if (map[x + 1][y].isHazard || map[x - 1][y].isHazard) {
                System.out.println("You feel a chill run down your spine.");
            }
        }  catch (IndexOutOfBoundsException | NullPointerException e) {
            try {
                Chamber test = map[x + 1][y];
            } catch (IndexOutOfBoundsException | NullPointerException f) {
                System.out.println("The chamber above you is blocked by a cave-in.");
            }
        }
        try {
            if (map[x + 1][y].containsWampus || map[x - 1][y].containsWampus) {
                System.out.println("You can smell a Wampus nearby.");
                if (map[x + 1][y].wamp.isAggro || map[x - 1][y].wamp.isAggro) {
                    System.out.println("A Wampus roars.");
                }
            }
        }  catch (IndexOutOfBoundsException | NullPointerException e) {
            try {
                Chamber test = map[x + 1][y];
            } catch (IndexOutOfBoundsException | NullPointerException f) {
                System.out.println("The chamber above you is blocked by a cave-in.");
            }
        }
        if (map[x][y].isExit) {
            System.out.println("Congratulations! You win!");
            System.exit(1000);
        }
    }

    /**
     * This moves the Player.
     * @param x The direction in which to move. 1 is up, 2 is down, 3 is sideways.
     */
    void move(int x) {
        if (x == 1) {
            this.currentRoom[0] = currentRoom[0] + 1; //Don't know if += or -= works in arrays
        } else if (x == 2) {
            this.currentRoom[0] = currentRoom[0] - 1;
        } else if (x == 3) {
            if (this.currentRoom[1] == 0) {
                this.currentRoom[1] = 1;
            } else {
                this.currentRoom[1] = 0;
            }
        }
    }

    /**
     * Checks if the player is currently standing in a hazard, and if that hazard kills him.
     * @param map The <code>Chamber</code> map.
     * @return A boolean value, <code>true</code> if the player is, in fact, dead.
     */
    boolean isDead(Chamber[][] map) {
        if (map[this.currentRoom[0]][this.currentRoom[1]].isHazard && map[this.currentRoom[0]][this.currentRoom[1]].isPit) {
            System.out.println("You fell into a pit and died!");
            return true;
        } else if (map[this.currentRoom[0]][this.currentRoom[1]].containsWampus) {
            if (this.fireworks > 6) {
                map[this.currentRoom[0]][this.currentRoom[1]].wamp.WaitingPeriod = 0;
                this.fireworks--;
                return false;
            } else {
                map[this.currentRoom[0]][this.currentRoom[1]].wamp.isAggro = true;
            }
        } else {
            return false;
        }
        return false;
    }

    /**
     * DEPRECATED
     * @param map the chamber map
     * @throws WampusMoveAlert your mother
     */
    @Deprecated
    void scare(Chamber[][] map) throws WampusMoveAlert {
        Scanner input = new Scanner(System.in);
        System.out.println("You have " + this.fireworks + " fireworks remaining.\n Scare the Wampus? [Y|N]");
        if (input.nextLine().equals("Y")) {
            map[this.currentRoom[0]][this.currentRoom[1]].wamp.isScared = true;
            throw new WampusMoveAlert(1);
        }
    }

    boolean inWampRoom(Chamber room) {
        return room.containsWampus;
    }

    public void actionPerformed(ActionEvent e) {

    }

}
