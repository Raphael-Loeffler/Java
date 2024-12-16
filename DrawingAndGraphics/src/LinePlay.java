import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {

    public static void drawImage(Graphics graphics) {
        int startingOffset = 20;
        int offsetToEdge = 10;
        int increment = 20;
        for (int i = 0; i < 15; i++) {
            graphics.setColor(Color.green);
            graphics.drawLine(i * increment + startingOffset, HEIGHT - offsetToEdge, offsetToEdge,  i * increment + startingOffset);
            graphics.setColor(Color.magenta);
            graphics.drawLine(WIDTH - (i * increment + startingOffset), offsetToEdge, WIDTH - offsetToEdge, HEIGHT - (i * increment + startingOffset));
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