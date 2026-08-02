package JavaSwing;
//37, JPopup Menu


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JS48JPopupMenu extends JFrame implements ActionListener {
    JPopupMenu popupMenu;
    JMenuItem jMenuItem1, jMenuItem2, jMenuItem3;
    JS48JPopupMenu(){
        setSize(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        popupMenu = new JPopupMenu();
        jMenuItem1 = new JMenuItem("Item 1");
        jMenuItem2 = new JMenuItem("Item 2");
        jMenuItem3 = new JMenuItem("Item 3");

        jMenuItem1.addActionListener(this);
        jMenuItem2.addActionListener(this);
        jMenuItem3.addActionListener(this);

        popupMenu.add(jMenuItem1);
        popupMenu.add(jMenuItem2);
        popupMenu.add(jMenuItem3);
        add(popupMenu);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (e.getButton() == MouseEvent.BUTTON1){
                    int x = e.getX();
                    int y = e.getY();
                    popupMenu.show(JS48JPopupMenu.this, x, y);
                }
            }
        });
    }
    @Override
    public void actionPerformed(ActionEvent e) {
         if (e.getSource() == jMenuItem1){
             System.out.println("Item 1 is selected");
         }
         else if (e.getSource() == jMenuItem2){
             System.out.println("Item 2 is selected");
         }
         else if (e.getSource() == jMenuItem3){
             System.out.println("Item 3 is selected");
         }
         else
             System.out.println("Invalid selection");
    }

    public static void main(String[] args) {
          JS48JPopupMenu js48JPopupMenu = new JS48JPopupMenu();

    }

}
