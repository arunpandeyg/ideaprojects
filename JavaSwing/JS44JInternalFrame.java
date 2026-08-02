package JavaSwing;
//44, internal frame


import javax.swing.*;
import java.awt.*;

public class JS44JInternalFrame extends JFrame {
    JS44JInternalFrame (){
        setLayout(null);
        JInternalFrame jInternalFrame = new JInternalFrame(
                "Internal Frame", true, true, true, true);
        intFrame(jInternalFrame);
        add(jInternalFrame);

        setSize(700, 500);
        setTitle("Internal Frame");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);


    }
    public void intFrame(JInternalFrame jInternalFrame){
        jInternalFrame.setSize(300, 200);
        jInternalFrame.setDefaultCloseOperation(JInternalFrame.EXIT_ON_CLOSE);
        jInternalFrame.setLocation(50, 50);
        jInternalFrame.setVisible(true);
        jInternalFrame.setLayout(new FlowLayout());
        jInternalFrame.add(new JButton("In Frame"));


    }

    public static void main(String[] args) {
       new  JS44JInternalFrame();

    }

}
