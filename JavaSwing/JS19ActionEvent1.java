package JavaSwing;
//Action event 1

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class EventFrame extends JFrame implements ActionListener {
    Container c;
    JButton button;


    public EventFrame(){
        c = this.getContentPane();
        c.setLayout(null);

        button = new JButton("click me");
        button.setBounds(100, 100, 100, 30);
        c.add(button);
        button.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String str = button.getText();
        button.setText(str.toUpperCase());
    }
}
public class JS19ActionEvent1 {
    public static void main(String[] args) {
        EventFrame f = new EventFrame();
        f.setTitle("Action Event");
        f.setBounds(100, 100, 400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




        f.setVisible(true);
    }
}
