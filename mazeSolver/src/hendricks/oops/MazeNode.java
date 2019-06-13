package hendricks.oops;

public class MazeNode {
    private boolean visited;

    private int value;

    private boolean passable;

    @Override
    public String toString() {
        return "MazeNode{" +
                "visited=" + visited +
                ", value=" + value +
                ", passable=" + passable +
                '}';
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isPassable() {
        return passable;
    }

    public void setPassable(boolean passable) {
        this.passable = passable;
    }

    public MazeNode() {}

    public MazeNode(boolean visited, int value, boolean passable) {
        this.visited = visited;
        this.value = value;
        this.passable = passable;
    }

    public static MazeNode[][] toMaze(int[][] arr) {
        MazeNode[][] maze = new MazeNode[arr.length][arr[0].length]; //Assuming here that all mazes are symmetrical
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr[i].length - 1; j++) {
                maze[i][j].setValue(arr[i][j]);
                maze[i][j].setPassable(arr[i][j] == 1);
            }
        }
        return maze;
    }


}