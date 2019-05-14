package hendricks.lab92;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Arrays;
import javax.swing.*;
import javax.imageio.ImageIO;
import java.io.File;

public class DisplayGraphics extends JPanel{
    public void paintComponent(Graphics g) {
        /*super.paintComponent(g);

        setBackground(Color.BLACK);
        int[] pxpoints = new int[] {
                5, 20, 20, 0, 10, 5, 5
        };
        int[] pypoints = new int[] {
                5, 5, 20, 20, 40, 40, 5
        };
        g.setColor(Color.WHITE);
        g.drawPolygon(pxpoints, pypoints, 7);
        pxpoints = new int[] {
               30, 45, 60
        };
        pypoints = new int[] {
                40, 5, 40
        };
        g.drawPolygon(pxpoints, pypoints, 3);
        g.drawArc(75, 10, 30, 30, 45, 315);
        g.setColor(Color.YELLOW);
        g.fillArc(75, 10, 30, 30, 45, 315);
        g.setColor(Color.WHITE);

        pxpoints = new int[] {
                115, 115, 130, 145, 145
        };
        pypoints = new int[] {
                40, 10, 25, 10, 40
        };
        g.drawPolygon(pxpoints, pypoints, 5);
        pxpoints = new int[] {
                155, 170, 185
        };
        pypoints = new int[] {
                40, 5, 40
        };
        g.drawPolygon(pxpoints, pypoints, 3);

        g.drawLine(195, 40, 195, 5);
        g.drawLine(195, 5, 210, 40);
        g.drawLine(210, 5, 210, 40);

        pxpoints = new int[]{
                100, 106, 112, 118, 124, 130, 136, 142, 150
        };
        pypoints = new int[]{
                260, 270, 260, 270, 260, 270, 260, 270, 260
        };
        for (int i = 0; i < 200; i += 50) {
            g.drawArc(100 + i, 200, 40, 60, 0, 180);
            g.fillArc(100 + i, 200, 40, 60, 0, 180);

            g.drawPolygon(pxpoints, pypoints, 9);
            for (int j = 0; j < pxpoints.length; j++) {
                pxpoints[j] = +i;
                System.out.println(Arrays.toString(pxpoints));
            }
        }*/
        super.paintComponent(g);

        setBackground(Color.BLACK);
        ImageIcon top = new ImageIcon("igiveup.png");
        Image topimg = top.getImage();
        ImageIcon bottom = new ImageIcon("bottom.png");
        Image bottomimg = bottom.getImage();
        g.drawImage(topimg, 0, 0, 400, 200, null);
        g.drawImage(bottomimg, 0, 200, 400, 200, null);

    }
}
