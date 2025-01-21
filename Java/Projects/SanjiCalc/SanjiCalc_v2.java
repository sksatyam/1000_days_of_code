// TODO: Create a switch-case function for the main logic 
// create a function that counts the number of times arithmetic operation need to perform {then we will find out  the total number of numbers we have by simply adding 1 in that number}
// then create a array funcion that seperate the numbers and and the operators in a 2d array
// then create a main class where main logic work will be done means will use the the functions that create will used and generate the final result {will also done by a method in that class}

import javax.swing.border.Border;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class RoundedButton extends JButton {
    private int cornerRadius = 20;

    public RoundedButton(String text) {
        super(text); // Set button text
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);

        // Hover effect: Reduce brightness by 10% on hover (e.g., for a button with
        // rgb(62, 62, 66), darken to approximately rgb(56, 56, 60)).

        if (text.equals("=")) {
            setForeground(new Color(28, 28, 30)); // Set text color to white
            setBackground(new Color(0, 255, 255)); // Set button background color to grey
        } else if (text.equals("+") || text.equals("-") || text.equals("/") || text.equals("X") || text.equals("C")
                || text.equals("DEL") || text.equals("^")) {
            setForeground(new Color(248, 248, 242)); // Set text color to white
            setBackground(new Color(90, 90, 94)); // Set button background color to grey
        }

        else { // for all the numerical and and . and 00 buttons
            setForeground(new Color(248, 248, 242)); // Set text color to white
            setBackground(new Color(62, 62, 66)); // Set button background color to grey
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // button background rounded corners
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), cornerRadius, cornerRadius);

        // Optional: border
        // g2.setColor(Color.DARK_GRAY); // Border color
        // g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, cornerRadius,
        // cornerRadius);

        // Call super to paint the text using the setForeground color
        super.paintComponent(g);
    }

    @Override
    public void paintBorder(Graphics g) {
        // Avoid painting the default border
    }
}

class Func {

    public static double result = 0;
    public static char[] arrayOfOperators;
    public static double[] arrayOfDoubles;

    public boolean isNum(char str) {
        return Character.isDigit(str);
    }

