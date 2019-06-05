package hendricks.lab96;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DisplayGraphics extends JPanel implements ActionListener {

    Timer time = new Timer(5, this);

    int x = 35, speed = 3, y = 10;

    public void paintComponent(Graphics g) {
        ImageIcon bug = new ImageIcon("bug.png");
        Image bugimg = bug.getImage();
        super.paintComponent(g);
        setBackground(Color.WHITE);
        g.setColor(Color.RED);
        int[] xpoints = new int[]{
                x, x + 20, x + 20, x + 40, x + 20, x + 20, x
        };
        int[] ypoints = new int[]{
                20, 20, 10, 25, 35, 30, 30
        };
        g.fillPolygon(xpoints, ypoints, 7);
        g.drawImage(bugimg, y, 50, null);

        time.start();
    }

    public void actionPerformed(ActionEvent e) {
        if (x > 0 && x < 450) {
            x += speed;
            repaint();
        }
        if (y > 0 && y < 450) {
            y += speed;
            repaint();
        }
    }
}
