import java.applet.Applet;
import java.awt.Graphics;

public class BannerApplet extends Applet implements Runnable {
    String msg = " Moving Banner Example ";
    Thread t;
    boolean stopFlag;

    public void init() {
        t = new Thread(this);
        stopFlag = false;
        t.start();
    }

    public void run() {
        while (!stopFlag) {
            try {
                repaint();
                Thread.sleep(250);
                msg = msg.substring(1) + msg.charAt(0);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public void paint(Graphics g) {
        g.drawString(msg, 50, 30);
    }
}