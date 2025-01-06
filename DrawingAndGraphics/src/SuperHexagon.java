import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SuperHexagon {
    public static void drawImage(Graphics graphics) {
        int[] originY = {HEIGHT / 2 - 15, HEIGHT / 2 - 15, HEIGHT / 2, HEIGHT / 2 + 15, HEIGHT / 2 + 15, HEIGHT / 2};
        int[] x1 = {WIDTH / 2 - 10, WIDTH / 2 + 10, WIDTH / 2 + 20, WIDTH / 2 + 10, WIDTH / 2 - 10, WIDTH / 2 - 20};
        int[] x2 = {WIDTH / 2 - 10, WIDTH / 2 + 10, WIDTH / 2 + 20, WIDTH / 2 + 10, WIDTH / 2 - 10, WIDTH / 2 - 20};
        int[] y1 = {HEIGHT / 2 - 15, HEIGHT / 2 - 15, HEIGHT / 2, HEIGHT / 2 + 15, HEIGHT / 2 + 15, HEIGHT / 2};
        int[] y2 = {HEIGHT / 2 - 15, HEIGHT / 2 - 15, HEIGHT / 2, HEIGHT / 2 + 15, HEIGHT / 2 + 15, HEIGHT / 2};
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i / 2; j++) {
                drawHexagon(x1, y1, graphics);
                drawHexagon(x1, y2, graphics);
                drawHexagon(x2, y1, graphics);
                drawHexagon(x2, y2, graphics);
                for (int k = 0; k < y1.length; k++) {
                    y1[k] += 30;
                    y2[k] -= 30;
                }
            }
            for (int j = 0; j < x1.length; j++) {
                x1[j] += 30;
                x2[j] -= 30;
                if (i % 2 == 0) {
                    y1[j] = originY[j] - 15;
                    y2[j] = originY[j] + 15;
                } else {
                    y1[j] = originY[j];
                    y2[j] = originY[j];
                }
            }
        }
    }
    public static void drawHexagon(int[] x, int[] y, Graphics graphics) {
        graphics.drawPolygon(x, y, 6);
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