package hendricks.lab94;

import javax.swing.*;
import java.awt.*;

public class DisplayGraphics extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g); {

            setBackground(Color.WHITE);
            for (int i = 0; i < 50; i+= 10) {
                g.setColor(Color.BLACK);
                g.drawRect(i, i, 20, 20);
                g.setColor(Color.ORANGE);
                g.fillRect(i, i, 20, 20);
                g.setColor(Color.BLACK);
                g.drawRect(i, i, 20, 20);
            }

            for (int i = 100; i < 170; i += 10) {
                g.setColor(Color.BLACK);
                g.fillArc(i, 100, 50, 50, 0, 360);
                g.setColor(Color.YELLOW);
                g.drawArc(i, 100, 50, 50, 0, 360);
                g.setColor(Color.BLUE);
                g.drawArc(i + 10, 110, 10, 10, 0, 360);
                g.drawArc(i + 30, 110, 10, 10, 0, 360);
                g.fillArc(i + 10, 110, 10, 10, 0, 360);
                g.fillArc(i + 30, 110, 10, 10, 0, 360);
                g.setColor(Color.RED);
                g.fillArc(i + 10, 130, 30, 10, 0, 360);
            }



        }
    }
}
