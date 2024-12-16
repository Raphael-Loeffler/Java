import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {

    public static void drawImage(Graphics graphics) {
        /*
        int howManyDivisions = 3;
        for (int i = 0; i < Math.pow(howManyDivisions, 2); i++) {
            graphics.drawLine((i + 1) * WIDTH / (int) Math.pow(howManyDivisions, 2), 0, (i + 1) * WIDTH / (int) Math.pow(howManyDivisions, 2), HEIGHT);
            graphics.drawLine(0, (i + 1) * HEIGHT / (int) Math.pow(howManyDivisions, 2), WIDTH, (i + 1) * HEIGHT / (int) Math.pow(howManyDivisions, 2));
        }
        */
        int rowsColumns = 8;
        for (int i = 1; i < rowsColumns; i++) {
            graphics.drawLine(i * WIDTH / rowsColumns, 0, i * WIDTH / rowsColumns, HEIGHT);
            graphics.drawLine(0, i * HEIGHT / rowsColumns, WIDTH, i * HEIGHT / rowsColumns);
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