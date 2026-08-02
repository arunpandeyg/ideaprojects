package JavaSwing;
//how to create, setFont(Font), setEnabled(boolean), setSelected(boolean).


import javax.swing.*;
import java.awt.*;

public class JS14JCheckBox {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Text Area");
        frame.setBounds(100, 100, 700, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = frame.getContentPane();
        c.setLayout(null);
        JCheckBox c1 = new JCheckBox("High School");
        JCheckBox c2 = new JCheckBox("Inter Mediate");
        JCheckBox c3 = new JCheckBox("Graduate");
        JCheckBox c4 = new JCheckBox("Post Graduate");
        c1.setBounds(100,50,120,20);
        c2.setBounds(240,50,120,20);
        c3.setBounds(360,50,120,20);
        c4.setBounds(480,50,130,20);
        c.add(c1);
        c.add(c2);
        c.add(c3);
        c.add(c4);
        c1.setSelected(true); // for active inactive
        c4.setEnabled(false); // for active inactive
        Font font = new Font("Arial", Font.ITALIC, 15);
        c1.setFont(font);
        c2.setFont(font);
        c3.setFont(font);
        c4.setFont(font);

        frame.setVisible(true);
    }
}
