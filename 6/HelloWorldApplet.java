import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;


public class HelloWorldApplet extends Applet {
    public void init() {
        setBackground(Color.YELLOW);
        setForeground(Color.RED);
    }

    public void paint(Graphics g) {
        g.drawString("Hello World", 50, 100);
    }
}