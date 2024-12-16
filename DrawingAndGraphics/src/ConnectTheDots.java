import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {
    public static void drawImage(Graphics graphics) {
        // Create a function that takes 2 parameters:
        // an array of {x, y} points and graphics
        // and connects them with green lines.
        // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
        // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
        // {120, 100}, {85, 130}, {50, 100}}
        int[] box = {10, 10, 290, 10, 290, 290, 10, 290};
        connect(box, graphics);
        int [] unknown = {50, 100, 70, 70, 80, 90, 90, 90, 100, 70, 120, 100, 85, 130, 50, 100};
        connect(unknown, graphics);
    }
    public static void connect(int[] coordinates, Graphics graphics) {
        for (int i = 3; i < coordinates.length; i += 2) {
            graphics.drawLine(coordinates[i - 3], coordinates[i - 2], coordinates[i - 1], coordinates[i]);
            if (i == coordinates.length - 1) {
                graphics.drawLine(coordinates[i - 1], coordinates[i], coordinates[0], coordinates[1]);
            }
        }
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            drawImage(graphics);
        }
    }
}