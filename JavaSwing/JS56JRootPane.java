package JavaSwing;

import javax.swing.*;
import java.awt.*;

//53,
public class JS56JRootPane extends JFrame {
    public JS56JRootPane(){
        JRootPane jRootPane = this.getRootPane();
        JButton jButton = new JButton("Press");
        JMenuBar jMenuBar = new JMenuBar();
        JMenu jMenu = new JMenu("File");
        jMenu.add("New file");
        jMenu.add("Open file");
        jMenu.add("Save file");
        jMenu.add("Close file");
        jMenuBar.add(jMenu);
        jRootPane.getContentPane().add(jButton);
        jRootPane.setJMenuBar(jMenuBar);

        revalidate();
    }
    public static void main(String[] args) {
        JS56JRootPane js56JRootPane = new JS56JRootPane();
        js56JRootPane.setSize(600, 400);
        js56JRootPane.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        js56JRootPane.setVisible(true);
    }
}
