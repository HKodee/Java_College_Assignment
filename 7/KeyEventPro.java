import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEventPro extends Applet implements KeyListener {
    String msg = "";

    public void init() {
        addKeyListener(this);
    }

    public void keyTyped(KeyEvent e) {
        msg = "You typed: " + e.getKeyChar();
        repaint();
    }
    
    public void keyPressed(KeyEvent e) {}
    public void keyReleased(KeyEvent e) {}

    public void paint(Graphics g) {
        g.drawString(msg, 50, 100);
    }
}