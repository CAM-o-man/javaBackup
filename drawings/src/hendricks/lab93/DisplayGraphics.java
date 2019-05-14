package hendricks.lab93;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DisplayGraphics extends JPanel {

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        setBackground(Color.BLACK);
        setForeground(Color.WHITE);

        int[] roofx = {0, 30, 60};
        int[] roofy = {20, 0, 20};
        g.drawPolygon(roofx, roofy, 3);
        g.drawRect(0, 20, 60, 20);

        Color houseColour = new Color(232, 129, 46);

        g.setColor(houseColour);
        g.fillRect(0, 20, 60, 20);

        //TODO: Draw house windows and doors
        //TODO: Complete the rest of the shapes.
    }
}
