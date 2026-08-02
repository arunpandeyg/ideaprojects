package JavaSwing;
//45, JDesktopPane

import javax.swing.*;
import java.awt.*;

public class JS45JDesktopPane extends JFrame {
    JDesktopPane jDesktopPane;
    JS45JDesktopPane(){
        jDesktopPane = new JDesktopPane();
        display(jDesktopPane);
        add(jDesktopPane, BorderLayout.CENTER);

        setSize(700, 500);
        setTitle("Desktop Pane");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    private void display(JDesktopPane jDesktopPane){
        //throw new UnsupportedOperationException("Not supported yet");
        int numFrames = 3, x = 30, y = 30;
        for (int i = 0; i < numFrames; i++){
            JInternalFrame jInternalFrame = new JInternalFrame("Internal Frame"
                    + (i + 1), true, true, true, true);
            jInternalFrame.setBounds(x, y, 250, 100);
            jInternalFrame.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
            jInternalFrame.add(new JLabel("I Love Java"));
            jInternalFrame.setVisible(true);
            jDesktopPane.add(jInternalFrame);
            y += 100;

        }
    }
    public static void main(String[] args) {
        new JS45JDesktopPane();
    }
}
