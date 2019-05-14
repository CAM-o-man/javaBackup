package hendricks.lab91;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DisplayGraphics extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setForeground(Color.BLACK);
        setBackground(Color.WHITE);
        /*g.drawRect(40, 30, 100, 300);
        g.setColor(Color.BLUE);
        g.fillRect(30, 40, 100, 300);
        g.setColor(Color.BLACK);
        g.drawRect(30, 40, 100, 300);
        g.drawRect(3, 40, 110, 120);
        g.setColor(Color.CYAN);
        g.fillRect(30, 40, 110, 120);
        g.setColor(Color.BLACK);
        g.drawRect(30, 40, 110, 120);
        g.drawArc(100, 100, 50, 50, 0, 360);
        g.setColor(Color.BLACK);
        g.fillArc(100, 100, 50, 50, 0, 360);
        g.setColor(Color.RED);
        g.drawString("Graphics are easy in Java", 200, 200);*/
        //Next part

        Font arial = new Font("Arial", Font.PLAIN, 20);
        setForeground(Color.BLACK);
        setBackground(Color.BLUE);
        g.drawArc(10, 10, 100, 100, 0, 360);
        g.drawArc(10, 110, 100, 100, 0, 360);
        g.drawArc(10, 210, 100, 100, 0, 360);
        g.drawArc(10, 310, 100, 100, 0, 360);
        g.drawArc(110, 310, 100, 100, 0, 360);
        g.drawArc(210, 310, 100, 100, 0, 360);
        g.drawArc(310, 310, 100, 100, 0, 360);
        g.setColor(Color.ORANGE);
        g.fillArc(10, 10, 100, 100, 0, 360);
        g.fillArc(10, 110, 100, 100, 0, 360);
        g.fillArc(10, 210, 100, 100, 0, 360);
        g.fillArc(10, 310, 100, 100, 0, 360);
        g.fillArc(110, 310, 100, 100, 0, 360);
        g.fillArc(210, 310, 100, 100, 0, 360);
        g.fillArc(310, 310, 100, 100, 0, 360);
        g.setFont(arial);
        g.drawString("GO Team", 200, 200);


    }
}
