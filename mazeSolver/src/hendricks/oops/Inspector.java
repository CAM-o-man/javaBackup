package hendricks.oops;

import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class Inspector implements AutoCloseable {
    private int x;
    private int y;
    private ArrayList<Inspector> subsidiaries;
    private int subit = 0; //subsidiary iterator
    private boolean path = false;

    public boolean getPath() {
        return path;
    }

    public ArrayList<Inspector> getSubsidiaries() {
        return subsidiaries;
    }

    public void setSubsidiaries(ArrayList<Inspector> subsidiaries) {
        this.subsidiaries = subsidiaries;
    }

    public void addSubsidiaries (Inspector inspect) {
        this.subsidiaries.add(inspect);
    }

    Inspector(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Inspector{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public void run(MazeNode[][] maze) {
        do {
            int prevX = x;
            int prevY = y;
            boolean taken = false;
            int[] evidence = inspect(maze);
            if (evidence[0] == -1 && evidence[1] == -1 && evidence[2] == -1 && evidence[3] == -1) {
                return;
            }
            if (evidence[0] != -1) {
                taken = true;
                prevY = y;
                y--;
            }
            if (evidence[1] != -1 && !taken) {
                taken = true;
                prevX = x;
                x++;
            } else if (evidence[1] != -1) {
                subsidiaries.add(new Inspector(prevX + 1, y)); //subsidiary created
                subsidiaries.get(subit).run(maze);
                subit++;
            }
            if (evidence[2] != -1 && !taken) {
                taken = true;
                prevY = y;
                y++;
            } else if (evidence[2] != -1) {
                subsidiaries.add(new Inspector(x, prevY + 1)); //subsidiary created
                subsidiaries.get(subit).run(maze);
                subit++;
            }
            if (evidence[3] != -1 && !taken) {
                taken = true;
                prevX = x;
                x--;
            } else if (evidence[3] != -1) {
                subsidiaries.add(new Inspector(prevX - 1, y));
                subsidiaries.get(subit).run(maze);
                subit++;
            }

            //Check if you've won
            if (x == maze.length) {
                path = true;
                return;
            }
            for (int i = 0; i < subsidiaries.size(); i++) {
                if (subsidiaries.get(i).getPath()) {
                    path = true; //If one of the subsidiaries finds a valid path, then all superiors will be notified.
                    return;
                }
            }
        } while(true);

    }

    public int[] inspect(MazeNode[][] maze) {
        int[] evidence = new int[4];
        for (int i = 0; i < 4; i++) {
            switch(i) {
                case 0:
                    if (y == 0) {
                        evidence[i] = -1;
                    } else if (maze[y - 1][x].isPassable() && !maze[y - 1][x].isVisited()) {
                        evidence[i] = 0;
                    } else {
                        evidence[i] = -1;
                    }
                case 1:
                    if (maze[y][x + 1].isPassable() && !maze[y][x + 1].isVisited()) {
                        evidence[i] =  1;
                    } else {
                        evidence[i] = -1;
                    }
                case 2:
                    if (y == maze.length) {
                        evidence[i] = -1;
                    } else if (maze[y + 1][x].isPassable() && !maze[y + 1][x].isVisited()) {
                        evidence[i] =  2;
                    } else {
                        evidence[i] = -1;
                    }
                case 3:
                    if (x == 0) {
                        evidence[i] = -1;
                    } else if (maze[y][x - 1].isPassable() && !maze[y][x - 1].isVisited()) {
                        evidence[i] =  3;
                    } else {
                        evidence[i] = -1;
                    }
            }
        }

        return evidence;
    }

    public void close() {

    }
}

