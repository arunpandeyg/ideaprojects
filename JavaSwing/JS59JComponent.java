package JavaSwing;
//57, JComponent
import javax.swing.*;
import java.awt.*;

public class JS59JComponent extends JComponent {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillRect(10, 10, 200, 200);
    }

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("JComponent");
        jFrame.setSize(600, 500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        JS59JComponent myComponent = new JS59JComponent();
        jFrame.getContentPane().add(myComponent);


    }
}
