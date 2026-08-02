package JavaSwing;
//58, JTree


import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class JS60JTree extends JTree {
    JS60JTree(){
        JFrame jFrame = new JFrame("JTree");
        jFrame.setSize(400, 350);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode("Top");
        DefaultMutableTreeNode a = new DefaultMutableTreeNode("A");
        DefaultMutableTreeNode b = new DefaultMutableTreeNode("B");
        DefaultMutableTreeNode a1 = new DefaultMutableTreeNode("A1");
        DefaultMutableTreeNode a2 = new DefaultMutableTreeNode("A2");
        DefaultMutableTreeNode b1 = new DefaultMutableTreeNode("B1");
        DefaultMutableTreeNode b2 = new DefaultMutableTreeNode("B2");
        DefaultMutableTreeNode b3 = new DefaultMutableTreeNode("B3");
        a.add(a1);
        a.add(a2);

        b.add(b1);
        b.add(b2);
        b.add(b3);

        rootNode.add(a);
        rootNode.add(b);
        JTree jTree = new JTree(rootNode);
        jFrame.add(jTree);
        jFrame.setVisible(true);

    }

    public static void main(String[] args) {
         new JS60JTree();
    }
}
class JT{
    public void jTr(){
        JFrame jFrame = new JFrame("JTree");
        jFrame.setSize(400, 350);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode("Top");
        DefaultMutableTreeNode a = new DefaultMutableTreeNode("A");
        DefaultMutableTreeNode b = new DefaultMutableTreeNode("B");
        DefaultMutableTreeNode a1 = new DefaultMutableTreeNode("A1");
        DefaultMutableTreeNode a2 = new DefaultMutableTreeNode("A2");
        DefaultMutableTreeNode b1 = new DefaultMutableTreeNode("B1");
        DefaultMutableTreeNode b2 = new DefaultMutableTreeNode("B2");
        DefaultMutableTreeNode b3 = new DefaultMutableTreeNode("B3");
        a.add(a1);
        a.add(a2);

        b.add(b1);
        b.add(b2);
        b.add(b3);

        rootNode.add(a);
        rootNode.add(b);
        JTree jTree = new JTree(rootNode);
        jFrame.add(jTree);
        jFrame.setVisible(true);
    }
    public static void main(String[] args) {
        JT jt = new JT();
        jt.jTr();
    }
}
