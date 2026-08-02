package JavaSwing;
//43. JSlideBar
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class JS54JSlideBar extends JFrame implements ChangeListener  {
    JSlider jSlider;
    JLabel jLabel;
   public JS54JSlideBar(){
       JFrame jFrame = new JFrame();
       jFrame.setTitle("Progress Bar");
       jFrame.setBounds(100, 100, 500, 500);
       jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       jFrame.setLocationRelativeTo(null);
       Container container = jFrame.getContentPane();
       container.setBackground(Color.CYAN);
       container.setLayout(new FlowLayout());
       jSlider = new JSlider();
       container.add(jSlider);
       jSlider.setMinimum(0);
       jSlider.setMaximum(200);
       jSlider.setPaintTicks(true);
       jSlider.setPaintLabels(true);
       jSlider.setMajorTickSpacing(50);
       jSlider.setMinorTickSpacing(5);
       jLabel = new JLabel();
       container.add(jLabel);
       jLabel.setText("The value of slider" + jSlider.getValue());
       jSlider.addChangeListener((ChangeListener) this);
       jSlider.setOrientation(JSlider.VERTICAL);

       jFrame.setVisible(true);

    }

    public static void main(String[] args) {
        new JS54JSlideBar();
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        jLabel.setText("The value of Slider: " + jSlider.getValue());
    }
}
