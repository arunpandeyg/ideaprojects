package JavaSwing;
//38, Check box menu bar

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//38, JCheckBoxMenuItem
public class Js49JCheckBoxMenuItems extends JFrame {
    JMenuItem newFile = new JMenuItem("New");
    JMenuItem open = new JMenuItem("Open");
    JMenuItem undo = new JMenuItem("Undo");
    JMenuItem redo = new JMenuItem("Redo");

    JCheckBoxMenuItem checkBoxMenuItem = new JCheckBoxMenuItem("Word Wrap");
    JTextArea jTextArea = new JTextArea("Prime Minister Narendra Modi on Friday arrived in Bengaluru to unveil the 108-feet tall bronze statue of ‘Nadaprabhu’ Kempegowda, credited to be the city’s founder, and inaugurate Terminal 2 of the International Airport, which was built at a cost of around Rs 5,000 crore. He also flagged off two trains, South India’s first Vande Bharat Express, and the Bharat Gaurav Kashi Darshan train.");

    public Js49JCheckBoxMenuItems(){
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        JMenuBar jMenuBar = new JMenuBar();
        add(jMenuBar, BorderLayout.PAGE_START);
        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");
        JMenu format = new JMenu("Format");
        jMenuBar.add(file);
        jMenuBar.add(edit);
        jMenuBar.add(format);
        file.add(newFile);
        file.add(open);
        edit.add(undo);
        edit.add(redo);
        format.add(checkBoxMenuItem);
        add(jTextArea, BorderLayout.CENTER);
        checkBoxMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBoxMenuItem.isSelected()){
                    jTextArea.setLineWrap(true);
                    jTextArea.setWrapStyleWord(true);
                }
                else {
                    jTextArea.setLineWrap(false);
                    jTextArea.setWrapStyleWord(false);

                }
            }
        });

        validate();
    }
    public static void main(String[] args) {
         new Js49JCheckBoxMenuItems();

    }
}
