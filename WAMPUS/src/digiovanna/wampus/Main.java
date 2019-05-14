package digiovanna.wampus;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Player protag = null;
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        //Will build a 2-D array of Chamber objects
        int hazards = 4;
        boolean pit = true;
        int bats = 3;
        boolean unfilledStart = true;
        boolean lackOfDiscord = true;
        boolean noExit = true;
        //Declaring and filling array
        //Each Chamber will connect only to adjacent chambers. One chamber will have an exit (through the roof, not as one of the exits)
        Chamber[][] map = new Chamber[10][2];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 2; j++) {
                if (hazards > 0 && !pit) {
                    if (rand.nextBoolean()) {
                        map[i][j] = new Chamber(true, false, false, false, true, false, false);
                        hazards--;
                    }
                } else if (hazards > 0 && pit) {
                    if (rand.nextBoolean()) {
                        map[i][j] = new Chamber(true, false, false, true, false, false, false);
                        pit = false;
                        hazards--;
                    } else if (rand.nextBoolean()) {
                        map[i][j] = new Chamber(true, false, false, false, true, false, false);
                        hazards--;
                    }
                } else {
                    if (unfilledStart) {
                        if (rand.nextBoolean()) {
                            map[i][j] = new Chamber(false, false, true, false, false, false, false);
                            unfilledStart = false;
                            int[] temp = { i, j };
                            protag = new Player(temp);
                        }
                    }
                    if (lackOfDiscord) {
                        if (rand.nextBoolean()) {
                            map[i][j] = new Chamber(false, false, false, false, false, true, true);
                        }
                    }
                    if (noExit) {
                        if (rand.nextBoolean()) {
                            map[i][j] = new Chamber(false, true, false, false, false, false, false);
                            noExit = false;
                        }
                    }
                }
                try {
                    if (map[i][j].exists) {
                        //nothing
                    }
                } catch (NullPointerException e) {
                    j--;
                }
            }
        }
        // Create Player

        // Give player hints and ask for movement

        try {
            if (protag.exists) {
                //Do nothing
            }
        } catch (NullPointerException e) {
            System.exit(-1000);
        }
        int turns = 1;
        while (true) {
            System.out.println("__________________________________\nTurn " + turns + "\n______________________________");
            System.out.println("If you would like to move up, input 1. To move down, input 2. To move sideways, input 3.");
            String loc = input.nextLine();
            try {
                if (loc.equals("debug")) {
                    //print the map
                    for (int i = 0; i < 10; i++) {
                        for (int j = 0; j < 2; j++) {
                            System.out.print(map[i][j].isExit);

                        }
                        System.out.println();
                    }
                    continue;
                } else {
                    protag.move(Integer.parseInt(loc));
                }

            } catch (IndexOutOfBoundsException  | NullPointerException e) {
                System.out.println("A wall prevented you from moving in that direction.");
            }
            //Check if the player is dead.
            if (protag.isDead(map)) {
                try {
                    System.exit(3);
                } catch (IndexOutOfBoundsException | NullPointerException e) {
                    System.out.println("Error");
                    System.out.println(Arrays.toString(e.getStackTrace()));
                    System.exit(-1);
                }
            }

            //Begin WampusCheck. This happens *after* the player moves
            WampusChecker.run(map);

            //Check player surroundings.
            protag.checkAdjacent(protag.currentRoom, map);
            //Begin next turn.
            turns++;
        }

    }
}

