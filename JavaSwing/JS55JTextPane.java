package JavaSwing;
//52, JTextPane

import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import java.awt.*;


public class JS55JTextPane extends JFrame {
    public JS55JTextPane(){
        JFrame jFrame = new JFrame("JText Pane");
        jFrame.setSize(700, 500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);

        JTextPane jTextPane = new JTextPane();
        jTextPane.setText("Hello,");
        SimpleAttributeSet attributeSet = new SimpleAttributeSet();
        StyleConstants.setBold(attributeSet, true);
        //jTextPane.setCharacterAttributes(attributeSet, true);
        Document document = jTextPane.getStyledDocument();
        try {
            document.insertString(document.getLength(), "Welcome", attributeSet);
            attributeSet = new SimpleAttributeSet();
            StyleConstants.setItalic(attributeSet, true);
            document.insertString(document.getLength(), "This is ", attributeSet);

            attributeSet = new SimpleAttributeSet();
            StyleConstants.setUnderline(attributeSet, true);
            document.insertString(document.getLength(), "Java Swing Text Pane ", attributeSet);

            attributeSet = new SimpleAttributeSet();
            StyleConstants.setForeground(attributeSet, Color.RED);
            StyleConstants.setBackground(attributeSet, Color.ORANGE);
            document.insertString(document.getLength(), "Class ", attributeSet);
        }
        catch (BadLocationException ignored){

        }
        jFrame.getContentPane().add(jTextPane);

        jFrame.revalidate();
    }
    public static void main(String[] args) {
        new JS55JTextPane();
    }
}
