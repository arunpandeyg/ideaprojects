package JavaSwing;
//54, frame content layer (-30000), default layer(0), palette layer (100), Modal layer(200),
// popup layer (300), Drag layer(400) layeredPane.add(component,
// layeredPane.DEFAULT_LAYER);, layeredPane.add(component, newInteger(10));
import javax.swing.*;
import java.awt.*;

public class JS57JLayeredPane extends JFrame {
    public JS57JLayeredPane(){
        JLayeredPane jLayeredPane = this.getLayeredPane();

        JButton jButton1 = new JButton("Red");
        jButton1.setBackground(Color.RED);
        jButton1.setBounds(20, 20, 150, 150);

        JButton jButton2 = new JButton("Green");
        jButton2.setBackground(Color.RED);
        jButton2.setBounds(40, 40, 150, 150);

        JButton jButton3 = new JButton("Orange");
        jButton3.setBackground(Color.RED);
        jButton3.setBounds(60, 60, 150, 150);

        jLayeredPane.add(jButton1, new Integer(10));
        jLayeredPane.add(jButton2, new Integer(20));
        jLayeredPane.add(jButton3, new Integer(30));
    }
    public static void main(String[] args) {
        JS57JLayeredPane layeredPane = new  JS57JLayeredPane();
        layeredPane.setSize(600, 500);
        layeredPane.setLocationRelativeTo(null);
        layeredPane.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        layeredPane.setVisible(true);

    }
}
