import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SierpinskyCarpet {
    public static void drawImage(Graphics graphics) {
        graphics.setColor(Color.BLACK);
        drawCarpet(WIDTH / 2, HEIGHT / 2, WIDTH / 3, graphics);
        System.out.println(HEIGHT / 2);
    }
    public static void drawCarpet(int centerX, int centerY, int size, Graphics graphics) {
        graphics.fillRect(centerX - size / 2, centerY - size / 2,  size,  size);
        if (size > 1) {
            drawCarpet(centerX, centerY - size, size / 3, graphics);
            drawCarpet(centerX, centerY + size, size / 3, graphics);
            drawCarpet(centerX - size, centerY, size / 3, graphics);
            drawCarpet(centerX + size, centerY, size / 3, graphics);
            drawCarpet(centerX - size, centerY - size, size / 3, graphics);
            drawCarpet(centerX + size, centerY + size, size / 3, graphics);
            drawCarpet(centerX - size, centerY + size, size / 3, graphics);
            drawCarpet(centerX + size, centerY - size, size / 3, graphics);
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