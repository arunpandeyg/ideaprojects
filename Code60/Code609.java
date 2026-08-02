package Code60;
//write an application that displays a frame containing two labels that display your name,
// one for your first name and one for your last name.

import javax.swing.*;
import java.awt.*;

public class Code609 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My name");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label1 = new JLabel("Rudra");
        JLabel label2 = new JLabel("Pandey");

        //panel inside the frame
        JPanel panel = new JPanel();
        panel.setBackground(Color.CYAN);
        panel.setPreferredSize(new Dimension(400,200));
        panel.add(label1);
        panel.add(label2);

        //display everything in frame
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);



    }
}
