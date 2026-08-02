package JavaSwing;
//36, JProgressBarr


import javax.swing.*;
import java.awt.*;

public class JS53JProgressBar extends JFrame {
    JS53JProgressBar(){
        JFrame jFrame = new JFrame();
        jFrame.setTitle("Progress Bar");
        jFrame.setBounds(100, 100, 500, 500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        Container container = jFrame.getContentPane();
        container.setBackground(Color.CYAN);
        container.setLayout(new FlowLayout());
        jFrame.setVisible(true);
        JProgressBar jProgressBar = new JProgressBar(0, 100);
        jFrame.add(jProgressBar);
        jProgressBar.setStringPainted(true);
        //jProgressBar.setOrientation(SwingConstants.VERTICAL); // vertical progress bar
        int i = 0;
        while (i <= 100){
            if (i >= 0 && i <= 50){
                jProgressBar.setString("Processing..");
            }
            else if (i > 50 && i <= 70){
                jProgressBar.setString("Wait for some time..");
            }
            else if (i > 70 && i <= 90){
                jProgressBar.setString("About to complete..");
            }
            else if (i == 100 ){
                jProgressBar.setString("Finished..");
            }
            jProgressBar.setValue(i);
            try {
                Thread.sleep(1000);
            }catch (Exception e){}
            i = i + 10;
        }

    }
    public static void main(String[] args) {
        new  JS53JProgressBar();
    }
}
