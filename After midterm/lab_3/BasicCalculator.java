import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BasicCalculator implements ActionListener {

    private final JTextField textField;
    private final JPanel panel;
    private double num1 = 0, num2 = 0, result = 0;
    private char operator;

    public BasicCalculator() {
        
        JFrame jFrame = new JFrame("Calculator");
        jFrame.setSize(500, 600);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        textField = new JTextField();
        textField.setFont(new Font("Arial", Font.BOLD, 70));
        textField.setHorizontalAlignment(JTextField.RIGHT);
        textField.setEditable(false);

       
        jFrame.add(textField, BorderLayout.NORTH);

      
        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 10, 10));

       
        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
        };

        
        for (String label : buttons) {
            JButton button = new JButton(label);
            button.setFont(new Font("Arial", Font.BOLD, 50));
            button.addActionListener(this);
            panel.add(button);
        }

        
        jFrame.add(panel, BorderLayout.CENTER);
        jFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

       
        if ((command.charAt(0) >= '0' && command.charAt(0) <= '9') || command.equals(".")) {
            textField.setText(textField.getText() + command);
        } 
        
        else if (command.equals("=")) {
            num2 = Double.parseDouble(textField.getText());
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num2 != 0 ? num1 / num2 : 0; 
                    break;
            }
            textField.setText(String.valueOf(result));
            num1 = result;
        } 
        
        else {
            if (!textField.getText().isEmpty()) {
                num1 = Double.parseDouble(textField.getText());
                operator = command.charAt(0);
                textField.setText("");
            }
        }
    }

    public static void main(String[] args) {
        new BasicCalculator();
    }
}
