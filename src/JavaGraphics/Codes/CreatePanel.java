package JavaGraphics.Codes;
import JavaGraphics.Main;
import javax.swing.*;
import java.awt.*;

public class CreatePanel extends JPanel {

    public Size ScreenSize = new Size(Main.Window_width, Main.Window_height);
    public Size rectSize = new Size(100, 100);

    public CreatePanel() {
        this.setPreferredSize(new Dimension(Main.Window_width, Main.Window_height));
        
    }
    
    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;
        
        g2D.setStroke(new BasicStroke(25));
        //g2D.drawLine(0,0, 1100, 650);

        g2D.fillRect((int) ((int) ScreenSize.width/2-(rectSize.height/2)), (int) ((int) ScreenSize.height/2-(rectSize.height/2)), (int) rectSize.width, (int) rectSize.height);

    }
}
