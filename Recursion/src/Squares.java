import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Squares {
    public static void drawImage(Graphics graphics) {
        drawSquares(WIDTH / 2, HEIGHT / 2, WIDTH, graphics);
    }

    public static void drawSquares(int x, int y, int size, Graphics graphics) {
        graphics.drawLine(x - size / 6, y - size / 2, x - size / 6, y + size / 2);
        graphics.drawLine(x + size / 6, y - size / 2, x + size / 6, y + size / 2);
        graphics.drawLine(x - size / 2, y - size / 6, x + size / 2, y - size / 6);
        graphics.drawLine(x - size / 2, y + size / 6, x + size / 2, y + size / 6);
        if (size > 20) {
            drawSquares(x, y - size / 3, size / 3, graphics);
            drawSquares(x, y + size / 3, size / 3, graphics);
            drawSquares(x + size / 3, y, size / 3, graphics);
            drawSquares(x - size / 3, y, size / 3, graphics);
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
            this.setBackground(Color.YELLOW);
            drawImage(graphics);
        }
    }
}
