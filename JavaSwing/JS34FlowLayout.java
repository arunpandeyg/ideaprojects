package JavaSwing;
//25, set Alignment in flow layout, setVgap(), setHgap(), indexing in flow lay out.
//1, Flow layout is the default layout for JPanel. 2, It sets the components as its preferred size in java. 3, It
// also sets the width of the component acc to its content. 4, If width of JFrame is less, than it shifts the
// extra components to the next row. 5, if width of JFrame is more, than it aligns the components to the CENTER.
import javax.swing.*;
import java.awt.*;

public class JS34FlowLayout extends JFrame {
    JButton jButton1 = new JButton("Button1");
    JButton jButton2 = new JButton("Button2");
    JButton jButton3 = new JButton("Button3");
    JButton jButton4 = new JButton("Button4");
    JButton jButton5 = new JButton("Button5");
    public void SampleLayout(){
        setTitle("Flow Layout ");
        setBounds(100, 200, 500, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.add(jButton1);
        container.add(jButton2);
        container.add(jButton3);
        container.add(jButton4); //passing index button can be moved from other places
        container.add(jButton5);
                                                                //HV gap also can be passed
        FlowLayout flowLayout = new FlowLayout(FlowLayout.LEFT,10,10);//for align left right or center pass into constructor
        //flowLayout.setHgap(10);
        //flowLayout.setHgap(10);
        container.setLayout(flowLayout);

    }
    public static void main(String[] args) {
       JS34FlowLayout flowLayout = new JS34FlowLayout();
       flowLayout.SampleLayout();

    }
}
