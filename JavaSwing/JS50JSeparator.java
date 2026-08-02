package JavaSwing;
//39 JSeparator, used to implement divider line, horizontal and vertical both

import javax.swing.*;
import java.awt.*;

public class JS50JSeparator extends JFrame {
    //gridlayout menu
  public JS50JSeparator(){
      setSize(400, 500);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setBackground(Color.cyan);
      setVisible(true);
      setLocationRelativeTo(null);

      JPanel jPanel = new JPanel();
      jPanel.setLayout(new GridLayout(1, 0));

      jPanel.add(new JLabel("  First"));
      jPanel.add(new JSeparator(SwingConstants.VERTICAL));
      jPanel.add(new JLabel("  Second"));
      add(jPanel);
      JMenuBar jMenuBar = new JMenuBar();
      add(jMenuBar, BorderLayout.PAGE_START);
      JMenu file = new JMenu("File");
      JMenu edit = new JMenu("Edit");
      jMenuBar.add(file);
      jMenuBar.add(edit);
      JMenuItem undo = new JMenuItem("Undo");
      JMenuItem redo = new JMenuItem("Redo");
      JMenuItem cut = new JMenuItem("Cut");
      JMenuItem copy = new JMenuItem("Copy");
      JMenuItem paste = new JMenuItem("Paste");
      JMenuItem find = new JMenuItem("Find");
      JMenuItem findNext = new JMenuItem("Find Next");
      JMenuItem replace = new JMenuItem("Replace");
      edit.add(undo);
      edit.add(redo);
      edit.addSeparator();
      edit.add(cut);
      edit.add(copy);
      edit.add(paste);
      edit.addSeparator();
      edit.add(find);
      edit.add(findNext);
      edit.add(replace);


      validate();
    }

    public static void main(String[] args) {
        new JS50JSeparator();

    }
}
