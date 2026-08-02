package Dsa;
//N - ary tree level order traversal

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node4{
    public  int val;
    public List<Node4> children;
    public Node4(){}
    public Node4(int _val) {val = _val;}

    public  Node4(int _val, List<Node4> _children){
        val = _val;
        children = _children;
    }
}
public class NaryTreeLOT {
    public List<List<Integer>> levelOrder(Node4 root){
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        Queue<Node4> queue = new LinkedList<>();
        queue.add(root);
        while (queue.isEmpty() == false){
            List<Integer> temp = new ArrayList<>();
            int n = queue.size();
            for (int i = 0; i < n; i++){
                Node4 node4 = queue.remove();
                temp.add(node4.val);
            if (node4.children != null) queue.addAll(node4.children);
            }
            result.add(temp);
        }
        return result;
    }

    public static void main(String[] args) {
        Node4 root = new Node4(1);
        List<Node4> rtChlds = new ArrayList<>();
        Node4 n3 = new Node4(3);
        rtChlds.add(n3);
        Node4 n2 = new Node4(2);
        rtChlds.add(n2);
        Node4 n4 = new Node4(4);
        rtChlds.add(n4);
        root.children = rtChlds;
        List<Node4> n3Chlds = new ArrayList<>();
        Node4 n5 = new Node4(5);
        n3Chlds.add(n5);
        Node4 n6 = new Node4(6);
        n3Chlds.add(n6);
        n3.children = n3Chlds;
        NaryTreeLOT nt = new NaryTreeLOT();
        System.out.println(nt.levelOrder(root));



    }
}
