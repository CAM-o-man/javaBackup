package hendricks.lab93;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {

    public static void main(String[] args) {
        DisplayGraphics d = new DisplayGraphics();
        JFrame f = new JFrame("Lab 9.1");
        f.add(d);
        f.setSize(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}

