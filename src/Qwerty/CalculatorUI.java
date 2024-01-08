package Qwerty;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorUI {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(5, 5));

        JTextField display = new JTextField(10);
        display.setEditable(false);
        panel.add(display);

        String[] buttonLabels = {" ",  " ",  "C", "+",
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                " ", "0", "="};

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String command = e.getActionCommand();
                    if (command.equals("=")) {
                        try {
                            double result = calculations(display.getText());
                            display.setText(Double.toString(result));
                        } catch (NumberFormatException ex) {
                            display.setText("Error");
                        }
                    } else if (command.equals("C")) {
                        display.setText("");
                    } else {
                        display.setText(display.getText() + command);
                    }
                }
            });
            panel.add(button);
        }

        frame.add(panel);
        frame.setSize(100, 100);
        frame.setVisible(true);
    }

    public static double calculations(String userString) {
        char[] chars = userString.toCharArray();
        double result = 0;
        char operator = '+';
        StringBuilder operand = new StringBuilder();

        for (char c : chars) {
            if (c == '+' || c == '-' || c == '*' || c == '/') {
                double value = Double.parseDouble(operand.toString());
                operand.setLength(0); // Очищаем operand для следующего числа

                if (operator == '+') {
                    result += value;
                } else if (operator == '-') {
                    result -= value;
                } else if (operator == '*') {
                    result *= value;
                } else if (operator == '/') {
                    if (value != 0) {
                        result /= value;
                    } else {
                        throw new ArithmeticException("Division by zero");
                    }
                }

                operator = c; // Устанавливаем новый оператор
            } else {
                operand.append(c); // Добавляем символ к текущему операнду
            }
        }

        // Выполняем последнее вычисление после выхода из цикла
        double value = Double.parseDouble(operand.toString());
        if (operator == '+') {
            result += value;
        } else if (operator == '-') {
            result -= value;
        } else if (operator == '*') {
            result *= value;
        } else if (operator == '/') {
            if (value != 0) {
                result /= value;
            } else {
                throw new ArithmeticException("Division by zero");
            }
        }

        return result;
    }
}
