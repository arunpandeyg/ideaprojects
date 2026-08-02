package JavaSwing;
//how to create how to validate


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

class MyLoginFrame extends JFrame implements ActionListener {
    Container c = getContentPane();
    JLabel label1, label2;
    JTextField user;
    JPasswordField pass;
    JButton btn;
    MyLoginFrame(){
        setTitle("Login Form");
        setSize(400, 300);
        setLocation(50, 50);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
                                                               //
        c.setLayout(null);
        label1 = new JLabel("Username");
        label2 = new JLabel("Password");
        label1.setBounds(10, 50, 120, 20);
        label2.setBounds(10, 100, 120, 20);
        c.add(label1);
        c.add(label2);
        user = new JTextField();
        user.setBounds(120, 50, 120, 20);
        c.add(user);
        pass = new JPasswordField();
        pass.setBounds(120, 100, 120, 20);
        c.add(pass);
        btn = new JButton("Login");
        btn.setBounds(120, 150, 120, 20);
        c.add(btn);
        btn.addActionListener(this);


        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Username" + user.getText());
        System.out.println("Password" + Arrays.toString(pass.getPassword())); //getText is deprecated
    }
}
public class JS10LoginForm {
    public static void main(String[] args) {
         MyLoginFrame mlf = new MyLoginFrame();


    }
}

