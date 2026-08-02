package JavaSwing;
//48, simple JDialog and nested JDialog
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JS48JDialog implements ActionListener {
    JFrame jFrame;
    JDialog jDialog;
    public JS48JDialog(){
        jFrame = new JFrame();
        jFrame.setTitle("JDialog");
        jFrame.setSize(500, 500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);

        JButton jButton1 = new JButton("Click1");
        jButton1.addActionListener(this);
        jPanel.add(jButton1);



        jFrame.setVisible(true);
    }
    public static void main(String[] args) {
       new JS48JDialog();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Click1")){
            showFirstDialog();
        }
        else if (e.getActionCommand().equals("Click2")){
            showSecondDialog();
        }
        else {
            System.out.println("Invalid Command");
        }

    }
    private void showFirstDialog(){
        jDialog = new JDialog(jFrame, "JDialog1");
        jDialog.setSize(200, 200);
        jDialog.setLocationRelativeTo(null);
        jDialog.setVisible(true);
        jDialog.add(new JLabel("This is First JDialog", SwingConstants.LEADING));
        JPanel jPanel = new JPanel();

        jDialog.add(jPanel);
        JButton jButton = new JButton("Click2");
        jButton.addActionListener(this);
        jPanel.add(jButton);
    }
    private void showSecondDialog(){
        JDialog jDialog1 = new JDialog(jDialog, "JDialog2");
        jDialog1.setSize(200, 200);
        jDialog1.setLocationRelativeTo(null);
        jDialog1.setVisible(true);
        jDialog1.add(new JLabel("This is second JDialog", SwingConstants.CENTER));
    }
}
