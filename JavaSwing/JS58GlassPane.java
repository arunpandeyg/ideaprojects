package JavaSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

//55, Glass Pane
public class JS58GlassPane extends JFrame {
    public JS58GlassPane(){
        JFrame jFrame = new JFrame("Glass Pane");
        jFrame.setSize(500, 400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);

        JPanel jPanel = new JPanel();
        final JLabel jLabel = new JLabel("Glass Pane");
        JButton jButton = new JButton("Click On");
        JButton jButton1 = new JButton("Show");
        jPanel.add(jLabel);
        jPanel.add(jButton);
        jPanel.add(jButton1);
        jFrame.getContentPane().add(jPanel);
        jFrame.setVisible(true);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jLabel.setVisible(!jLabel.isVisible());
            }
        });
        jFrame.setGlassPane(new JComponent() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(new Color(0,0,0,150));
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        });
        final Container glassPane = (Container) jFrame.getGlassPane();
                glassPane.setLayout(new GridLayout());
                JButton hide = new JButton("Hide");
                glassPane.add(hide);

                glassPane.addMouseListener(new MouseAdapter() {
                });

        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                glassPane.setVisible(true);
            }
        });

        hide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                glassPane.setVisible(false);
            }
        });

    }
    public static void main(String[] args) {
            new JS58GlassPane();
    }
}
