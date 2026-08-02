package JavaSwing;
//how to create, setEditable(boolean), setSelectedIndex(Index), setSelectedItem(String), setFont(Font),
// getSelectedIndex(), getSelectedItem(), addItem(), removeItem(),
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JS15JComboBox {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Combo Box");
        frame.setSize(700, 500);
        frame.setLocationRelativeTo(null); //for centre
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = frame.getContentPane();
        c.setLayout(null);
        String[] valuse = {"A", "B", "C", "D"};

        JComboBox<String> c1 = new JComboBox<>(valuse);
        c1.setBounds(100, 100, 100, 30);
        c.add(c1);
        //c1.setEnabled(true);
        //c1.setSelectedItem("B");
        //c1.setSelectedIndex(3);
        c.setFont(new Font("Arial", Font.PLAIN, 15));


        JButton button = new JButton("Ok");
        button.setBounds(300, 100, 100, 30);
        c.add(button);
        JLabel label = new JLabel("");
        label.setBounds(100, 300, 100, 30);
        c.add(label);
        c1.addItem("E");  // to add new item
        c1.removeItem("C"); // to remove


        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //String item = (String) c1.getSelectedItem();   //item
                String item = String.valueOf(c1.getSelectedIndex()); //index
                label.setText(item);

            }
        });




        frame.setVisible(true);
    }
}
