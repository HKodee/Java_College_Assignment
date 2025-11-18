import java.applet.Applet;
import java.awt.Graphics;


public class ShapesDemo extends Applet {
    public void paint(Graphics g) {
        g.drawLine(10, 10, 100, 10);
        
        g.drawRect(10, 30, 50, 30);
        g.fillRect(70, 30, 50, 30);
        
        g.drawRoundRect(10, 80, 50, 30, 10, 10);
        g.fillRoundRect(70, 80, 50, 30, 10, 10);
        
        g.drawOval(10, 130, 50, 30);
        g.fillOval(70, 130, 50, 30);
        
        int x[] = {150, 200, 250};
        int y[] = {150, 50, 150};
        g.drawPolygon(x, y, 3);
    }
}