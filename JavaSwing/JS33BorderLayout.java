package JavaSwing;
//24, border layout


import javax.swing.*;
import java.awt.*;

public class JS33BorderLayout {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Border Layout");
        jFrame.setBounds(300, 200, 500, 300);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = jFrame.getContentPane();
        BorderLayout borderLayout = new BorderLayout();  //can also be used

        JButton jButton1 = new JButton("Page Start");
        JButton jButton2 = new JButton("Page End");
        JButton jButton3 = new JButton("Line Start");
        JButton jButton4 = new JButton("Center");
        JButton jButton5 = new JButton("Line End");
        container.add(jButton1, BorderLayout.PAGE_START);
        container.add(jButton2, BorderLayout.PAGE_END);
        container.add(jButton3, BorderLayout.LINE_START);
        container.add(jButton4, BorderLayout.CENTER);
        container.add(jButton5, BorderLayout.LINE_END);
        //container.add(jButton1); //also can do, but it will set on center
//gap setting can be done by passing in borderLayout object constructor or by calling setH/VGsp methods and getH/VGap.
        borderLayout.setHgap(10);
        borderLayout.setVgap(5);


        jFrame.setVisible(true);
    }
}
