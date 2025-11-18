import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonEvent extends Applet implements ActionListener {
    String msg = "";
    Button b;

    public void init() {
        b = new Button("Click Me");
        add(b);
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {
            msg = "Button was clicked!";
            repaint();
        }
    }

    public void paint(Graphics g) {
        g.drawString(msg, 50, 100);
    }
}