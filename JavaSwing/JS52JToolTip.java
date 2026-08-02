package JavaSwing;
//42, JToolTip


import javax.swing.*;

public class JS52JToolTip extends JFrame {
   public JS52JToolTip(){
       setLayout(null);
       JLabel jLabel = new JLabel("Password");
       jLabel.setBounds(50, 100, 50, 30);
       add(jLabel);

       JPasswordField jPasswordField = new JPasswordField();
       jPasswordField.setBounds(140, 100, 100, 30);
       add(jPasswordField);

       String str = "<html> "
               + "<div bgColour- '#800080' colour- '#ffffff'>"
               + "Enter Your Password<br/"
               + "Password should be at least 8 characters long"
               + "</div>"
               + "</html>";

       jPasswordField.setToolTipText(str);


        setSize(400, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);


        validate();
    }

    public static void main(String[] args) {
        new JS52JToolTip();

    }
}
