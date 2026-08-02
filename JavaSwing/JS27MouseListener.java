package JavaSwing;
//Mouse listener, void mouseEntered(), voidMouseExited(), void mousePressed(), void mouseClicked(),
//void mouseReleased(), addMouseListener().

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
class MListener extends JFrame implements MouseListener{
    JLabel jLabel;
    JTextArea jTextArea;
    MListener(){
        Container container = getContentPane();
        container.setLayout(null);
        jLabel = new JLabel("My Label");
        jLabel.setFont(new Font("Arial", Font.BOLD, 18));
        jLabel.setBounds(50, 100, 100, 30);
        container.add(jLabel);
        jLabel.addMouseListener(this);

        jTextArea = new JTextArea();
        jTextArea.setBounds(200, 50, 300, 300);
        container.add(jTextArea);
        jTextArea.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        jTextArea.setText( jTextArea.getText() + "\n" + " Mouse is clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        jTextArea.setText( jTextArea.getText() + "\n" + " Mouse is Pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        jTextArea.setText( jTextArea.getText() + "\n" + " Mouse is Released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        jTextArea.setText( jTextArea.getText() + "\n" + " Mouse is Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        jTextArea.setText( jTextArea.getText() + "\n" + " Mouse is Exited");
    }
}

public class JS27MouseListener {
    public static void main(String[] args) {

            MListener mListener = new MListener();
            mListener.setTitle("Mouse Listener");
            mListener.setBounds(100, 100, 700, 500);
            mListener.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            mListener.setVisible(true);

    }
}
