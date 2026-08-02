package JavaSwing;
//49.1, welcome screen using JWindow


import javax.swing.*;
import java.awt.*;


public class JS51JWWelcomeS extends JFrame {
    Timer timer;
    public JS51JWWelcomeS(){
        displayWelcomeScreen();
        setSize(500, 400);
        setTitle("Welcome Screen");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JLabel jLabel = new JLabel("Welcome to Java Swing");
        jLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(jLabel);


        validate();
    }
    public static void main(String[] args) {
        new JS51JWWelcomeS();

    }
    public void displayWelcomeScreen(){
        final JWindow window = new JWindow();
        window.setSize(600, 400);
        window.setLocationRelativeTo(null);
        window.setVisible(true);

        JPanel jPanel = new JPanel();
        window.add(jPanel);

        String imagePath = "C:\\Users\\arunp_7\\OneDrive\\Desktop\\images";
        JLabel label = new JLabel(new ImageIcon(imagePath));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        jPanel.add(label);
        jPanel.setBackground(Color.WHITE);
        jPanel.setBorder(BorderFactory.createLineBorder(Color.ORANGE, 10));

        JProgressBar jProgressBar = new JProgressBar(0, 100);
        jProgressBar.setForeground(Color.CYAN);
        window.add(BorderLayout.NORTH, jProgressBar);
        window.revalidate();
        timer = new Timer(100, e -> {
            int x = jProgressBar.getValue();
            if (x == 100){
                window.dispose();
                JS51JWWelcomeS.this.setVisible(true);
                timer.stop();
            }
            else {
                jProgressBar.setValue(x = 10);
            }
        });
        timer.start();
    }
}
