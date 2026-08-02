package Dsa;
//identify loop/circle exists in linked list


import java.util.HashSet;
import java.util.Set;

public class IdentifyLoop {
    static class Node{
        int data;
        Node next;
        Node(int tmp){data = tmp;}
    }
    //hashing technique or approach 2nd 2 pointers approach
    static boolean identifyLoop(Node head){
        Set<Node> hashes = new HashSet<>();
        while (head != null){
            if (hashes.contains(head)){
                return Boolean.TRUE;
            }
            hashes.add(head);
            head = head.next;
        }
        return Boolean.FALSE;
    }
    static boolean identifylup(Node head){
        Node slowMv = head;
        Node fastMv = head;
        while (slowMv != null && fastMv != null && fastMv.next != null){
            slowMv = slowMv.next;
            fastMv = fastMv.next.next;
            if (slowMv == fastMv){
                return Boolean.TRUE;
            }

        }
        return Boolean.FALSE;
    }

    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(45);
        Node n3 = new Node(56);
        Node n4 = new Node(12);
        Node n5 = new Node(78);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        //n5.next = n3; loop exists true
        System.out.println("Does loop exists; " + identifyLoop(n1));
        System.out.println();
        System.out.println("Does loop exists; " + identifylup(n1));;
    }
}
