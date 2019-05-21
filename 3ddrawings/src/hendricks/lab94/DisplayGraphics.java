package hendricks.lab94;

import javax.swing.*;
import java.awt.*;

/**
 * @author Connor McDermid
 * @lab 9.4
 */
public class DisplayGraphics extends JPanel {
    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        setBackground(Color.BLACK);
        setForeground(Color.WHITE);

        g.setColor(Color.GREEN);
        g.draw3DRect(0, 0, 50, 50, true);


        g.fillRect(100, 100, 100, 100);

        g.setColor(Color.BLACK);
        g.fillArc(125, 125, 10, 10, 0, 360);
        g.fillArc(175, 175, 10, 10, 0, 360);
        g.setColor(Color.BLUE);
        g.fillArc(130, 130, 10, 10, 0, 360);
        g.fillArc(180, 180, 10, 10, 0, 360);



        g.drawArc(250, 250, 50, 10, 0, 360);
        g.drawArc(250, 300, 50, 10, 0, 360);
        g.drawLine(250, 255, 250, 305);
        g.drawLine(300, 255, 300, 305);

        g.drawArc(300, 300, 50, 10, 0, 360);
        g.drawArc(312, 350, 25, 10, 0, 360);
        g.drawLine(300, 305, 312, 355);
        g.drawLine(350, 305, 338, 355);
    }
}
