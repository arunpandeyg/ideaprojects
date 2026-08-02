package JavaSwing;
//Action event 2
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class EventF2 extends JFrame implements ActionListener {
    Container c;
    JTextField t1;
    public EventF2(){
        c = this.getContentPane();
        c.setLayout(null);
        t1 = new JTextField();
        t1.setBounds(100, 100, 100, 30);
        c.add(t1);
        t1.setFont(new Font("Arial", Font.BOLD, 15));
        t1.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String str = t1.getText();
        t1.setText(str.toUpperCase());
    }
}
public class JS20AE2 {
    public static void main(String[] args) {
        EventF2 f = new EventF2();
        f.setTitle("Action Event");
        f.setBounds(100, 100, 400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}
