package JavaSwing;
//26, just like flow layout, Grid layout also sets the components left- or right in a flow. 2, in grid layout all
// the available spaces is consumed by the components. 3, Grid layout can be divided into the form of rows and
// columns. 4, in grid layout all the components have the same size.


import javax.swing.*;
import java.awt.*;

public class JS35Gridlayout extends JFrame {
    JButton jButton1 = new JButton("Button1");
    JButton jButton2 = new JButton("Button2");
    JButton jButton3 = new JButton("Button3");
    JButton jButton4 = new JButton("Button4");
    JButton jButton5 = new JButton("Button5");
    JButton jButton6 = new JButton("Button6");
    public void GridLayout(){
        setTitle("Grid Layout");
        setBounds(100, 200, 500, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.add(jButton1); //indexing by passing index or adding in required places
        container.add(jButton2);
        container.add(jButton3);
        container.add(jButton4);
        container.add(jButton5);
        container.add(jButton6);
        GridLayout gridLayout = new GridLayout(3,2);
        //gridLayout.setVgap(20);
        //gridLayout.setVgap(20);
        container.setLayout(gridLayout);
        //rows and columns
    }


    public static void main(String[] args) {
        JS35Gridlayout gridlayout = new JS35Gridlayout();
        gridlayout.GridLayout();
    }

}
