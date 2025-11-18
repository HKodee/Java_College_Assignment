import java.applet.Applet;
import java.awt.Graphics;

public class LifecycleDemo extends Applet {
    public void init() {
        System.out.println("Applet initialized");
    }

    public void start() {
        System.out.println("Applet started");
    }

    public void paint(Graphics g) {
        System.out.println("Applet painting");
        g.drawString("Check Console for Lifecycle messages", 20, 20);
    }

    public void stop() {
        System.out.println("Applet stopped");
    }

    public void destroy() {
        System.out.println("Applet destroyed");
    }
}