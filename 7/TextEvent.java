import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TextEvent extends Applet implements ActionListener {
    TextField tf;
    String msg = "";

    public void init() {
        add(new Label("Enter text and press Enter:"));
        tf = new TextField(20);
        add(tf);
        tf.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        msg = "You entered: " + tf.getText();
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(msg, 50, 100);
    }
}