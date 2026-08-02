package JavaSwing;
//18, Mouse motion listener, void mouseMoved(), void mouseDragged(), addMouseMotionListener().
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

import java.awt.event.MouseMotionListener;

class MMListener extends JFrame implements MouseMotionListener {

    JLabel jLabel;
    JTextArea jTextArea;
    MMListener(){
        Container container = getContentPane();
        container.setLayout(null);
        jLabel = new JLabel("My Label");
        jLabel.setFont(new Font("Arial", Font.BOLD, 18));
        jLabel.setBounds(50, 100, 100, 30);
        container.add(jLabel);
        jLabel.addMouseMotionListener(this);


        jTextArea = new JTextArea();
        jTextArea.setBounds(200, 50, 300, 300);
        container.add(jTextArea);
        //jTextArea.addMouseMotionListener(this);
    }


    @Override
    public void mouseDragged(MouseEvent e) {
        jTextArea.setText(jTextArea.getText() + "\n" + "Mouse Dragged");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        jTextArea.setText(jTextArea.getText() + "\n" + "Mouse Moved");
    }
}

public class JS28MouseMotionListener {
    public static void main(String[] args) {
        MMListener mListener = new MMListener();
        mListener.setTitle("Mouse Motion Listener");
        mListener.setBounds(100, 100, 700, 500);
        mListener.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mListener.setVisible(true);
    }
}
