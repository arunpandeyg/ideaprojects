package JavaSwing;

import javax.swing.*;
import java.awt.*;

public class JS4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 1000, 500);
        Container c = frame.getContentPane();
        c.setLayout(null);

        JTextField t1 = new JTextField();
        t1.setBounds(100, 100, 170, 30);
        c.add(t1);
        t1.setText("Arun Pandey");
        Font font = new Font("Arial", Font.PLAIN, 25);
        t1.setFont(font);

        t1.setForeground(Color.CYAN);
        t1.setBackground(Color.ORANGE);
        t1.setEnabled(false);  //true can be edited and false can't be edited.



        frame.setVisible(true);
    }
}
