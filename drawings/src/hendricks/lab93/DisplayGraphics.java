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

        g.setColor(Color.YELLOW);
        g.drawRect(30, 25, 10, 15);
        g.fillRect(30, 25, 10, 15);


        g.fillRect(12, 25, 10, 10);
        g.fillRect(45, 25, 10, 10);

        g.setColor(Color.WHITE);

        g.drawArc(100, 100, 30, 30, 0, 360);
        g.drawArc(115, 115, 30, 30, 0, 360);
        g.drawArc(130, 100, 30, 30, 0, 360);
        g.drawArc(145, 115, 30, 30, 0, 360);
        g.drawArc(160, 100, 30, 30, 0, 360);



        g.setColor(new Color(224, 224, 56));
        g.fillArc(200, 200, 100, 50, 0, 360);
        g.setColor(Color.GREEN);
        g.fillArc(250, 210, 5, 30, 0, 360);
        g.setColor(Color.BLUE);
        g.fillArc(225, 212, 10, 10, 0, 360);
        g.fillArc(265, 212, 10, 10, 0, 360);
        g.setColor(new Color(173, 98, 13));
        g.fillArc(225, 230, 50, 10, 0, -180);



    }
}
