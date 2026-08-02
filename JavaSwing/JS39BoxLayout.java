package JavaSwing;
// box layout, arranges the components is a single row or single column, only one constructor is used.


import javax.swing.*;
import java.awt.*;

public class JS39BoxLayout {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setTitle("Box Layout");
        jFrame.setBounds(100, 50, 500, 400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = jFrame.getContentPane();
        container.setBackground(Color.CYAN);
        jFrame.setVisible(true);

        BoxLayout boxLayout = new BoxLayout(container, BoxLayout.Y_AXIS); //X_AXIS
        container.setLayout(boxLayout);
        JButton jButton1 = new JButton("Button1");
        JButton jButton2 = new JButton("Button2--");
        JButton jButton3 = new JButton("Button3");
        JButton jButton4 = new JButton("Button4-----");
        jButton1.setAlignmentX(Component.CENTER_ALIGNMENT); // can be done alignment left right or center
        jButton2.setAlignmentX(Component.CENTER_ALIGNMENT);
        jButton3.setAlignmentX(Component.CENTER_ALIGNMENT);
        jButton4.setAlignmentX(Component.CENTER_ALIGNMENT);
        container.add(jButton1, "1");
        container.add(Box.createRigidArea(new Dimension(0,80)));
        container.add(jButton2, "2");
        container.add(jButton3, "3");
        container.add(jButton4, "4");

    }
}
