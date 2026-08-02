package JavaSwing;
//22, 23, the arrangement of the components inside the container is called layout.
// null layout, BorderLayout, FlowLayout, GridLayout, GridBagLayout, CardLayout, GroupLayout, BoxLayout.
//Null Layout is used for fixed position of buttons, text area, text field  and windows

import javax.swing.*;
import java.awt.*;

public class JS32LayoutManagers {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setBounds(300, 200, 500, 300);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container= jFrame.getContentPane();
        container.setLayout(null);
        JButton jButton1 = new JButton("Button1");
        JButton jButton2 = new JButton("Button2");
        JButton jButton3 = new JButton("Button3");
        JButton jButton4 = new JButton("Button4");
        JButton jButton5 = new JButton("Button5");
        jButton1.setBounds(20, 20, 80, 30);
        jButton2.setBounds(120, 20, 80, 30);
        jButton3.setBounds(220, 20, 80, 30);
        jButton4.setBounds(20, 100, 80, 30);
        jButton5.setBounds(120, 100, 80, 30);
        container.add(jButton1);
        container.add(jButton2);
        container.add(jButton3);
        container.add(jButton4);
        container.add(jButton5);

        jFrame.setVisible(true);
    }

}

class NullLayout extends JFrame{
    public NullLayout(){
        Container container= getContentPane();
        container.setLayout(null);
        JButton jButton1 = new JButton("Button1");
        JButton jButton2 = new JButton("Button2");
        JButton jButton3 = new JButton("Button3");
        JButton jButton4 = new JButton("Button4");
        JButton jButton5 = new JButton("Button5");
        jButton1.setBounds(20, 20, 80, 30);
        jButton2.setBounds(120, 20, 80, 30);
        jButton3.setBounds(220, 20, 80, 30);
        jButton4.setBounds(20, 100, 80, 30);
        jButton5.setBounds(120, 100, 80, 30);
        container.add(jButton1);
        container.add(jButton2);
        container.add(jButton3);
        container.add(jButton4);
        container.add(jButton5);


    }
}
class NL{
    public static void main(String[] args) {
        NullLayout nullLayout = new NullLayout();
        nullLayout.setBounds(300, 200, 500, 300);
        nullLayout.setLocationRelativeTo(null);
        nullLayout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        nullLayout.setVisible(true);
    }
}