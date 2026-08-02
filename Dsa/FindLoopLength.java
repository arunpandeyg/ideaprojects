package Dsa;
//find the loop length in linked list


public class FindLoopLength {
    static class Node{
        int data;
        Node next;
        Node(int tmp){data = tmp;}
    }
    static int findLoopLength(Node head){
        Node slowMv = head;
        Node fastMv = head;
        while (slowMv != null && fastMv != null && fastMv.next != null){
            slowMv = slowMv.next;
            fastMv = fastMv.next.next;
            if (slowMv == fastMv){
                return countLoopNodes(slowMv);
            }
        }
        return 0;
    }
    static int countLoopNodes(Node loop){
        int count = 1;
        Node temp = loop;
        while (temp.next != loop){
            count++;
            temp = temp.next;
        }
        return count;
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
        n5.next = n3;
        System.out.println("Loop length: " + findLoopLength(n1));
    }
}
