package JavaSwing;
//27, grid bag layout


import javax.swing.*;
import java.awt.*;

public class JS36GridBagLayout extends JFrame {
    JButton jButton1 = new JButton("Button1");
    JButton jButton2 = new JButton("Button2");
    JButton jButton3 = new JButton("Button3");
    JButton jButton4 = new JButton("Button4");
    JButton jButton5 = new JButton("Button5");
    JButton jButton6 = new JButton("Button6");
    public void GridBagLayout(){
        setTitle("Grid Layout");
        setBounds(100, 200, 500, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = getContentPane();
        GridBagLayout gridBagLayout = new GridBagLayout();
        container.setLayout(gridBagLayout);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 0.5;  // it's for all buttons
        gbc.gridx = 0;
        gbc.gridy = 0;
        //gbc.weightx = 0; // reset
        container.add(jButton1,gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        container.add(jButton2,gbc);
        gbc.gridx = 2;
        gbc.gridy = 0;
        container.add(jButton3,gbc);
        gbc.gridwidth = 3;
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.ipady = 40;
        container.add(jButton4,gbc);
        gbc.gridwidth = 2;
        gbc.ipady = 0;
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.PAGE_END;
        gbc.weighty = 1;
        container.add(jButton5,gbc);

        pack();



    }



    public static void main(String[] args) {
        JS36GridBagLayout gbl = new JS36GridBagLayout();
        gbl.GridBagLayout();
    }
}
