package JavaGraphics.Codes;
import javax.swing.*;

public class CreateWindow extends JFrame {

    CreatePanel panel;

    public CreateWindow(String title, int Width, int Height) {


        panel = new CreatePanel();
        this.setTitle(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(Width, Height);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
        this.add(panel);
        this.pack();

    }
}