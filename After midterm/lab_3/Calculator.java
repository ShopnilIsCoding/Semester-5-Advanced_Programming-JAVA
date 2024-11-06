import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private JFrame frame;
    private JTextField textField;
    private double firstNum, secondNum, result;
    private String operator;

    public Calculator() {
        frame = new JFrame("Calculator");
        frame.setSize(400, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        textField = new JTextField();
        textField.setEditable(false);
        frame.add(textField, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 10, 10));
        frame.add(panel, BorderLayout.CENTER);

        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.addActionListener(new CalculatorAction());
            panel.add(button);
        }

        frame.setVisible(true);
    }

    private class CalculatorAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            
            if (command.charAt(0) >= '0' && command.charAt(0) <= '9' || command.equals(".")) {
                textField.setText(textField.getText() + command);
            } else if (command.equals("=")) {
                secondNum = Double.parseDouble(textField.getText());
                switch (operator) {
                    case "+" -> result = firstNum + secondNum;
                    case "-" -> result = firstNum - secondNum;
                    case "*" -> result = firstNum * secondNum;
                    case "/" -> result = firstNum / secondNum;
                }
                textField.setText(String.valueOf(result));
            } else {
                firstNum = Double.parseDouble(textField.getText());
                operator = command;
                textField.setText("");
            }
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
