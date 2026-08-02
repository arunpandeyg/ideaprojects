package JavaSwing;
//item listener JComboBox


import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Objects;

class ItemEvent1 extends JFrame implements ItemListener {
    JComboBox combo;
    JTextArea jTextArea;

    public ItemEvent1(){
        Container c = getContentPane();
        c.setLayout(null);

        String[] values = {"A", "B", "C", "D"};
        combo = new JComboBox<>(values);
        combo.setBounds(50, 50, 100, 30);
        c.add(combo);
        combo.addItemListener(this);
        jTextArea = new JTextArea();
        jTextArea.setBounds(200, 50, 100, 100);
        c.add(jTextArea);


    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        //String str = combo.getSelectedItem().toString();
        String str = Objects.requireNonNull(combo.getSelectedItem()).toString();
        jTextArea.setText(str);
    }
}
public class JS22ItemListener {
    public static void main(String[] args) {
        ItemEvent1 ie = new ItemEvent1();
        ie.setTitle("Item Event");
        ie.setBounds(100, 100, 400, 400);
        ie.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ie.setVisible(true);
    }
}
