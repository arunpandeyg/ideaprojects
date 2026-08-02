package JavaSwing;
//50.1, JList(), JList(object[]items), JList(Vector v), JList(ListModel m)


import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JS53JList extends JFrame {
    String[] items = {"item1", "item2", "item3", "item4", "item5",
            "item6", "item7", "item8", "item9", "item10", "item11"};
    JLabel jLabel = new JLabel();

    JS53JList(){
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        JList<String> jList = new JList<>(items);
        jList.setVisibleRowCount(4);
        JPanel jPanel = new JPanel();
        jPanel.add(new JScrollPane(jList));
        jPanel.add(jLabel);
        add(jPanel);
        jList.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (e.getClickCount() == 2){
                    int index = jList.getSelectedIndex();
                    String item = (String) jList.getSelectedValue();
                    jLabel.setText("Selected Item is: " + item + ", and selected index: " + index);
                }
            }
        });


        revalidate();
    }
    public static void main(String[] args) {

        new JS53JList();
    }
}
