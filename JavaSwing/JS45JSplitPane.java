package JavaSwing;
//40, JSplitPane


import javax.swing.*;
import java.awt.*;

public class JS45JSplitPane extends JFrame {
    public JS45JSplitPane(){
        setTitle("JSplit Pane");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setBackground(Color.cyan);
        setVisible(true);
        setLocationRelativeTo(null);
        JButton jButton = new JButton("Left");
        JButton jButton1 = new JButton("Right");
        JSplitPane jSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
        jSplitPane.setTopComponent(jButton);
        jSplitPane.setBottomComponent(jButton1);
        jSplitPane.setDividerSize(5);
        jSplitPane.setDividerLocation(100);
        jSplitPane.setOneTouchExpandable(true);
        add(jSplitPane);
        validate();
    }
    public static void main(String[] args) {
      JS45JSplitPane js45JSplitPane = new JS45JSplitPane();

    }

}
