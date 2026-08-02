package JavaSwing;
//item listener on check box
import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class ItemEvent3 extends JFrame implements ItemListener {
    JCheckBox checkBox1;
    JCheckBox checkBox2;
    JCheckBox checkBox3;
    JCheckBox checkBox4;
    JTextArea jTextArea;
    public ItemEvent3(){
        Container c = getContentPane();
        c.setLayout(null);

        checkBox1 = new JCheckBox("10th");
        checkBox1.setBounds(50, 50,100, 30);
        c.add(checkBox1);
        checkBox1.addItemListener(this);

        checkBox2 = new JCheckBox("12th");
        checkBox2.setBounds(50, 70,100, 30);
        c.add(checkBox2);
        checkBox2.addItemListener(this);

        checkBox3 = new JCheckBox("Graduate");
        checkBox3.setBounds(50, 90,100, 30);
        c.add(checkBox3);
        checkBox3.addItemListener(this);

        checkBox4 = new JCheckBox("Post Graduate");
        checkBox4.setBounds(50, 110,100, 30);
        c.add(checkBox4);
        checkBox4.addItemListener(this);

        jTextArea = new JTextArea();
        jTextArea.setBounds(200, 50, 100, 100);
        c.add(jTextArea);



    }


    @Override
    public void itemStateChanged(ItemEvent e) {
        if (checkBox1.isSelected()){
            jTextArea.setText("10th");
        }
        if (checkBox2.isSelected()){
            //jTextArea.setText("12th");
            jTextArea.setText(jTextArea.getText() + "\n" + "12th");
        }
        if (checkBox3.isSelected()){
            //jTextArea.setText("Graduate");
            jTextArea.setText(jTextArea.getText() + "\n" + "Graduate");
        }
        if (checkBox4.isSelected()){
            //jTextArea.setText("Post Graduate");
            jTextArea.setText(jTextArea.getText() + "\n" + "Post Graduate");
        }
    }
}

public class JS24ItemLJCheckBox {
    public static void main(String[] args) {
        ItemEvent3 ie = new ItemEvent3();
        ie.setTitle("Item Event 3");
        ie.setBounds(100, 100, 400, 600);
        ie.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ie.setVisible(true);
    }
}
