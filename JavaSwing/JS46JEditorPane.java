package JavaSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//46 JEditorPane
public class JS46JEditorPane extends JFrame {
    JEditorPane jEditorPane;

    public JS46JEditorPane(){
        jEditorPane = new JEditorPane();
        jEditorPane.setContentType("text/html");
        jEditorPane.setText(
                "<html>"
                + "<h1 color='red'>Hello People</h1>"
                + "<p> This is my paragraph</p>"
                + "<hr>"
                + "<ol>"
                + "<li>item1</li>"
                + "<li>item2</li>"
                + "<li>item3</li>"
                + "</ol>"
                + "</html>");
        //jEditorPane.setText("Ariens will have a great time this week. There will be numerous interesting situations where you will emerge victorious among your enemies. Make it a point to understand your aims and achievements in life. Your family members will be guiding you through the right path in life. You need to take care of your parents and keep them happy. Your siblings will require your guidance and support, so try to spend quality time with them this way. Your professional life will be great, and you can take up several new projects. Your seniors will be highly impressed, and they will also present you with a new position at work. Get ready to achieve success in the long run, as this time is perfect for your career. Finances will be stable, and you can invest profitably. The only thing you need to remember right now is the need for savings in your life. The money that you save is never going to cause a disadvantage. Instead, it will be an intelligent step towards a stable life. The third week is going to come with a lot of responsibilities for you. There will be various opportunities for you to shine in life. Utilize each of them in a great way so that you can have a stable and bright future. Spend quality time with your loving family to relax and calm your mind.");

        add(jEditorPane, BorderLayout.CENTER);
        JButton jButton = new JButton("Show Code");
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("" + jEditorPane.getText());
            }
        });
        add(jButton, BorderLayout.PAGE_END);

        setSize(700, 500);
        setTitle("JEditor Pane");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }


    public static void main(String[] args) {
        new JS46JEditorPane();


    }
}
