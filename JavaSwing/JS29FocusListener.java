package JavaSwing;
//19 Focus Listener, void focusGained(), void focusLost(),  addFocusListener(),
import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;


class FocusListener extends JFrame implements java.awt.event.FocusListener {
    JTextField jTextField;
    JTextArea jTextArea;
    FocusListener(){
        Container container = getContentPane();
        container.setLayout(null);

        jTextField = new JTextField("Text Field");
        jTextField.setBounds(50, 100, 100, 30);
        container.add(jTextField);
        jTextField.addFocusListener(this);


        jTextArea = new JTextArea("Text Area");
        jTextArea.setBounds(200, 50, 300, 300);
        container.add(jTextArea);
    }

    @Override
    public void focusGained(FocusEvent e) {
         jTextArea.setText(jTextArea.getText() + "\n" + "Focus Gained");
    }

    @Override
    public void focusLost(FocusEvent e) {
        jTextArea.setText(jTextArea.getText() + "\n" + "Focus Lost");
    }
}
public class JS29FocusListener {
    public static void main(String[] args) {
        FocusListener focusListener = new FocusListener();
        focusListener.setTitle("Focus Listener");
        focusListener.setBounds(100, 100, 700, 500);
        focusListener.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        focusListener.setVisible(true);
    }
}
