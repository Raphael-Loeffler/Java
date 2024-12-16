import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {

    public static void drawImage(Graphics graphics){
        int[] x = {WIDTH / 2, WIDTH / 2 - 10, WIDTH / 2 + 10};
        int[] y = {10, 27, 27};
        for (int j = 0; j < 15; j++) {
            for (int i = 0; i < 5; i++) {
                drawTriangle(x, y, 3, graphics);
                y[0] += 17 * 2;
                y[1] += 17 * 2;
                y[2] += 17 * 2;
            }
            x[0] += 10;
            x[1] += 10;
            x[2] += 10;
            y[0] = 10;
            y[1] = 27;
            y[2] = 27;
            y[0] += (j + 1) * 17;
            y[1] += (j + 1) * 17;
            y[2] += (j + 1) * 17;
        }
    }
    public static void drawTriangle(int[] x, int[] y, int numberOfSides, Graphics graphics) {
        graphics.drawPolygon(x, y, numberOfSides);
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