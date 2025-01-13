import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class Squares {
    public static void drawImage(Graphics graphics) {
        graphics.setColor(Color.BLACK);
        drawRectangles(WIDTH / 2, HEIGHT / 2, 200, graphics);
    }
    public static void drawRectangles(int x, int y, int size, Graphics graphics) {;
        drawRect(x, y, size, graphics);
        if (size > 20) {
            drawRectangles(x + size / 2, y + size / 2, size / 2, graphics);
            drawRectangles(x - size / 2, y + size / 2, size / 2, graphics);
            drawRectangles(x - size / 2, y - size / 2, size / 2, graphics);
            drawRectangles(x + size / 2, y - size / 2, size / 2, graphics);
        }
    }
    public static void drawRect(int x, int y, int size, Graphics graphics) {
        graphics.fillRect(x - size / 2 - size / 20, y - size / 2 - size / 20, size, size / 10);
        graphics.fillRect(x - size / 2 - size / 20, y - size / 2 + size / 10 - size / 20, size / 10, size);
        graphics.fillRect(x - size / 2 - size / 20 + size / 10, y + size / 2 - size / 20, size, size / 10);
        graphics.fillRect(x + size / 2 - size / 20, y - size / 2 - size / 20, size / 10, size);
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
