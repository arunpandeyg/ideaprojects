package JavaSwing;
//event handling with anonymous inner class
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JS8ActionDemo {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Arun Pandey");
        jf.setBounds(100, 100, 1000, 500);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = jf.getContentPane();
        c.setLayout(null);

        JButton btn = new JButton("Click Me");
        btn.setBounds(100, 100, 120, 30);
        c.add(btn);
       /* btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                c.setBackground(Color.ORANGE);
            }
        });*/
        btn.addActionListener(e -> c.setBackground(Color.ORANGE));

    }
}
