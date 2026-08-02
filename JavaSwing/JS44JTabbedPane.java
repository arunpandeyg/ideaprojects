package JavaSwing;
//34, JTabbedPane
import javax.swing.*;
import java.awt.*;

public class JS44JTabbedPane {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("JTabbed Pane");
        jFrame.setLayout(null);
        jFrame.setBackground(Color.cyan);
        JTabbedPane jTabbedPane = new JTabbedPane();
        jTabbedPane.setBounds(50, 50, 500, 300);
        jFrame.add(jTabbedPane);
        JPanel jPanel1 = new JPanel();
        JPanel jPanel2 = new JPanel();
        JPanel jPanel3 = new JPanel();
        jPanel1.add(new JLabel("This is my first page"));
        jPanel2.add(new JLabel("This is my Second page"));
        jPanel3.add(new JLabel("This is my Third page"));

        jTabbedPane.add("First", jPanel1);
        jTabbedPane.add("Second", jPanel2);
        jTabbedPane.add("Third", jPanel3);



        jFrame.setSize(700, 400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
