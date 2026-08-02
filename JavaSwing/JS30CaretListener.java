package JavaSwing;
//20 CaretListener, void caretUpdate(), addCaretListener().
import javax.swing.*;
import javax.swing.event.CaretEvent;
import java.awt.*;


class CaretListener extends JFrame implements javax.swing.event.CaretListener {
    JTextField jTextField;
    JTextArea jTextArea;

    CaretListener() {
        Container container = getContentPane();
        container.setLayout(null);

        jTextField = new JTextField("Text Field");
        jTextField.setBounds(50, 100, 100, 30);
        container.add(jTextField);
        jTextField.addCaretListener( this);


        jTextArea = new JTextArea("Text Area");
        jTextArea.setBounds(200, 50, 300, 300);
        container.add(jTextArea);
    }

    @Override
    public void caretUpdate(CaretEvent e) {
        jTextArea.setText(jTextArea.getText() + "\n" + "Caret Update" + e.getDot() + " : " + e.getMark());
    }
}

public class JS30CaretListener {
    public static void main(String[] args) {
        CaretListener caretListener = new CaretListener();
        caretListener.setTitle("Caret Listener");
        caretListener.setBounds(100, 100, 700, 500);
        caretListener.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        caretListener.setVisible(true);
    }
}
