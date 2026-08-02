package JavaSwing;

import javax.swing.*;
import java.awt.*;

public class JS3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 1000, 500);
        Container c = frame.getContentPane();
        c.setLayout(null);
        ImageIcon icon = new ImageIcon("C:\\Users\\arunp_7\\Desktop\\images\\image2 - Copy.jpg");
        JLabel label = new JLabel("Text", icon, SwingConstants.CENTER); //Jlable.left or right or center in capital
        label.setBounds(50, 100, 800, 450);
        c.add(label);

        frame.setVisible(true);
    }
}
