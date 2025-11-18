import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;

public class CalculatorLayout extends Applet {
    public void init() {
        setLayout(new BorderLayout());

        TextField display = new TextField();
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        Panel buttonPanel = new Panel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };

        for (String label : buttonLabels) {
            buttonPanel.add(new Button(label));
        }

        add(buttonPanel, BorderLayout.CENTER);
    }
}