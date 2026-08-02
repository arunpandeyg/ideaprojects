package JavaSwing;
//35,0;, JTable.
import javax.swing.*;
import java.awt.*;

public class JS46JTable {
    String[][] data = {
            {"001", "Ravi", "21"}, {"002", "Mukul", "22", }, {"003", "Raju", "23"}
    };
    String [] columnNames = {"Roll No", "Name", "Age"};
   public JS46JTable(){
       JTable jTable = new JTable(data, columnNames);
       jTable.setBackground(Color.cyan);
       JFrame jFrame = new JFrame("JTable Pane");
       jFrame.add(new JScrollPane(jTable));




       jFrame.setSize(500, 500);
       jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       jFrame.setBackground(Color.GREEN);
       jFrame.setVisible(true);
    }
    public static void main(String[] args) {
        new JS46JTable();
    }
}
