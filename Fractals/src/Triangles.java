import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    public static void drawImage(Graphics graphics) {
        drawTriangles(WIDTH / 2, HEIGHT / 3, HEIGHT / 2, graphics);
        //int[] x = {(int) (WIDTH / 2.0 + WIDTH / 4.0), (int) (WIDTH / 2.0 - WIDTH / 4.0), WIDTH / 2};
    }
    public static void drawTriangles(int centerX, int centerY, int size, Graphics graphics) {
        int[] xPoints = new int[3];
        int[] yPoints = new int[3];
        xPoints[0] = centerX;
        xPoints[1] = (int) (centerX - size / 2.0);
        xPoints[2] = (int) (centerX + size / 2.0);
        yPoints[0] = (int) (centerY - (2.0 / 3.0) * Math.sqrt(3) / 2 * size);
        yPoints[1] = (int) (centerY + (1.0 / 3.0) * Math.sqrt(3) / 2 * size);
        yPoints[2] = (int) (centerY + (1.0 / 3.0) * Math.sqrt(3) / 2 * size);
        graphics.drawPolygon(xPoints, yPoints, 3);
        if (size > 10) {
            drawTriangles(xPoints[1], (int) (centerY - (1.0 / 3.0) * Math.sqrt(3) / 2 * size), size / 2, graphics);
            drawTriangles(xPoints[2], (int) (centerY - (1.0 / 3.0) * Math.sqrt(3) / 2 * size), size / 2, graphics);
            drawTriangles(centerX, (int) (centerY + (2.0 / 3.0) * Math.sqrt(3) / 2 * size) + 1, size / 2, graphics);
        }

    }
    // Don't touch the code below
    static int WIDTH = 700;
    static int HEIGHT = 700;

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
            this.setBackground(Color.WHITE);
            drawImage(graphics);
        }
    }
}