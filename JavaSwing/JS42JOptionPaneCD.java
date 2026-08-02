package JavaSwing;
//show confirmation dialogue


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JS42JOptionPaneCD {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Confirmation dialogue");
        jFrame.setVisible(true);
        jFrame.setSize(450, 500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(new FlowLayout());

        JButton jButton = new JButton("Click Me");
        jFrame.add(jButton);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               int sel = JOptionPane.showConfirmDialog(
                        jFrame, "Hello How are you", "Confirm", JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
               if (sel == JOptionPane.YES_OPTION){
                   System.out.println("Yes option is selected");
                   //System.exit, to close the program also can be sent in command and other some tasks also can be performed.
               }
                else if (sel == JOptionPane.NO_OPTION){
                    System.out.println("No option is selected");
                }
                else if (sel == JOptionPane.CANCEL_OPTION){
                    System.out.println("Cancel option is selected");
                }
            }
        });
    }
}
