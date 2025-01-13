package claculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main2 extends JFrame {
    private JTextField display;
    private JPanel buttonPanel;
    private String operator = "";
    private int firstNum = 0;

    public Main2() {
        setTitle("Modern Calculator");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Display field
        display = new JTextField("0");
        display.setFont(new Font("Arial", Font.BOLD, 32));
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEditable(false);
        display.setBackground(Color.WHITE);
        display.setForeground(Color.BLACK);
        add(display, BorderLayout.NORTH);

        // Button panel
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 10, 10));
        buttonPanel.setBackground(Color.DARK_GRAY);

        String[] buttons = {
                "7", "8", "9", "+",
                "4", "5", "6", "-",
                "1", "2", "3", "*",
                "C", "0", "=", "/"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 24));
            button.setBackground(Color.LIGHT_GRAY);
            button.setForeground(Color.BLACK);
            button.setFocusPainted(false);
            button.addActionListener(new ButtonClickListener());
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);
    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if (command.matches("[0-9]")) {
                if (display.getText().equals("0") || operator.isEmpty()) {
                    display.setText(command);
                } else {
                    display.setText(display.getText() + command);
                }
            } else if (command.matches("[+\\-*/]")) {
                firstNum = Integer.parseInt(display.getText());
                operator = command;
                display.setText("0");
            } else if (command.equals("=")) {
                int secondNum = Integer.parseInt(display.getText());
                int result = 0;
                switch (operator) {
                    case "+" -> result = firstNum + secondNum;
                    case "-" -> result = firstNum - secondNum;
                    case "*" -> result = firstNum * secondNum;
                    case "/" -> result = firstNum / secondNum;
                }
                display.setText(String.valueOf(result));
                operator = "";
            } else if (command.equals("C")) {
                display.setText("0");
                operator = "";
                firstNum = 0;
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ModernCalculator calculator = new ModernCalculator();
            calculator.setVisible(true);
        });
    }
}