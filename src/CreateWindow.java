import javax.swing.*;
import java.awt.*;


public class CreateWindow extends JFrame {
    CreateWindow(String title, int Width, int Height) {
        JFrame frame = new JFrame(title);


        frame.setSize(Width, Height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);

    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        g2.drawLine(0,0, 500, 500);

    }
}