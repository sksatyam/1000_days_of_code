import javax.swing.*;
import java.awt.event.*;

public class test extends JFrame {
    public test() {
        setTitle("KeyListener Example");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField textField = new JTextField();
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                boolean isShiftPressed = e.isShiftDown();

                if (isShiftPressed) {
                    if (keyCode == KeyEvent.VK_EQUALS) {
                        System.out.println("Shift + + key pressed");
                    } else if (keyCode == KeyEvent.VK_8) { // '*' is typically accessed with shift + 8
                        System.out.println("Shift + * key pressed");
                    } else if (keyCode == KeyEvent.VK_6) { // '^' key
                        System.out.println("Shift + ^ key pressed");
                    }
                }
            }
        });

        add(textField);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            test frame = new test();
            frame.setVisible(true);
        });
    }
}
