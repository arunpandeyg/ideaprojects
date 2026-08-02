package JavaSwing;

import javax.swing.*;
import java.awt.*;

public class JS13JRadioButton {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Text Area");
        frame.setBounds(100, 100, 700, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = frame.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);
        JRadioButton male = new JRadioButton("Male");
        male.setBounds(100, 50, 70, 20);
        c.add(male);
        male.setSelected(true);
        JRadioButton female = new JRadioButton("Female");
        female.setBounds(190, 50, 80, 20);
        c.add(female);
        Font font = new Font("Arial", Font.BOLD, 16);
        male.setFont(font);
        female.setFont(font);

        ButtonGroup gender = new ButtonGroup();
        gender.add(male);
        gender.add(female);

        JRadioButton general = new JRadioButton("General");
        general.setBounds(100, 80, 60, 20);
        c.add(general);
        JRadioButton obc = new JRadioButton("OBC");
        obc.setBounds(170, 80, 60, 20);
        c.add(obc);
        obc.setEnabled(false);   //with true can enable and with false can disable.
        JRadioButton sc = new JRadioButton("SC");
        sc.setBounds(240, 80, 60, 20);
        c.add(sc);
        JRadioButton st = new JRadioButton("ST");
        st.setBounds(310, 80, 60, 20);
        c.add(st);
        ButtonGroup cast = new ButtonGroup();
        cast.add(general);
        cast.add(obc);
        cast.add(sc);
        cast.add(st);
        general.setSelected(true);


        frame.setVisible(true);
    }
}
