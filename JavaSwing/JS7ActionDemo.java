package JavaSwing;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener {
    Container c;
    JButton btn1 = new JButton("CYAN");
    JButton btn2 = new JButton("Green");
    JButton btn3 = new JButton("Yellow");
    MyFrame(){
       c = this.getContentPane();
       c.setLayout(null);
       btn1.setBounds(100, 100, 110, 30);
       btn2.setBounds(450, 100, 110, 30);
       btn3.setBounds(800, 100, 110, 30);
       c.add(btn1);
       c.add(btn2);
       c.add(btn3);
       btn1.addActionListener(this);
       btn2.addActionListener(this);
       btn3.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if (e.getSource() == btn1){
           c.setBackground(Color.CYAN);
       }if (e.getSource() == btn2){
           c.setBackground(Color.YELLOW);
       }if (e.getSource() == btn3){
            c.setBackground(Color.ORANGE);
        }
    }
}
public class JS7ActionDemo {
    public static void main(String[] args) {
          MyFrame mf = new MyFrame();
          mf.setTitle("Action Demo");
          mf.setSize(1000, 500);
          mf.setLocation(100, 100);
          mf.setVisible(true);
          mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
