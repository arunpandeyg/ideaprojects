package JavaSwing;
// how to call a jframe from another jframe.


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



class CallJFrame implements ActionListener {
    JFrame jFrame1, jFrame2;
    JTextField   jTextField;
    JLabel jLabel;
    CallJFrame(){
        jFrame1 = new JFrame("Main Frame");
        jFrame1.setSize(500, 400);
        jFrame1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame1.setLocationRelativeTo(null);
        jFrame1.setVisible(true);

        JButton jButton = new JButton("Click");
        jLabel = new JLabel("Message will appear here");
        JPanel jPanel = new JPanel();
        jPanel.add(jButton);
        jPanel.add(jLabel);
        jFrame1.add(jPanel);
        jButton.addActionListener(this);

        jFrame1.validate();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Click")) {
            jFrame1.dispose();
            jFrame2 = new JFrame("Message Frame ");
            jFrame2.setSize(400, 200);
            jFrame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            jFrame2.setLocationRelativeTo(jFrame1);
            jFrame2.setVisible(true);
            jTextField = new JTextField();
            jTextField.setColumns(25);
            JButton jButton2 = new JButton("Submit");
            JPanel jPane2 = new JPanel();
            jPane2.add(jTextField);
            jPane2.add(jButton2);
            jFrame2.add(jPane2);
            jButton2.addActionListener(this);
        } else if (e.getActionCommand().equals("Submit")) {
            String message = jTextField.getText().toString();
            jLabel.setText(message);
            jFrame2.dispose();
            jFrame1.setVisible(true);
        }


    }
}

public class JS49CallJFrameAOJFrame extends JFrame {

    public static void main(String[] args) {
        new CallJFrame();
    }
}