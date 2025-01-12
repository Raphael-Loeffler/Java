import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Hexagons {
    public static void drawImage(Graphics graphics) {
        drawHexagons(WIDTH / 2, HEIGHT / 2, WIDTH, graphics);
        System.out.println("test");
    }
    public static void drawHexagons(int centerX, int centerY, int size, Graphics graphics) {
        // Calculate each vertex using trigonometry
        int[] xPoints = new int[6];
        int[] yPoints = new int[6];
        for (int i = 0; i < 6; i++) {
            xPoints[i] = (int) Math.round(centerX + size / 2 * Math.cos((i * Math.PI / 3)));
            yPoints[i] = (int) Math.round(centerY + size / 2 * Math.sin((i * Math.PI / 3)));
        }
        graphics.drawPolygon(xPoints, yPoints, 6);
        if (size > 30) {
            drawHexagons((int) Math.round(centerX + size / 4 * Math.cos((4 * Math.PI / 3))), (int) Math.round(centerY + size / 4 * Math.sin((4 * Math.PI / 3))), size / 2, graphics);
            drawHexagons((int) Math.round(centerX + size / 4 * Math.cos((6 * Math.PI / 3))), (int) Math.round(centerY + size / 4 * Math.sin((6 * Math.PI / 3))), size / 2, graphics);
            drawHexagons((int) Math.round(centerX + size / 4 * Math.cos((2 * Math.PI / 3))), (int) Math.round(centerY + size / 4 * Math.sin((2 * Math.PI / 3))), size / 2, graphics);
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
