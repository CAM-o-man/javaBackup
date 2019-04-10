package hendricks.lab815;


import java.util.Arrays;


@SuppressWarnings("WeakerAccess")
public class Main {

    public static void main(String[] args) throws InterruptedException {
	    //define matrix
        //noinspection Duplicates
        int[][] map = new int[][] {
                {5, 1, 3, 1, 2, 4, 2, 1},
                {2, 4, 0, 3, 4, 1, 3, 2},
                {6, 1, 5, 2, 1, 5, 4, 1},
                {2, 3, 4, 1, 2, 2, 1, 0},
                {4, 1, 4, 2, 6, 4, 2, 3},
                {1, 3, 3, 3, 4, 1, 5, 2}
        };


        //Begin user interface

        System.out.println("Calculating dangerous areas...");

        int[][] temp = mapper(map); //temp, to be converted to visual
        String[][] visual = makevi(temp);

        for (String[] arr: visual) {
            System.out.println(Arrays.toString(arr));
        }

    }
    public static int[][] mapper(int[][] map) {
        int[][] tempArr = new int[6][8];
        int cell;
        int left;
        int right;
        int top;
        int bottom;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (i == 0 || j == 0 || i == map.length - 1 || j == map[i].length - 1) {
                    tempArr[i][j] = 0;
                    System.out.println("Edge spot. Skipped.");
                    continue;
                }
                cell = map[i][j];
                top = map[i - 1][j];
                bottom = map[i + 1][j];
                right = map[i][j + 1];
                left = map[i][j - 1];
                System.out.println(cell + top + bottom + right + left);
                if (cell + top + bottom + right + left >= 15) {
                    tempArr[i][j] = -1; //Sets the danger zone centre to -1
                    System.out.println("Danger zone. Set to -1.");
                } else {
                    tempArr[i][j] = 0; //not a danger zone, sets to zero
                    System.out.println("Not a danger zone. Set to 0.");
                }
            }
        }
        for (int[] obj: tempArr) {
            System.out.println(Arrays.toString(obj));
        }
        return tempArr;
    }

    public static String[][] makevi(int[][] map) {
        String[][] outputmap = new String[6][8];
        int temp;
        System.out.println("Begin converting to String[][]");
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                outputmap[i][j] = Integer.toString(map[i][j]);
            }
        }
        for (String[] obj: outputmap) {
            System.out.println(Arrays.toString(obj));
        }
        System.out.println("String[][] conversion complete. Labelling all danger zones with D.");
        for (int i = 0; i < outputmap.length; i++) {
            for (int j = 0; j < outputmap[i].length; j++) {
                if (outputmap[i][j].equals("-1")) {
                    outputmap[i][j] = "D";
                } else {
                    outputmap[i][j] = "-";
                }
            }
        }
        System.out.println("Complete.");
        return outputmap;
    }
}