package digiovanna.wampus;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    /**
     * Main method. All user interaction happens here, with minimal exceptions.
     * @param args
     */
    public static void main(String[] args) {
        Player protag = null;
        Random ayn = new Random();
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
                    if (ayn.nextBoolean()) {
                        map[i][j] = new Chamber(true, false, false, false, true, false, false);
                        hazards--;
                    }
                } else if (hazards > 0 && pit) {
                    if (ayn.nextBoolean()) {
                        map[i][j] = new Chamber(true, false, false, true, false, false, false);
                        pit = false;
                        hazards--;
                    } else if (ayn.nextBoolean()) {
                        map[i][j] = new Chamber(true, false, false, false, true, false, false);
                        hazards--;
                    }
                } else {
                    if (unfilledStart) {
                        if (ayn.nextBoolean()) {
                            map[i][j] = new Chamber(false, false, true, false, false, false, false);
                            unfilledStart = false;
                            int[] temp = { i, j };
                            protag = new Player(temp);
                        }
                    }
                    if (lackOfDiscord) {
                        if (ayn.nextBoolean()) {
                            map[i][j] = new Chamber(false, false, false, false, false, true, true);
                        }
                    }
                    if (noExit) {
                        if (ayn.nextBoolean()) {
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
            WampusChecker.run(map, protag); //WampusChecker needs an instance of Player in order to have the aggro function work.

            //Check player surroundings.
            protag.checkAdjacent(protag.currentRoom, map);
            //Begin next turn.
            turns++;
        }

    }


    public static void rules() {
        System.out.println("The rules are simple. You are trapped in a cave system looking for the exit.");
        System.out.println("There is one randomly-generated exit location.");
        System.out.println("There is a Wampus in the cave. He will move around at random every 2 turns." +
                "\n If you encounter him, you must scare him. You have a number of fireworks to scare him with. If you run out and encounter the Wampus again, \n" +
                "\n you will immediately leave through the same exit. The Wampus will become aggravated, and will attempt to eat you." +
                "\n He will chase you for 2 turns. During this time, he cannot be scared. If he encounters you, he will eat you." +
                "\n There is one room in the cave with a pit. If you fall into it, you will die." +
                "\n There are 3 rooms with bats. You are scared of bats. If you encounter them, you will leave through the same entrance you came through.");

    }
}

