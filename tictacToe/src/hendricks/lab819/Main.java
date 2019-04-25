package hendricks.lab819;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
	    char[][] grid = new char[][] {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

	    welcome();

	    //Begin game

        while (true) {
            playerOne(grid, input);
            playerTwo(grid, input);
            System.out.println("Updated grid:");
            try {
                displayGrid(grid);
            } catch (runOutOfSpaceException | winnerException e) {
                break;
            }
        }
    }
    private static void welcome() throws InterruptedException {
        System.out.println("Welcome to Java Tic Tac Toe.");
        System.out.println("Ready? Player One is to the left.");
        System.out.println("3"); Thread.sleep(1000);
        System.out.println("2"); Thread.sleep(1000);
        System.out.println("1"); Thread.sleep(1000);
    }
    @SuppressWarnings("Duplicates")
    private static void playerOne(char[][] grid, Scanner input) {
        int x = 0;
        int y = 0;
            System.out.println("Updated grid:");
            halter(grid);
            x = input.nextInt();
            y = input.nextInt();
        if (grid[x][y] == ' ') {
            grid[x][y] = 'X';
            System.out.println("New grid:");
            halter(grid);
        } else {
            System.out.println("Someone's already placed something there. Sorry.");
            playerOne(grid, input); //Calls itself recursively to avoid skipping player turns.
        }

    }
    private static void playerTwo(char[][] grid, Scanner input) {
        int x;
        int y;
        try {
            displayGrid(grid);
            System.out.println("Please type the coordinates of where you'd like to place your X.");
            x = input.nextInt();
            y = input.nextInt();
        } catch (runOutOfSpaceException | winnerException e) {
            System.out.println("DRAW!");
            x = 0;
            y = 0;
        }

        if (grid[x][y] == ' ') {
            grid[x][y] = 'O';
            System.out.println("New grid:");
            halter(grid);
        } else {
            System.out.println("Someone's already placed something there. Sorry.");
            playerTwo(grid, input); //Calls itself recursively to avoid skipping player turns.
        }
    }

    private static void halter(char[][] grid) {
        try {
             displayGrid(grid);
        } catch (runOutOfSpaceException | winnerException e) {
            if (e.getClass().getSimpleName().equals("runOutOfSpaceException")) {
                System.out.println("DRAW!");
            } else if (e.getClass().getSimpleName().equals("winnerException")) {
                System.exit(2);
            }
        }
    }

    private static void displayGrid(char[][] grid) throws runOutOfSpaceException, winnerException {
        //could use loops but hardcoding will make it look better.
        for (char[] row: grid) {
            System.out.println(Arrays.toString(row));
        }
        int win;
        try {
            win = checkWinner(grid);
        } catch (winnerException e) {
            throw new winnerException(e.playerWon);
        }
        if (grid[0][0] != ' ' && grid[0][1] != ' ' && grid[0][2] != ' ' && grid[1][0] != ' ' && grid[1][1] != ' ' && grid[1][2] != ' ' && grid[2][0] != ' ' && grid[2][1] != ' ' && grid[2][2] != ' ') {

            if (win == 0) {
                throw new runOutOfSpaceException("You're run out of space but there's no winner!");
            }
        }
    }
    private static int checkWinner(char[][] grid) throws winnerException {
        for (char[] row: grid) {
            if(row[0] == row[1] && row[1] == row[2] && row[0] != 0) {
                if (row[0] == 'X') {
                    throw new winnerException(1);
                } else if (row[0] == 'O') {
                    throw new winnerException(2);
                } else {
                    //noinspection UnnecessaryContinue
                    continue;
                }
            } else {
                //noinspection UnnecessaryContinue
                continue;
            }
        }
        if (grid[0][0] == grid[1][0] && grid[1][0] == grid[2][0] && grid[0][0] != ' ' && grid[0][0] != 0) {
            if (grid[0][0] == 'X') {
                throw new winnerException(1);
            } else {
                throw new winnerException(2);
            }
        } else if (grid[0][1] == grid[1][1] && grid[1][1] == grid[2][1] && grid[0][1] != ' ') {
            if (grid[0][1] == 'X') {
                throw new winnerException(1);
            } else {
                throw new winnerException(2);
            }
        } else if (grid[0][2] == grid[1][2] && grid[1][2] == grid[2][2] && grid[0][2] != ' ') {
            if (grid[0][2] == 'X') {
                throw new winnerException(1);
            } else {
                throw new winnerException(2);
            }
        } else if (grid[0][0] == grid[1][1] && grid[2][2] == grid[1][1] && grid[0][0] != ' ') {
            if (grid[0][0] == 'X') {
                throw new winnerException(1);
            } else {
                throw new winnerException(2);
            }
        } else if (grid[0][2] == grid[1][1] && grid[1][1] == grid[2][0] && grid[0][2] != ' ') {
            if (grid[0][2] == 'X') {
                throw new winnerException(1);
            } else {
                throw new winnerException(2);
            }
        } else {
            return 0;
        }
    }
}

class runOutOfSpaceException extends Exception {
    runOutOfSpaceException(String throwMessage) {
        System.out.println(throwMessage);
    }
}

class winnerException extends Exception {
    int playerWon;
    winnerException(int player) {
        playerWon = player;
        if (player == 1) {
            System.out.println("Player 1 wins. Gameplay should cease.");
        } else if (player == 2) {
            System.out.println("Player 2 has won. Cameplay should cease here.");
        }
    }
}