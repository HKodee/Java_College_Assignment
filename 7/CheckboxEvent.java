import java.applet.Applet;
import java.awt.Checkbox;
import java.awt.Graphics;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckboxEvent extends Applet implements ItemListener {
    String msg = "Checkbox Status:";
    Checkbox c1, c2;

    public void init() {
        c1 = new Checkbox("Option 1");
        c2 = new Checkbox("Option 2");
        add(c1);
        add(c2);
        c1.addItemListener(this);
        c2.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent e) {
        msg = "Option 1: " + c1.getState() + ", Option 2: " + c2.getState();
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(msg, 20, 100);
    }
}