package JavaSwing;
//Message dialogue


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JS41JOptionPaneMD {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Message dialogue");
        jFrame.setVisible(true);
        jFrame.setSize(450, 500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(new FlowLayout());

        /*JButton jButton1 = new JButton("Plain");
        jFrame.add(jButton1);
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(jFrame, "Hello there it's a plain message", "Message",
                        JOptionPane.PLAIN_MESSAGE);
            }
        });
        JButton jButton2 = new JButton("Information");
        jFrame.add(jButton2);
        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(jFrame, "Hello there it's a Information message", "Information",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });
        JButton jButton3 = new JButton("Question");
        jFrame.add(jButton3);
        jButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(jFrame, "Hello there it's a Question message", "Question",
                        JOptionPane.QUESTION_MESSAGE);
            }
        });
        JButton jButton4 = new JButton("Error");
        jFrame.add(jButton4);
        jButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(jFrame, "Hello there it's a Error message", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        });
        JButton jButton5 = new JButton("Warning");
        jFrame.add(jButton5);
        jButton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(jFrame, "Hello there it's a Warning message", "Warning",
                        JOptionPane.WARNING_MESSAGE);
            }
        }); */
        JButton jButton1 = new JButton("Plain");
        jFrame.add(jButton1);
        jButton1.addActionListener(e -> JOptionPane.showMessageDialog(jFrame, "Hello there it's a plain message", "Message",
                JOptionPane.PLAIN_MESSAGE));
        JButton jButton2 = new JButton("Information");
        jFrame.add(jButton2);
        jButton2.addActionListener(e -> JOptionPane.showMessageDialog(jFrame, "Hello there it's a Information message", "Information",
                JOptionPane.INFORMATION_MESSAGE));
        JButton jButton3 = new JButton("Question");
        jFrame.add(jButton3);
        jButton3.addActionListener(e -> JOptionPane.showMessageDialog(jFrame, "Hello there it's a Question message", "Question",
                JOptionPane.QUESTION_MESSAGE));
        JButton jButton4 = new JButton("Error");
        jFrame.add(jButton4);
        jButton4.addActionListener(e -> JOptionPane.showMessageDialog(jFrame, "Hello there it's a Error message", "Error",
                JOptionPane.ERROR_MESSAGE));
        JButton jButton5 = new JButton("Warning");
        jFrame.add(jButton5);
        jButton5.addActionListener(e -> JOptionPane.showMessageDialog(jFrame, "Hello there it's a Warning message", "Warning",
                JOptionPane.WARNING_MESSAGE));
    }
}
