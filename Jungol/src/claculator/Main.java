package claculator;

import java.awt.*;
import java.awt.event.*;

public class Main {
    private Frame frame;
    private Panel panel;
    private TextField tf;
    private Button[] bNum;
    private Button bPlus, bMinus, bMul, bDiv, bRes, bClear;
    private String operator = "";
    private int firstNum = 0;

    public Main() {
        frame = new Frame("Calculator");
        panel = new Panel();
        tf = new TextField("0");

        bNum = new Button[10];
        for (int i = 0; i < bNum.length; i++) {
            bNum[i] = new Button(Integer.toString(i));
        }

        bPlus = new Button("+");
        bMinus = new Button("-");
        bMul = new Button("*");
        bDiv = new Button("/");
        bRes = new Button("=");
        bClear = new Button("C");
    }

    public void startFrame() {
        frame.setLayout(new BorderLayout());
        frame.add(tf, BorderLayout.NORTH);

        panel.setLayout(new GridLayout(4, 4));
        for (int i = 7; i <= 9; i++) panel.add(bNum[i]);
        panel.add(bPlus);
        for (int i = 4; i <= 6; i++) panel.add(bNum[i]);
        panel.add(bMinus);
        for (int i = 1; i <= 3; i++) panel.add(bNum[i]);
        panel.add(bMul);
        panel.add(bNum[0]);
        panel.add(bClear);
        panel.add(bRes);
        panel.add(bDiv);

        frame.add(panel, BorderLayout.CENTER);

        frame.setSize(300, 400);
        frame.setVisible(true);

        addEventListeners();
    }

    private void addEventListeners() {
        for (int i = 0; i < bNum.length; i++) {
            int num = i;
            bNum[i].addActionListener(e -> {
                if (tf.getText().equals("0") || tf.getText().equals("+") || tf.getText().equals("-") ||
                        tf.getText().equals("*") || tf.getText().equals("/")) {
                    tf.setText(String.valueOf(num));
                } else {
                    tf.setText(tf.getText() + num);
                }
            });
        }

        bPlus.addActionListener(e -> handleOperator("+"));
        bMinus.addActionListener(e -> handleOperator("-"));
        bMul.addActionListener(e -> handleOperator("*"));
        bDiv.addActionListener(e -> handleOperator("/"));

        bRes.addActionListener(e -> calculateResult());

        bClear.addActionListener(e -> {
            tf.setText("0");
            operator = "";
            firstNum = 0;
        });

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }

    private void handleOperator(String op) {
        firstNum = Integer.parseInt(tf.getText());
        operator = op;
        tf.setText(op);
    }

    private void calculateResult() {
        int secondNum = Integer.parseInt(tf.getText());
        int result = 0;
        switch (operator) {
            case "+" -> result = firstNum + secondNum;
            case "-" -> result = firstNum - secondNum;
            case "*" -> result = firstNum * secondNum;
            case "/" -> result = firstNum / secondNum;
        }
        tf.setText(String.valueOf(result));
    }

    public static void main(String[] args) {
        Main calc = new Main();
        calc.startFrame();
    }
}