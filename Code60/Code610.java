package Code60;
//write an app that display a frame containing two panels. Each panel should contain two imeges
// (use 4 unique images of your choice). Fix the size of the first panel so that both of its
// images remain side by side. allow the other panel to change size as needed.

import javax.swing.*;
import java.awt.*;

public class Code610 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Two Panels and Images");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //image path
        ImageIcon icon1 = new ImageIcon("\"C:\\Users\\arunp_7\\OneDrive\\Desktop\\images\\image1.jfif\"");
        ImageIcon icon2 = new ImageIcon("\"C:\\Users\\arunp_7\\OneDrive\\Desktop\\images\\image2.jpg\"");
        ImageIcon icon3 = new ImageIcon("\"C:\\Users\\arunp_7\\OneDrive\\Desktop\\images\\image3.jpg\"");
        ImageIcon icon4 = new ImageIcon("\"C:\\Users\\arunp_7\\OneDrive\\Desktop\\images\\image4.jfif\"");

        //labels
        JLabel label1, label2, label3, label4;
        label1 = new JLabel("Text left", icon1, SwingConstants.CENTER);
        label2 = new JLabel("Text Right", icon2, SwingConstants.CENTER);
        label3 = new JLabel("Text center above", icon3, SwingConstants.CENTER);
        label4 = new JLabel("Text center down", icon4, SwingConstants.CENTER);


        //first panel
        JPanel panel1 = new JPanel();
        panel1.setPreferredSize(new Dimension(600,400));
        panel1.setBackground(Color.red);
        label1.setHorizontalTextPosition(SwingConstants.LEFT);
        label2.setHorizontalTextPosition(SwingConstants.RIGHT);
        panel1.add(label1);
        panel1.add(label2);

        //second panel
        JPanel panel2 = new JPanel();
        panel2.setPreferredSize(new Dimension(600,400));
        panel2.setBackground(Color.green);
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.NORTH);
        label4.setHorizontalTextPosition(SwingConstants.CENTER);
        label4.setVerticalTextPosition(SwingConstants.BOTTOM);
        panel2.add(label3);
        panel2.add(label4);

        //main container
        JPanel primary = new JPanel();
        primary.setBackground(Color.blue);
        primary.add(panel1);
        primary.add(panel2);

        //put in all together
        frame.getContentPane().add(primary);
        frame.pack();
        frame.setVisible(true);



    }
}
