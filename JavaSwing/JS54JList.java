package JavaSwing;
//51.2, dynamic list creation


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JS54JList extends JFrame {
    JTextField jTextField = new JTextField(15);
    JButton jButton1 = new JButton("Add");
    JButton jButton2 = new JButton("Update");
    JButton jButton3 = new JButton("Delete");
    int updateIndex = 0;
    public JS54JList(){
        setSize(500, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(new GridLayout(1, 2));

        JList<Object> jList = new JList<>();
        JPanel jPanel = new JPanel();
        add(jPanel);
        jPanel.add(new JScrollPane(jList));
        DefaultListModel<Object> defaultListModel = new DefaultListModel<>();
        defaultListModel.addElement("High School");
        defaultListModel.addElement("Inter");
        defaultListModel.addElement("BTech");
        jList.setModel(defaultListModel);
        JPanel jPanel1 = new JPanel();
        add(jPanel1);
        jPanel1.add(jTextField);
        jPanel1.add(jButton1);
        jPanel1.add(jButton2);
        jPanel1.add(jButton3);
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!jTextField.getText().toString().isEmpty()){
                    String input = jTextField.getText().toString();
                    defaultListModel.addElement(input);
                    jTextField.setText(null);
                }
            }
        });
        jList.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (e.getClickCount() == 2){
                    updateIndex = jList.getSelectedIndex();
                    jTextField.setText((String) defaultListModel.get(updateIndex));
                }
            }
        });
        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!jTextField.getText().toString().isEmpty()){
                    String item = jTextField.getText().toString();
                    defaultListModel.set(updateIndex, item);
                    jTextField.setText(null);
                }
            }
        });
        jButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                defaultListModel.remove(jList.getSelectedIndex());
            }
        });


        revalidate();
    }
    public static void main(String[] args) {
        new JS54JList();
    }
}
