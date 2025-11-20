import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameGame extends Frame {

    FrameGame() {
        setTitle("AWT Frame Example");
        setSize(300, 200);
        
        add(new Label("This is a simple Frame"));

        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new FrameGame();
    }
}