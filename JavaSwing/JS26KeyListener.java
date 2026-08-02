package JavaSwing;
// key listener, void keyPressed(), void keyTyped(), void keyReleased(), addKeyListener().


import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

class KeyListener extends JFrame implements java.awt.event.KeyListener {
    JTextArea jTextArea;
    public KeyListener (){
        Container container = getContentPane();
        container.setLayout(null);


        jTextArea = new JTextArea();
        jTextArea.setBounds(10, 10, 370, 370);
        container.add(jTextArea);
        jTextArea.addKeyListener(this);

    }

    @Override
    public void keyTyped(KeyEvent e) {
        jTextArea. setText(jTextArea.getText() + "\n" + " Key is Typed  " + e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        jTextArea.setText(jTextArea.getText() + "\n" + " Key is Pressed  " + e.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        jTextArea.setText(jTextArea.getText() + "\n" + " Key is Released  " + e.getKeyChar());
    }
}

public class JS26KeyListener {
    public static void main(String[] args) {
        KeyListener keyListener = new KeyListener();
        keyListener.setTitle("Key Listener");
        keyListener.setBounds(100, 100, 400, 500);
        keyListener.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        keyListener.setVisible(true);
    }
}
