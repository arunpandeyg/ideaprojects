package JavaSwing;

import javax.swing.*;
import java.awt.*;

public class JS12TextArea {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setTitle("Text Area");
        frame.setBounds(100, 100, 700, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = frame.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(100, 100, 400, 200);
        c.add(textArea);

        textArea.setText("This is a text area");
        textArea.setFont(new Font("Arial", Font.BOLD, 15));
        textArea.setEnabled(true); //true or false
        textArea.setLineWrap(true); //for new line with in area


        frame.setVisible(true);
    }
}
