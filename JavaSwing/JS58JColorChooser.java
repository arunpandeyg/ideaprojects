package JavaSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JS58JColorChooser extends JFrame {
    public JS58JColorChooser(){
       JFrame jFrame = new JFrame();
       jFrame.setSize(600, 400);
       jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       jFrame.setVisible(true);
       Container container = jFrame.getContentPane();
       container.setLayout(new GridBagLayout());
       JButton jButton = new JButton("Change Color");
       container.add(jButton);
        jButton.addActionListener(e -> {
            Color color = JColorChooser.showDialog(null, "Slect a Color", Color.ORANGE);
            container.setBackground(color);
        });
       /*jButton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
              Color color = JColorChooser.showDialog(null, "Slect a Color", Color.ORANGE);
               container.setBackground(color);
           }
       });*/
        jFrame.revalidate();
    }
    public static void main(String[] args) {
        new JS58JColorChooser();
    }
}
