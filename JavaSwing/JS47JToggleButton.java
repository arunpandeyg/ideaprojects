package JavaSwing;
//47, JToggleButton,
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JS47JToggleButton extends JFrame implements ActionListener {
    JToggleButton jToggleButton;
    Color defaultColor;
    Container container;
    public JS47JToggleButton(){
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        container = getContentPane();
        container.setLayout(null);
        container.setBackground(Color.CYAN);

        defaultColor = container.getBackground();
        jToggleButton = new JToggleButton("On/Off");
        jToggleButton.setBounds(200, 200, 100, 50);
        container.add(jToggleButton);
        jToggleButton.addActionListener(this);




        setVisible(true);
    }
    public static void main(String[] args) {
        new JS47JToggleButton();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (jToggleButton.isSelected()){
            container.setBackground(Color.ORANGE);
            jToggleButton.setText("On");

        }
        else {
            container.setBackground(defaultColor);
            jToggleButton.setText("Off");
        }
    }
}