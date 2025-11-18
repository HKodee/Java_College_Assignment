import java.applet.Applet;
import java.awt.Font;
import java.awt.Graphics;


public class Fonts extends Applet {
    public void paint(Graphics g) {
        Font myFont = new Font("Arial", Font.BOLD, 24);
        g.setFont(myFont);
        g.drawString("This is Arial Bold 24", 20, 50);
    }
}