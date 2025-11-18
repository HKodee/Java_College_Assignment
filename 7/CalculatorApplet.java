import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class CalculatorApplet extends Applet implements ActionListener {

    TextField display;
    Panel buttonPanel;

    String num1 = "";
    String operator = "";
    boolean startNew = false;

    public void init() {

        setLayout(new BorderLayout());

        // Display field
        display = new TextField();
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.BOLD, 20));
        add(display, BorderLayout.NORTH);

        // Panel for buttons
        buttonPanel = new Panel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        String buttons[] = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", "C", "=", "+"
        };

        for (int i = 0; i < buttons.length; i++) {
            Button b = new Button(buttons[i]);
            b.addActionListener(this);
            b.setFont(new Font("Arial", Font.BOLD, 18));
            buttonPanel.add(b);
        }

        add(buttonPanel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String command = e.getActionCommand();

        if (command.charAt(0) >= '0' && command.charAt(0) <= '9') {
            if (startNew) {
                display.setText("");
                startNew = false;
            }
            display.setText(display.getText() + command);
        }
        else if (command.equals("C")) {
            display.setText("");
            num1 = "";
            operator = "";
        }
        else if (command.equals("=")) {
            try {
                double a = Double.parseDouble(num1);
                double b = Double.parseDouble(display.getText());
                double result = 0;

                switch (operator) {
                    case "+": result = a + b; break;
                    case "-": result = a - b; break;
                    case "*": result = a * b; break;
                    case "/": 
                        if (b == 0) display.setText("Error");
                        else result = a / b;
                        break;
                }

                display.setText("" + result);
                startNew = true;

            } catch (Exception ex) {
                display.setText("Error");
            }
        }
        else { // Operator
            num1 = display.getText();
            operator = command;
            startNew = true;
        }
    }
}
