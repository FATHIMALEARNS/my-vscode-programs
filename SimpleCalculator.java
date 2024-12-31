import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SimpleCalculator extends JFrame implements ActionListener {
    private JTextField display;
    private String operator = "";
    private double num1 = 0;
    private boolean isNewOperation = true;

    public SimpleCalculator() {
        // Set up the frame
        setTitle("Simple Calculator");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create the display field
        display = new JTextField();
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.BOLD, 28));
        add(display, BorderLayout.NORTH);

        // Create the panel for buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 10, 10));

        // Buttons for digits 0-9
        for (int i = 1; i <= 9; i++) {
            JButton btn = new JButton(String.valueOf(i));
            btn.setFont(new Font("Arial", Font.BOLD, 24));
            btn.addActionListener(this);
            buttonPanel.add(btn);
        }

        // Add 0 button
        JButton btn0 = new JButton("0");
        btn0.setFont(new Font("Arial", Font.BOLD, 24));
        btn0.addActionListener(this);
        buttonPanel.add(btn0);

        // Add buttons for operations
        String[] operations = {"+", "-", "*", "%"};
        for (String op : operations) {
            JButton btn = new JButton(op);
            btn.setFont(new Font("Arial", Font.BOLD, 24));
            btn.addActionListener(this);
            buttonPanel.add(btn);
        }

        // Add "=" button to calculate
        JButton equalBtn = new JButton("=");
        equalBtn.setFont(new Font("Arial", Font.BOLD, 24));
        equalBtn.addActionListener(this);
        buttonPanel.add(equalBtn);

        // Add Clear button to reset
        JButton clearBtn = new JButton("C");
        clearBtn.setFont(new Font("Arial", Font.BOLD, 24));
        clearBtn.addActionListener(this);
        buttonPanel.add(clearBtn);

        // Add the button panel to the frame
        add(buttonPanel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.charAt(0) >= '0' && command.charAt(0) <= '9') {
            if (isNewOperation) {
                display.setText(command);
                isNewOperation = false;
            } else {
                display.setText(display.getText() + command);
            }
        } else if (command.equals("C")) {
            // Clear the display
            display.setText("");
            operator = "";
            num1 = 0;
            isNewOperation = true;
        } else if (command.equals("=")) {
            // Perform the calculation
            double num2 = Double.parseDouble(display.getText());
            double result = 0;

            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "%":
                    result = num1 % num2;
                    break;
            }

            display.setText(String.valueOf(result));
            operator = "";
            isNewOperation = true;
        } else {
            // Store the first number and the operator
            num1 = Double.parseDouble(display.getText());
            operator = command;
            isNewOperation = true;
        }
    }

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setVisible(true);
    }
}
