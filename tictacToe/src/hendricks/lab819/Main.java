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
            } catch (runOutOfSpaceException e) {
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
    private static void playerOne(char[][] grid, Scanner input) {
        int x = 0;
        int y = 0;
        try (input) {
            System.out.println("Updated grid:");
            displayGrid(grid);
            x = input.nextInt();
            y = input.nextInt();
        } catch (runOutOfSpaceException e) {
            System.out.println(e.getMessage());
            //TODO: Fill in completion code
        }
        if (grid[x][y] == ' ') {
            grid[x][y] = 'X';
            System.out.println("New grid:");
            try {
                displayGrid(grid);
            } catch (runOutOfSpaceException e) {
                System.out.println("DRAW!");
                System.exit(1);
            }
        } else {
            System.out.println("Someone's already placed something there. Sorry.");
            playerOne(grid, input); //Calls itself recursively to avoid skipping player turns.
        }

    }
    private static void playerTwo(char[][] grid, Scanner input) {
        int x;
        int y;
        try (input) {
            displayGrid(grid);
            System.out.println("Please type the coordinates of where you'd like to place your X.");
            x = input.nextInt();
            y = input.nextInt();
        } catch (runOutOfSpaceException e) {
            System.out.println("DRAW!");
            x = 0;
            y = 0;
        }

        if (grid[x][y] == ' ') {
            grid[x][y] = 'O';
            System.out.println("New grid:");
            try {
                int win = displayGrid(grid);
            } catch (runOutOfSpaceException e) {
                System.out.println("DRAW!");
            }
        } else {
            System.out.println("Someone's already placed something there. Sorry.");
            playerTwo(grid, input); //Calls itself recursively to avoid skipping player turns.
        }
    }

    private static int displayGrid(char[][] grid) throws runOutOfSpaceException {
        //could use loops but hardcoding will make it look better.
        for (char[] row: grid) {
            System.out.println(Arrays.toString(row));
        }
        if (grid[0][0] != ' ' && grid[0][1] != ' ' && grid[0][2] != ' ' && grid[1][0] != ' ' && grid[1][1] != ' ' && grid[1][2] != ' ' && grid[2][0] != ' ' && grid[2][1] != ' ' && grid[2][2] != ' ') {
            int win = checkWinner(grid);
            if (win == 0) {
                throw new runOutOfSpaceException("You're run out of space but there's no winner");
            } else if (win == 1) {
                System.out.println("Player 1 wins!");
            } else {
                //System.out.println("Player 2 wins!");
            }
        }
        int win = checkWinner(grid);
        return win;
    }
    private static int checkWinner(char[][] grid) {
        for (char[] row: grid) {
            if(row[0] == row[1] && row[1] == row[2] && row[0] != 0) { //FIXME: Errors cause a non-win to pass this block
                if (row[0] == 'X') {
                    return 1;
                } else if (row[0] == 'O') {
                    return 2;
                } else {
                    return 0;
                }
            } else {
                return 0;
            }
        }
        if (grid[0][0] == grid[1][0] && grid[1][0] == grid[2][0] && grid[0][0] != ' ' && grid[0][0] != 0) {
            if (grid[0][0] == 'X') {
                return 1;
            } else {
                return 2;
            }
        } else if (grid[0][1] == grid[1][1] && grid[1][1] == grid[2][1] && grid[0][1] != 0) {
            if (grid[0][1] == 'X') {
                return 1;
            } else {
                return 2;
            }
        } else if (grid[0][2] == grid[1][2] && grid[1][2] == grid[2][2] && grid[0][2] != 0) {
            if (grid[0][2] == 'X') {
                return 1;
            } else {
                return 2;
            }
        } else if (grid[0][0] == grid[1][1] && grid[2][2] == grid[1][1] && grid[0][0] != 0) {
            if (grid[0][0] == 'X') {
                return 1;
            } else {
                return 2;
            }
        } else if (grid[0][2] == grid[1][1] && grid[1][1] == grid[2][0] && grid[0][2] != 0) {
            if (grid[0][2] == 'X') {
                return 1;
            } else {
                return 2;
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