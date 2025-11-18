import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;

public class ImageApplet extends Applet {
    Image img;

    public void init() {
        img = getImage(getDocumentBase(), "image.jpg");
    }

    public void paint(Graphics g) {
        g.drawImage(img, 10, 10, this);
    }
}