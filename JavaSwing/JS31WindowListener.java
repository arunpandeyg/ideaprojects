package JavaSwing;
//something missing in this program
//21 void windowOpened(), void windowClosing(), void windowClosed(), void windowIconified(),
// void windowDeiconified(), void windowActivated(), void windowDeactivated(), addWindowListener().
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;

class WindowListener extends JFrame implements java.awt.event.WindowListener {
    JTextField jTextField;
    JTextArea jTextArea;

    WindowListener() {
       /* Container container = getContentPane();
        container.setLayout(null);

        jTextField = new JTextField("Text Field");
        jTextField.setBounds(50, 100, 100, 30);
        container.add(jTextField);
        //jTextField.addWindowListener( this);*/
        this.addWindowListener(this);



       /* jTextArea = new JTextArea("Text Area");
        jTextArea.setBounds(200, 50, 300, 300);
        container.add(jTextArea);*/
    }


        //jTextArea.setText(jTextArea.getText() + "\n" + "Window Update" + e.getDot() + " : " + e.getMark());


    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Window Opened");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Window Closing");
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Window Closed");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Window Iconified");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Window Deiconified");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Window Activated");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Window Deactivated");
    }
}

public class JS31WindowListener {
    public static void main(String[] args) {
        WindowListener windowListener = new WindowListener();
        windowListener.setTitle("Window Listener Events");
        windowListener.setBounds(100, 100, 500, 500);
        windowListener.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        windowListener.setVisible(true);
    }
}
