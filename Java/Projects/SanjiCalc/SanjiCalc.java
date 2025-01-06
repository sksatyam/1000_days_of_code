import javax.swing.*;
import java.awt.event.*;

class Func {
    public boolean isNum(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public int[] range(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            boolean temp = isNum(Character.toString(str.charAt(i)));
            if (temp || str.charAt(i) == '.') {
                count += 1;
            } else {
                break;
            }

        }
        int arr[] = new int[2];
        arr[1] = count;
        return arr;
    }
}

public class SanjiCalc {
    public static int first_Num = 0;
    public static String second_Num = "";
    public static String seqence = "";

    public static void main(String[] args) {

        // Create main frame
        JFrame frame = new JFrame("Improved Calculator");
        frame.setSize(380, 460);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Display field
        JTextField display = new JTextField();
        display.setBounds(30, 30, 310, 50);
        frame.add(display);

        // Buttons for first row
        JButton btnDel = new JButton("DEL");
        btnDel.setBounds(30, 100, 70, 50);

        JButton btnSquare = new JButton("^2");
        btnSquare.setBounds(110, 100, 70, 50);

        JButton btnSqrt = new JButton("√");
        btnSqrt.setBounds(190, 100, 70, 50);

        JButton btnDivide = new JButton("/");
        btnDivide.setBounds(270, 100, 70, 50);

        // Buttons for digits (second row onwards)
        JButton btn1 = new JButton("1");
        btn1.setBounds(30, 160, 70, 50);

        JButton btn2 = new JButton("2");
        btn2.setBounds(110, 160, 70, 50);

        JButton btn3 = new JButton("3");
        btn3.setBounds(190, 160, 70, 50);

        JButton btnAdd = new JButton("+");
        btnAdd.setBounds(270, 160, 70, 50);

        JButton btn4 = new JButton("4");
        btn4.setBounds(30, 220, 70, 50);

        JButton btn5 = new JButton("5");
        btn5.setBounds(110, 220, 70, 50);

        JButton btn6 = new JButton("6");
        btn6.setBounds(190, 220, 70, 50);

        JButton btnSubtract = new JButton("-");
        btnSubtract.setBounds(270, 220, 70, 50);

        JButton btn7 = new JButton("7");
        btn7.setBounds(30, 280, 70, 50);

        JButton btn8 = new JButton("8");
        btn8.setBounds(110, 280, 70, 50);

        JButton btn9 = new JButton("9");
        btn9.setBounds(190, 280, 70, 50);

        JButton btnMultiply = new JButton("*");
        btnMultiply.setBounds(270, 280, 70, 50);

        JButton btn0 = new JButton("0");
        btn0.setBounds(30, 340, 70, 50);

        JButton btnDot = new JButton(".");
        btnDot.setBounds(110, 340, 70, 50);

        JButton btnDoubleZero = new JButton("00");
        btnDoubleZero.setBounds(190, 340, 70, 50);

        JButton btnEquals = new JButton("=");
        btnEquals.setBounds(270, 340, 70, 50); // Normal-sized button at the lower right corner

        btn0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                seqence += "0";
                display.setText(seqence);
                second_Num += "0";
            }
        });

        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                seqence += "1";
                display.setText(seqence);
                second_Num += "1";
            }
        });

        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                seqence += "2";
                display.setText(seqence);

                second_Num += "2";
            }
        });

        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                seqence += "3";
                display.setText(seqence);

                second_Num += "3";
            }
        });

        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                seqence += "4";
                display.setText(seqence);

                second_Num += "4";
            }
        });

        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                seqence += "5";
                display.setText(seqence);

                second_Num += "5";
            }
        });

        btn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                seqence += "6";
                display.setText(seqence);

                second_Num += "6";
            }
        });

        btn7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                seqence += "7";
                display.setText(seqence);

                second_Num += "7";
            }
        });

        btn8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                seqence += "8";
                display.setText(seqence);

                second_Num += "8";
            }
        });

        btn9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                seqence += "9";
                display.setText(seqence);

                second_Num += "9";
            }
        });

        btnDot.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                seqence += ".";
                display.setText(seqence);
                if (second_Num.contains(".")) {

                } else {
                    seqence += ".";
                    second_Num += ".";
                }

            }
        });

        btnDoubleZero.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                seqence += "00";
                display.setText(seqence);
            }
        });

        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                first_Num += Double.parseDouble(second_Num);
                seqence += "+";
                display.setText(seqence);

            }
        });

        btnSubtract.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                first_Num -= Double.parseDouble(second_Num);
                seqence += "-";
                display.setText(seqence);

            }
        });

        btnMultiply.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                first_Num *= Double.parseDouble(second_Num);
                seqence += "x";
                display.setText(seqence);

            }
        });

        btnDivide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                first_Num += Double.parseDouble(second_Num);
                seqence += "/";
                display.setText(seqence);

            }
        });

        btnEquals.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText();

            }
        });
        // Add buttons to the frame
        frame.add(btnDel);
        frame.add(btnDivide);
        frame.add(btnSquare);
        frame.add(btnSqrt);

        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(btnAdd);

        frame.add(btn4);
        frame.add(btn5);
        frame.add(btn6);
        frame.add(btnSubtract);

        frame.add(btn7);
        frame.add(btn8);
        frame.add(btn9);
        frame.add(btnMultiply);

        frame.add(btn0);
        frame.add(btnDot);
        frame.add(btnDoubleZero);
        frame.add(btnDivide);
        frame.add(btnEquals);

        // Set frame visibility
        frame.setVisible(true);
    }
}
