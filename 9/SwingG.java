import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;

public class SwingG extends JFrame {

    SwingG() {
        setTitle("Swing Components Demo");
        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel label = new JLabel("Enter Name:");
        JTextField textField = new JTextField(20);
        JButton button = new JButton("Submit");

        add(label);
        add(textField);
        add(button);

        setVisible(true);
    }

    public static void main(String[] args) {
        new SwingG();
    }
}