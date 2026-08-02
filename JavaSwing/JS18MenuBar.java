package JavaSwing;

import javax.swing.*;

public class JS18MenuBar {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(600, 500);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("File");

        JMenuItem i1 = new JMenuItem("New");
        JMenuItem i2 = new JMenuItem("Open");
        JMenuItem i3 = new JMenuItem("Save");
        file.add(i1);
        file.add(i2);
        file.add(i3);
        menuBar.add(file);
        JMenu edit = new JMenu("Edit");
        JMenuItem i4 = new JMenuItem("Undo");
        JMenuItem i5 = new JMenuItem("Redo");
        edit.add(i4);
        edit.add(i5);
        file.add(edit);
        jFrame.setJMenuBar(menuBar);


        jFrame.setVisible(true);
    }
}
