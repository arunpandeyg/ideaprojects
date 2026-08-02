package JavaSwing;
//41 JSpinner

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class JS51JSpinner extends JFrame implements ChangeListener {
    String[] arr = {"January", "February", "March", "April", "May", "JUne",
            "July", "August", "September", "October", "November", "December"};
    JSpinner jSpinner1, jSpinner2, jSpinner3;
    SpinnerModel model1, model2, model3;
    JLabel jLabel = new JLabel();

   public JS51JSpinner(){
       setSize(400, 500);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setBackground(Color.cyan);
       setVisible(true);
       setLocationRelativeTo(null);
       setLayout(null);
       String str = String.valueOf(java.time.Year.now());
       int y = Integer.parseInt(str);
       model1 = new SpinnerNumberModel(1,1,31,1);
       model2 = new SpinnerListModel(arr);
       model3 = new SpinnerNumberModel(y, y - 100, y, 1);
       jSpinner1 = new JSpinner(model1);
       jSpinner2 = new JSpinner(model2);
       jSpinner3 = new JSpinner(model3);
       jSpinner1.setBounds(100, 20, 100, 50);
       jSpinner2.setBounds(100, 100, 100, 50);
       jSpinner3.setBounds(100, 200, 100, 50);
       add(jSpinner1);
       add(jSpinner2);
       add(jSpinner3);
       jSpinner1.addChangeListener(this);
       jSpinner2.addChangeListener(this);
       jSpinner3.addChangeListener(this);

       jLabel.setBounds(100, 300, 150, 20);
       setDOB();
       add(jLabel);



       validate();
    }
    public static void main(String[] args) {
           new JS51JSpinner();
    }

    public void setDOB(){
       int date = (Integer) jSpinner1.getValue();
        int year = (Integer) jSpinner3.getValue();
        String month = (String) jSpinner2.getValue();

        jLabel.setText("DOB is: " + date + "-" + month + "-" + year);

    }

    @Override
    public void stateChanged(ChangeEvent e) {
        //reset dob
        setDOB();
    }
}
