package JavaSwing;
//Action Listener menu bar item practice

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class AEvent3 extends JFrame implements ActionListener {
    JMenuBar menuBar;
    JMenu file, edit;
    JMenuItem i1, i2, i3, i4, i5, i6, i7;
    JTextArea jTextArea;

    public AEvent3(){
        Container c = getContentPane();
        c.setLayout(null);
        menuBar = new JMenuBar();
        file = new JMenu("File");
        edit = new JMenu("Edit");

        i1 = new JMenuItem("New");
        i2 = new JMenuItem("Open");
        i3 = new JMenuItem("Save");
        i4 = new JMenuItem("Cut");
        i5 = new JMenuItem("Copy");
        i6 = new JMenuItem("Paste");
        i7 = new JMenuItem("Select All");
        i1.addActionListener(this);
        i2.addActionListener(this);
        i3.addActionListener(this);
        i4.addActionListener(this);
        i5.addActionListener(this);
        i6.addActionListener(this);
        i7.addActionListener(this);

        file.add(i1);
        file.add(i2);
        file.add(i3);

        edit.add(i4);
        edit.add(i5);
        edit.add(i6);
        edit.add(i7);

        menuBar.add(file);
        menuBar.add(edit);

       this.setJMenuBar(menuBar);
       jTextArea = new JTextArea();
       jTextArea.setBounds(10, 10, 370, 370);
       c.add(jTextArea);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == i1){
            jTextArea.setText("New File...");
        }
        if (e.getSource() == i2){
            jTextArea.setText("Open File...");
        }
        if (e.getSource() == i3){
            jTextArea.setText("Save File...");
        }
        if (e.getSource() == i4){
            jTextArea.cut();
        }
        if (e.getSource() == i5){
            jTextArea.copy();
        }
        if (e.getSource() == i6){
            jTextArea.paste();
        }
        if (e.getSource() == i7){
            jTextArea.selectAll();
        }


    }
}

public class JS21AE3 {
    public static void main(String[] args) {
        AEvent3 f = new AEvent3();
        f.setTitle("Action Event");
        f.setBounds(100, 100, 400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}
