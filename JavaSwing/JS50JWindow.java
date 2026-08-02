package JavaSwing;
//49, JWindow

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

//49. JWindow
/*class JWindow extends JFrame implements ActionListener {
    JWindow jWindow;
  public JWindow(){
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        JPanel jPanel = new JPanel();
        JButton jButton = new JButton("Click");
        jPanel.add(jButton);
        add(jPanel);
        jButton.addActionListener(this);


        validate();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        jWindow = new JWindow();
        jWindow.setSize(300, 200);
        jWindow.setLocationRelativeTo(null);
        jWindow.setVisible(true);

        JPanel jPanel1 = new JPanel();
        jPanel1.setBackground(Color.cyan);
        jPanel1.setBorder(BorderFactory.createLineBorder(Color.ORANGE));

        jPanel1.add(new JLabel("This is a window"));
        jWindow.add(jPanel1);
        jWindow.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (e.getClickCount() == 2) {
                    jWindow.dispose();
                }
            }
        });

    }
}
public class JS50JWindow {
    public static void main(String[] args) {
       new JWindow();
    }
}*/
