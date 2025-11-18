import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseEventPro extends Applet implements MouseListener, MouseMotionListener {
    String msg = "";

    public void init() {
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    public void paint(Graphics g) {
        g.drawString(msg, 20, 50);
    }

    public void mouseClicked(MouseEvent e) {
        msg = "Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")";
        repaint();
    }
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}

    public void mouseDragged(MouseEvent e) {}
    
    public void mouseMoved(MouseEvent e) {
        msg = "Mouse Moved at (" + e.getX() + ", " + e.getY() + ")";
        repaint();
    }
}