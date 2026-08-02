package JavaSwing;
//JScrollPane JScrollBar


import javax.swing.*;
import java.awt.*;

public class JS43JScrollPane {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("JScroll Pane");
        jFrame.setLayout(new FlowLayout());
        JTextArea jTextArea = new JTextArea(10, 15);

        /*JScrollPane jScrollPane = new JScrollPane(
                jTextArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS); */
        JScrollPane jScrollPane = new JScrollPane(
                jTextArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

                    jFrame.add(jScrollPane);


        jFrame.setSize(500, 400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
