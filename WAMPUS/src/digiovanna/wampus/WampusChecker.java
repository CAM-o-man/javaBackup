package digiovanna.wampus;

import java.util.Random;

public class WampusChecker extends Thread {
    public static void run(Chamber[][] map, Player protag) {
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 2; j++) {
                try {
                    map[i][j].WampusCheck();
                } catch (WampusMoveAlert e) {
                    //Trigger wampus move

                    try {
                        if (map[i][j].wamp.isAggro) {
                            // Player can ONLY move back through the door he came from if he chooses not to scare the Wampus.
                            // Because of this, we can simply have the Wampus move to the room the player is currently in.
                            // This will happen after the player moves, so he will "follow" the player.
                            //FIXME: Oh god the logic is all wrong
                            //FIXME: There is so much to be done.

                        } else {
                            int next = rand.nextInt(2);
                            if (next == 0) {
                                map[i + 1][j].containsWampus = true;
                                map[i + 1][j].wamp = new Wampus();
                            } else if (next == 1) {
                                if (j == 0) {
                                    map[i][1].containsWampus = true;
                                    map[i][1].wamp = new Wampus();
                                } else {
                                    map[i][0].containsWampus = true;
                                    map[i][0].wamp = new Wampus();
                                }
                            } else if (next == 2) {
                                map[i - 1][j].containsWampus = true;
                                map[i - 1][j].wamp = new Wampus();
                            }
                        }
                        map[i][j].wamp = null;
                        map[i][j].containsWampus = false;
                    } catch (NullPointerException | IndexOutOfBoundsException g) {
                        System.out.println("You hear a loud thump.");
                    }
                }
            }
        }
    }
}
