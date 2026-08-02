package JavaSwing;

import javax.swing.*;
import java.awt.*;

public class JS2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true); // to make window visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // to close the window
        frame.setBounds(0, 0, 1000, 600);
        Container c = frame.getContentPane();
        c.setLayout(null);
        JLabel label = new JLabel("UserName");
        label.setBounds(10, 10,200, 30);
        label.setText("PassWord");
        Font font = new Font("Arial", Font.PLAIN, 30);
        label.setFont(font);

        c.add(label);
        ImageIcon icon = new ImageIcon("image2 - Copy");
        JLabel label1 = new JLabel(icon);
        label1.setBounds(50, 50, icon.getIconWidth(),icon.getIconHeight());
        c.add(label1);
        JLabel label2 = new JLabel("Text", icon, JLabel.CENTER);
        label2.setBounds(0, 0, icon.getIconWidth(),icon.getIconHeight());
        label2.setBounds(0, 0, 500, 100);
        c.add(label2);
    }
}
