package JavaSwing;
//Radio button
import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


class ItemEvent2 extends JFrame implements ItemListener {
    JRadioButton male, female;
    JTextArea jTextArea;
    public ItemEvent2(){
        Container c = getContentPane();
        c.setLayout(null);
        ButtonGroup bg = new ButtonGroup();
        male = new JRadioButton("Male");
        c.add(male);
        bg.add(male);
        male.addItemListener(this);

        male.setBounds(50, 50, 100, 20);
        female = new JRadioButton("Female");
        female.setBounds(50,100,100,20);
        c.add(female);
        bg.add(female);
        female.addItemListener(this);

        jTextArea = new JTextArea();
        jTextArea.setBounds(200, 50, 100, 100);
        c.add(jTextArea);






    }


    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == male){
            jTextArea.setText("Male is clicked. ");
        }
        if (e.getSource() == female){
            jTextArea.setText("Female is clicked. ");
        }
    }
}

public class JS23ItemLRadioButton {
    public static void main(String[] args) {
        ItemEvent2 ie = new ItemEvent2();
        ie.setTitle("Item Event 2");
        ie.setBounds(100, 100, 400, 400);
        ie.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ie.setVisible(true);
    }
}
