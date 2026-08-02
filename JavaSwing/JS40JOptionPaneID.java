package JavaSwing;
//input dialogue
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//AdvanceComponents, JProgressBar, JSpinner, JCheckBoxMenuItem, JOptionPane, JScollPane, JTabbedPane, JTable, JFileChooser, JColorChooser,
//input dialogue
public class JS40JOptionPaneID {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Input dialogue");
        jFrame.setVisible(true);
        jFrame.setSize(450, 500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        jFrame.setLayout(new FlowLayout());
        JButton jButton1 = new JButton("Click On");
        jFrame.add(jButton1);
        /*jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String str = JOptionPane.showInputDialog("Enter your name");
                if (str.length() > 0){
                    System.out.println("The name of user is: " + str);
                }

            }
        });*/
        jButton1.addActionListener(e -> {        //lambda option

            String str = JOptionPane.showInputDialog("Enter your name");
            if (str.length() > 0){
                System.out.println("The name of user is: " + str);
            }

        });


    }
}
