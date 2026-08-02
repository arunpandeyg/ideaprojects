package JavaSwing;
//JButton


import javax.swing.*;
import java.awt.*;

public class JS6Button {


    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 1000, 500);
        Container c = frame.getContentPane();
        c.setLayout(null);
        ImageIcon icon = new ImageIcon("C:\\Users\\arunp_7\\OneDrive\\Desktop\\images\\image3.jpg");


        JButton btn = new JButton(icon);
        //JButton btn = new JButton("Click Me");
        btn.setSize(icon.getIconWidth(), icon.getIconHeight());  //pass image size or call size set methods
        btn.setLocation(100, 100);
        c.add(btn);
       /* Font font = new Font("Arial", Font.PLAIN, 20);
        btn.setFont(font);
        btn.setText("My Button");
        btn.setForeground(Color.red);
        btn.setBackground(Color.yellow);
        Cursor cur = new Cursor(Cursor.HAND_CURSOR);
        btn.setCursor(cur);
        btn.setEnabled(true); //true or false boolean methods
        btn.setVisible(true); // true or false   boolean methods*/


        frame.setVisible(true);
    }
}
