package JavaSwing;
//35, JTable methods  // problem in this program can't update and delete

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class MyTable extends JFrame {
    JTable jTable;
    JTextField jTextField1, jTextField2, jTextField3;
    JButton jButton1, jButton2, jButton3;
    String[][] data = {{"001", "Ravi", "21"}, {"002", "Mukul", "22", }, {"003", "Raju", "23"}};
    String [] columnNames = {"Roll No", "Name", "Age"};
    DefaultTableModel defaultTableModel = new DefaultTableModel(data, columnNames);
    MyTable(){
        setSize(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        jTable = new JTable(defaultTableModel);
        setLayout(new GridLayout(3,1));

        JPanel jPanel = new JPanel();
        add(new JScrollPane(jTable));
        add(new JPanel());
        add(jPanel);

        jTextField1 = new JTextField();
        jTextField2 = new JTextField();
        jTextField3 = new JTextField();

        jButton1 = new JButton("Add");
        jButton2 = new JButton("Update");
        jButton3 = new JButton("Delete");

        jPanel.setLayout(new GridLayout(3, 3));
        jPanel.add(new JLabel("Roll No"));
        jPanel.add(jTextField1);
        jPanel.add(jButton1);

        jPanel.add(new JLabel("Names"));
        jPanel.add(jTextField2);
        jPanel.add(jButton2);

        jPanel.add(new JLabel("Age"));
        jPanel.add(jTextField3);
        jPanel.add(jButton3);
//add data items
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jTextField1.getText().toString().isEmpty()
                        || jTextField2.getText().toString().isEmpty()
                        || jTextField3.getText().toString().isEmpty()){
                    JOptionPane.showMessageDialog(null,
                            "Please fill all the fields", "Error", JOptionPane.WARNING_MESSAGE);

                }
                else {

                    int rollNo = Integer.parseInt(jTextField1.getText().toString());
                    String name = jTextField2.getText().toString();
                    int age = Integer.parseInt(jTextField3.getText().toString());
                    Object[] newRow = {rollNo, name, age};
                    defaultTableModel.addRow(newRow);
                    jTextField1.setText(null);
                    jTextField2.setText(null);
                    jTextField3.setText(null);
                }
            }
        });
         //update
        jTable.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                int rowIndex = jTable.getSelectedRow();

                int rollNo = (int) defaultTableModel.getValueAt( rowIndex,0);
                String name = (String) defaultTableModel.getValueAt(rowIndex, 1);
                int age = (int) defaultTableModel.getValueAt(rowIndex, 2);
                jTextField1.setText(String.valueOf(rollNo));
                jTextField2.setText(name);
                jTextField3.setText(String.valueOf(age));
            }
        });

        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jTextField1.getText().toString().isEmpty() || jTextField2.getText().toString().isEmpty() || jTextField3.getText().toString().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Please fill all the fields", "Error", JOptionPane.WARNING_MESSAGE);

                }
                else {

                    int rollNo = Integer.parseInt(jTextField1.getText().toString());
                    String name = jTextField2.getText().toString();
                    int age = Integer.parseInt(jTextField3.getText().toString());

                    int row = jTable.getSelectedRow();
                    defaultTableModel.setValueAt(rollNo, row, 0);
                    defaultTableModel.setValueAt(name, row, 1);
                    defaultTableModel.setValueAt(age, row, 2);

                    jTextField1.setText(null);
                    jTextField2.setText(null);
                    jTextField3.setText(null);
                }
            }
        });
        //delete
        jTextField3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jTable.getSelectedRow() == -1){
                    JOptionPane.showMessageDialog(null, "Please select a row", "Error", JOptionPane.WARNING_MESSAGE);

                }
                int selection = JOptionPane.showConfirmDialog(null, "do you want to delete this row", "Confirm", JOptionPane.YES_NO_CANCEL_OPTION);
                if (selection == JOptionPane.YES_OPTION) {
                    defaultTableModel.removeRow(jTable.getSelectedRow());
                }
            }
        });
        //no multiple selection
        jTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        validate();
    }
}
public class JS47JTable {
    public static void main(String[] args) {
         new MyTable();
    }
}

