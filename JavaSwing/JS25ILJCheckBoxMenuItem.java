package JavaSwing;
//How to add item listener on a JCheck box menu item


import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class ItemEvent4 extends JFrame implements ItemListener {
   JMenuBar jMenuBar;
   JMenu jMenu;
   JCheckBoxMenuItem jCheckBoxMenuItem;
    JTextArea jTextArea;

    public ItemEvent4() {
        Container container = getContentPane();
        container.setLayout(null);

        jMenuBar = new JMenuBar();
        jMenu = new JMenu("File");

        jCheckBoxMenuItem = new JCheckBoxMenuItem("Print");
        jMenu.add(jCheckBoxMenuItem);
        jMenuBar.add(jMenu);
        this.setJMenuBar(jMenuBar);
        jCheckBoxMenuItem.addItemListener(this);


        jTextArea = new JTextArea();
        jTextArea.setBounds(200, 50, 100, 100);
        container.add(jTextArea);


    }


    @Override
    public void itemStateChanged(ItemEvent e) {
        if (jCheckBoxMenuItem.isSelected() ){
            jTextArea.setText("Print is On");
        }
        else {
            jTextArea.setText("Print is Off");
        }
    }
}


public class JS25ILJCheckBoxMenuItem {
    public static void main(String[] args) {
        ItemEvent4 ie = new ItemEvent4();
        ie.setTitle("Item Event 4");
        ie.setBounds(100, 100, 400, 500);
        ie.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ie.setVisible(true);
    }
}
