package JavaSwing;
//event handling with helper class
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JS9ButtonEvent {
    public static Container c;
    public static void main(String[] args) {
        JFrame jf = new JFrame("Arun Pandey");
        jf.setBounds(100, 100, 1000, 500);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        c = jf.getContentPane();
        c.setLayout(null);
        JButton red = new JButton("CYAN");
        JButton yellow = new JButton("YELLOW");
        JButton green = new JButton("GREEN");
        red.setBounds(100, 100, 120, 30);
        yellow.setBounds(400, 100, 120, 30);
        green.setBounds(750, 100, 120, 30);
        c.add(red);
        c.add(yellow);
        c.add(green);
        red.addActionListener(new RedClass());
        yellow.addActionListener(new YellowClass());
        green.addActionListener(new GreenClass());

    }
    static class RedClass implements ActionListener{
        public void actionPerformed(ActionEvent e){
            JS9ButtonEvent.c.setBackground(Color.CYAN);
        }
    }
    static class YellowClass implements ActionListener{
        public void actionPerformed(ActionEvent e){
            JS9ButtonEvent.c.setBackground(Color.ORANGE);
        }
    }
    static class GreenClass implements ActionListener{
        public void actionPerformed(ActionEvent e){
            JS9ButtonEvent.c.setBackground(Color.GREEN);
        }
    }
}