    public int[] range(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            boolean temp = isNum(str.charAt(i));
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

    // Main Switch case function to perform Operation
    public void arithmeticPerformer(double num2, char symbol) {
        switch (symbol) {
            case '+':
                result = result + num2;
                break;
            case '-':
                result = result - num2;
                break;
            case 'x':
                result = result * num2;
                break;
            case '/':
                result = result / num2;
                break;
            case '^':
                for (int i = 0; i < num2; i++) { // I dont Know why but suare is not working
                    result *= num2;
                }
                break;
            default:

                System.out.println("Something is Wrong");
        }
    }

    public int[] charAndDigitCounter(String str) {
        // At index 0 it is the number of operators and index 1 number of numbers;
        int[] arr = new int[2];
        arr[0] = 0;
        arr[1] = 0;
        for (int i = 0; i < str.length(); i++) {
            if (!isNum(str.charAt(i)) && str.charAt(i) != '.') {
                arr[0]++;
            }
        }
        arr[1] = arr[0] + 1;
        return arr;
    }

    public void stringToArray(String str) { // Error is here becase I didn,t create ArrayPair class So I am
                                            // thinking to return that result in a 2d array instead of creating a
                                            // class but this may be wrong in this case but let see.
        int[] arr = charAndDigitCounter(str);
        arrayOfOperators = new char[arr[0]];
        arrayOfDoubles = new double[arr[1]];
        int startIndex = 0, cnt_optr = 0, cnt_dubl = 0;

        for (int i = 0; i < str.length(); i++) {
            if (isNum(str.charAt(i)) || str.charAt(i) == '.') {
            } else {
                arrayOfOperators[cnt_optr++] = str.charAt(i);
                arrayOfDoubles[cnt_dubl++] = Double.parseDouble(str.substring(startIndex, i));
                startIndex = i + 1;

            }
        }

        arrayOfDoubles[cnt_dubl++] = Double.parseDouble(str.substring(startIndex));

    }

    public void calculate(String str) {
        stringToArray(str);
        char oper = '+';
        for (int i = 0; i < arrayOfDoubles.length; i++) {
            arithmeticPerformer(arrayOfDoubles[i], oper);
            System.out.println(result);
            try {
                oper = arrayOfOperators[i];
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }

}

public class SanjiCalc_v2 {
    public static int first_Num = 0;
    public static String second_Num = "";
    public static String seqence = "";

    public static void main(String[] args) {
        char oper = '+';
        Func fn = new Func();
        // Create main frame
        JFrame frame = new JFrame("Improved Calculator");
        frame.setSize(380, 460);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(28, 28, 30));
        frame.setResizable(false);

        // Display field
        JTextField display = new JTextField();
        display.setBounds(30, 10, 310, 80);
        frame.add(display);
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setBackground(new Color(46, 46, 48));
        display.setForeground(new Color(204, 204, 204));

        Border border = BorderFactory.createLineBorder(new Color(46, 46, 48), 2);
        display.setBorder(border);

        // Buttons for first row
        RoundedButton btnDel = new RoundedButton("DEL");
        btnDel.setBounds(30, 100, 70, 50);

        RoundedButton btnSquare = new RoundedButton("^");
        btnSquare.setBounds(190, 100, 70, 50);

        RoundedButton btnClear = new RoundedButton("C");
        btnClear.setBounds(110, 100, 70, 50);

        RoundedButton btnDivide = new RoundedButton("/");
        btnDivide.setBounds(270, 100, 70, 50);

        // Buttons for digits (second row onwards)
        RoundedButton btn1 = new RoundedButton("1");
        btn1.setBounds(30, 160, 70, 50);

        RoundedButton btn2 = new RoundedButton("2");
        btn2.setBounds(110, 160, 70, 50);

        RoundedButton btn3 = new RoundedButton("3");
        btn3.setBounds(190, 160, 70, 50);

        RoundedButton btnAdd = new RoundedButton("+");
        btnAdd.setBounds(270, 160, 70, 50);

        RoundedButton btn4 = new RoundedButton("4");
        btn4.setBounds(30, 220, 70, 50);

        RoundedButton btn5 = new RoundedButton("5");
        btn5.setBounds(110, 220, 70, 50);

        RoundedButton btn6 = new RoundedButton("6");
        btn6.setBounds(190, 220, 70, 50);

        RoundedButton btnSubtract = new RoundedButton("-");
        btnSubtract.setBounds(270, 220, 70, 50);

        RoundedButton btn7 = new RoundedButton("7");
        btn7.setBounds(30, 280, 70, 50);

        RoundedButton btn8 = new RoundedButton("8");
        btn8.setBounds(110, 280, 70, 50);

        RoundedButton btn9 = new RoundedButton("9");
        btn9.setBounds(190, 280, 70, 50);

        RoundedButton btnMultiply = new RoundedButton("X");
        btnMultiply.setBounds(270, 280, 70, 50);

        RoundedButton btn0 = new RoundedButton("0");
        btn0.setBounds(30, 340, 70, 50);

        RoundedButton btnDot = new RoundedButton(".");
        btnDot.setBounds(110, 340, 70, 50);

        RoundedButton btnDoubleZero = new RoundedButton("00");
        btnDoubleZero.setBounds(190, 340, 70, 50);

        RoundedButton btnEquals = new RoundedButton("=");
        btnEquals.setBounds(270, 340, 70, 50);

        btn0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                second_Num += "0";
                display.setText(seqence + second_Num);
                frame.requestFocusInWindow();

            }
        });

        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                second_Num += "1";
                display.setText(seqence + second_Num);
                frame.requestFocusInWindow();
            }
        });

        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                second_Num += "2";
                display.setText(seqence + second_Num);
                frame.requestFocusInWindow();
            }
        });

        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                second_Num += "3";
                display.setText(seqence + second_Num);
                frame.requestFocusInWindow();
            }
        });

        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                second_Num += "4";
                display.setText(seqence + second_Num);
                frame.requestFocusInWindow();
            }
        });

        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                second_Num += "5";
                display.setText(seqence + second_Num);
                frame.requestFocusInWindow();
            }
        });

        btn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                second_Num += "6";
                display.setText(seqence + second_Num);
                frame.requestFocusInWindow();
            }
        });

        btn7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                second_Num += "7";
                display.setText(seqence + second_Num);
                frame.requestFocusInWindow();
            }
        });

        btn8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                second_Num += "8";
                display.setText(seqence + second_Num);
                frame.requestFocusInWindow();
            }
        });

        btn9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                second_Num += "9";
                display.setText(seqence + second_Num);
                frame.requestFocusInWindow();
            }
        });

        btnDot.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (second_Num.contains(".")) {

                } else {
                    second_Num += ".";
                    // seqence += second_Num;
                }
                display.setText(seqence + second_Num);
                frame.requestFocusInWindow();

            }
        });

        btnDoubleZero.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                second_Num += "00";
                display.setText(seqence + second_Num);
                frame.requestFocusInWindow();
            }
        });

        btnDel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                second_Num = "";
                seqence = "";
                display.setText(seqence + second_Num);
                frame.requestFocusInWindow();
            }
        });

        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                seqence += second_Num;
                seqence += "+";
                second_Num = "";
                display.setText(seqence);
                System.out.println(seqence);
                System.out.println(second_Num);
                frame.requestFocusInWindow();

            }
        });

        btnSubtract.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                seqence += second_Num;
                seqence += "-";
                second_Num = "";
                display.setText(seqence);
                System.out.println(seqence);
                System.out.println(second_Num);
                frame.requestFocusInWindow();
            }
        });

        btnMultiply.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                seqence += second_Num;
                seqence += "x";
                second_Num = "";
                display.setText(seqence);
                System.out.println(seqence);
                System.out.println(second_Num);
                frame.requestFocusInWindow();

            }
        });

        btnDivide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                seqence += second_Num;
                seqence += "/";
                second_Num = "";
                display.setText(seqence);
                System.out.println(seqence);
                System.out.println(second_Num);
                frame.requestFocusInWindow();
            }
        });

        btnSquare.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                seqence += second_Num;
                seqence += "^";
                second_Num = "";
                display.setText(seqence);
                System.out.println(seqence);
                System.out.println(second_Num);
                frame.requestFocusInWindow();

            }
        });

        btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                second_Num = "";
                display.setText(seqence + second_Num);
                frame.requestFocusInWindow();
            }
        });

        btnEquals.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                seqence += second_Num;
                second_Num = "";
                fn.calculate(seqence);
                String res = Double.toString(Func.result);
                display.setText(res);
                Func.result = 0;
                seqence = "";
                frame.requestFocusInWindow();

            }
        });
        boolean ShiftPressed = false;
        if (ShiftPressed) {

        }
        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                boolean isShiftPressed = e.isShiftDown();

                if (isShiftPressed) {
                    switch (keyCode) {
                        case KeyEvent.VK_EQUALS:
                            btnAdd.doClick();
                            break;
                        case KeyEvent.VK_8:
                            btnMultiply.doClick();
                            break;
                        case KeyEvent.VK_6:
                            btnSquare.doClick();
                            break;
                    }
                } else {
                    switch (keyCode) {
                        case KeyEvent.VK_0:
                            btn0.doClick();
                            break;
                        case KeyEvent.VK_1:
                            btn1.doClick();
                            break;
                        case KeyEvent.VK_2:
                            btn2.doClick();
                            break;
                        case KeyEvent.VK_3:
                            btn3.doClick();
                            break;
                        case KeyEvent.VK_4:
                            btn4.doClick();
                            break;
                        case KeyEvent.VK_5:
                            btn5.doClick();
                            break;
                        case KeyEvent.VK_6:
                            btn6.doClick();
                            break;
                        case KeyEvent.VK_7:
                            btn7.doClick();
                            break;
                        case KeyEvent.VK_8:
                            btn8.doClick();
                            break;
                        case KeyEvent.VK_9:
                            btn9.doClick();
                            break;
                        case KeyEvent.VK_ADD:
                            btnAdd.doClick();
                            break;
                        case KeyEvent.VK_MINUS:
                            btnSubtract.doClick();
                            break;

                        case KeyEvent.VK_MULTIPLY:
                            btnMultiply.doClick();
                            break;

                        case KeyEvent.VK_DIVIDE:
                        case KeyEvent.VK_SLASH:
                            btnDivide.doClick();
                            break;
                        case KeyEvent.VK_DECIMAL:
                        case KeyEvent.VK_PERIOD:
                            btnDot.doClick();
                            break;
                        case KeyEvent.VK_EQUALS:
                            btnEquals.doClick();
                            break;
                        case KeyEvent.VK_ENTER:
                            btnEquals.doClick();
                            break;
                        case KeyEvent.VK_BACK_SPACE:
                            btnDel.doClick();
                            break;
                        case KeyEvent.VK_C:
                            btnClear.doClick();
                            break;
                        default:
                            break;
                    }
                }
            }
        });

        // For Focus to the frame
        frame.setFocusable(true);
        frame.requestFocusInWindow();

        // Add buttons to the frame
        frame.add(btnDel);
        frame.add(btnDivide);
        frame.add(btnSquare);
        frame.add(btnClear);

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
