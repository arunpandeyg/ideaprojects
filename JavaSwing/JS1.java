package JavaSwing;
//java swing 1


import javax.swing.*;
import java.awt.*;



public class JS1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true); // to make window visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // to close the window
        frame.setSize(100, 200); // for size setting
        frame.setLocation(100, 50); //
        frame.setBounds(100, 100, 1000, 500);
        frame.setTitle("My Frame");

        ImageIcon icon = new ImageIcon("AA10YXFm");
        frame.setIconImage(icon.getImage());
        Container c = frame.getContentPane();
        c.setBackground(Color.red);
        frame.setResizable(false); //pass true for resize and false for not resize.

    }
}
