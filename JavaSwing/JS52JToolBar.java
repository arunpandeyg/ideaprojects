package JavaSwing;
//50, JToolBar

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JS52JToolBar extends JFrame implements ActionListener {
    JToolBar jToolBar = new JToolBar();
    JButton jButton1 = new JButton("");
    JButton jButton2 = new JButton("");
    JTextField jTextField = new JTextField();
    JComboBox<String> jComboBox = new JComboBox<>(new String[]{"Item1", "Item2", "Item3", "Item4"});
    JLabel jLabel = new JLabel();

    JS52JToolBar(){
        JFrame jFrame = new JFrame("JTool Bar");
        jFrame.setSize(500, 400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        jToolBar.add(jComboBox);
        jToolBar.add(jTextField);
        jToolBar.add(jButton1);
        jToolBar.addSeparator();
        jToolBar.add(jButton2);

        jToolBar.setFloatable(false);  //it will stop floating nature of toolbar.
        jComboBox.addActionListener( this);
        jTextField.addActionListener(this);
        jButton1.addActionListener(this);
        jButton2.addActionListener(this);
        jFrame.add(BorderLayout.NORTH, jToolBar);
        jFrame.add(jLabel);


        jFrame.revalidate();
    }
    public static void main(String[] args) {
        new JS52JToolBar();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jButton1){
            jLabel.setText("Button 1 clicked");
        }
        else if (e.getSource() == jButton2){
            jLabel.setText("Button 2 clicked");
        }
        else if (e.getSource() == jComboBox){
           jLabel.setText(jComboBox.getSelectedItem() + " is selected");
        }
        else if (e.getSource() == jTextField){
            jLabel.setText("Enter is pressed in text field");
        }
    }
}
