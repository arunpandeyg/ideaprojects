package JavaSwing;
//28, JPanel, components, light weight and heavyweight components , container


import javax.swing.*;
import java.awt.*;

public class JS37JPanel {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setTitle("JPanel");
        jFrame.setBounds(100, 100, 500, 400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = jFrame.getContentPane();
        container.setBackground(Color.CYAN);
        container.setLayout(null);
        jFrame.setVisible(true);

        JPanel jPanel = new JPanel();
        jPanel.setBounds(100, 50, 300, 300);
        jPanel.setBackground(Color.ORANGE);
        jPanel.setLayout(null);
        container.add(jPanel);

        JPanel jPanel1 = new JPanel();
        jPanel1.setBounds(50, 50, 200, 200);
        jPanel1.setBackground(Color.RED);
        jPanel.add(jPanel1);

        JButton jButton = new JButton("Button");
        jPanel1.add(jButton);








    }
}
