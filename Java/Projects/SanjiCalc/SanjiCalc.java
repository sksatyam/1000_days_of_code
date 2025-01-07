// TODO: Create a switch-case function for the main logic 
// create a function that counts the number of times arithmetic operation need to perform {then we will find out  the total number of numbers we have by simply adding 1 in that number}
// then create a array funcion that seperate the numbers and and the operators in a 2d array
// then create a main class where main logic work will be done means will use the the functions that create will used and generate the final result {will also done by a method in that class}

import javax.management.openmbean.ArrayType;
import javax.swing.*;

import java.awt.event.*;

class Func {
    // function to check is any string a double or not
    // public boolean isNum(String str) {
    // try {
    // Double.parseDouble(str);
    // return true;
    // } catch (Exception e) {
    // return false;
    // }

    // }

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
                for (int i = 0; i < num2; i++) {
                    result *= result;
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

    class ArrayPair { // this function is not been tested yet
        //
        double[] arrayOfDoubles;
        char[] arrayOfOperators;

        ArrayPair() {

        }

        public ArrayPair(double[] arraydb, char[] arraych) {
            arrayOfDoubles = new double[arraydb.length];
            arrayOfOperators = new char[arraych.length];

            System.arraycopy(arraydb, 0, arrayOfDoubles, 0, arraydb.length);
            System.arraycopy(arraych, 0, arrayOfOperators, 0, arraych.length);

        }
    }

    public void stringToArray(String str) { // Error is here becase I didn,t create ArrayPair class So I am
                                            // thinking to return that result in a 2d array instead of creating a
                                            // class but this may be wrong in this case but let see.
        int[] arr = charAndDigitCounter(str);
        arrayOfOperators = new char[arr[0]];
        arrayOfDoubles = new double[arr[1]];
        int startIndex = 0, endIndex = 0, cnt_optr = 0, cnt_dubl = 0;

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

// class mainLogic {
// Func fn = new Func();
// String str;
// double result = 0;

// mainLogic(String str) {
// this.str = str;
// }

// int[] arr = fn.charAndDigitCounter(str);

// fn.ArrayPair Arrpr = fn.stringToArray(str);

// for(int i = 0;i<Arrpr.arrayOfDigits.length;i++){
// }
//
// }

public class SanjiCalc {
    public static int first_Num = 0;
    public static String second_Num = "";
    public static String seqence = "";

    public static void main(String[] args) {
        Func fn = new Func();
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
                fn.calculate(seqence);
                String res = Double.toString(Func.result);
                display.setText(res);

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
