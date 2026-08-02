package JavaSwing;
//java swing, creating a simple calculator


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



class MyFrame1 extends JFrame implements ActionListener {

    private final JTextField t1;
    private final JTextField t2;
    private final JButton add, sub, mul, div;
    private final JLabel result;

    MyFrame1(){
        setTitle("Calculator");
        setSize(300, 300);
        // setLocationRelativeTo(null);
        setLocation(100, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);

        JLabel label1 = new JLabel("First Number");
        label1.setBounds(10, 20, 100, 20);
        c.add(label1);

        t1 = new JTextField();
        t1.setBounds(120, 20, 100, 20);
        c.add(t1);

        JLabel label2 = new JLabel("Second Number");
        label2.setBounds(10, 50, 100, 20);
        c.add(label2);

        t2 = new JTextField();
        t2.setBounds(120, 50, 100, 20);
        c.add(t2);
        //addition
        add = new JButton("+");
        add.setBounds(10, 80, 50, 30);
        c.add(add);
        //subtraction
        sub = new JButton("-");
        sub.setBounds(70, 80, 50, 30);
        c.add(sub);
        //multiplication
        mul = new JButton("*");
        mul.setBounds(130, 80, 50, 30);
        c.add(mul);
        //Division
        div = new JButton("/");
        div.setBounds(190, 80, 50, 30);
        c.add(div);

        result = new JLabel("Result");
        result.setBounds(10, 120, 150, 20);
        c.add(result);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);




        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {

            if (e.getSource() == add) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a + b;
                result.setText("result: " + c);
            }
            if (e.getSource() == sub) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a - b;
                result.setText("result: " + c);
            }
            if (e.getSource() == mul) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a * b;
                result.setText("result: " + c);
            }
            if (e.getSource() == div) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a / b;
                result.setText("result: " + c);
            }
        }
        catch (NumberFormatException e1){
            result.setText("Please input integers only");
        }catch (ArithmeticException e2){
            result.setText("Can not divide by Zero 0");
        }
    }

}
public class JS11SimpleCalculator {
    public static void main(String[] args) {
        MyFrame1 frame1 = new MyFrame1();
    }
}