package JavaSwing;
//29 Card layout, methods . first(), last(), next(), previous(), show().


import javax.swing.*;
import java.awt.*;

public class JS38CardLayout {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setTitle("Card Layout");
        jFrame.setBounds(100, 50, 300, 400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = jFrame.getContentPane();
        container.setBackground(Color.CYAN);
        jFrame.setVisible(true);
        CardLayout cardLayout = new CardLayout();

        container.setLayout(cardLayout);

        JButton jButton1 = new JButton("Page1");
        JButton jButton2 = new JButton("Page2");
        JButton jButton3 = new JButton("Page3");
        JButton jButton4 = new JButton("Page4");
        container.add(jButton1, "1");
        container.add(jButton2, "2");
        container.add(jButton3, "3");
        container.add(jButton4, "4");
        cardLayout.next(container);
        cardLayout.previous(container);
        cardLayout.first(container);
        cardLayout.last(container);
        cardLayout.show(container, "3");
    }
}
