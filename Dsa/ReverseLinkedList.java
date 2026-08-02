package Dsa;

public class ReverseLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int tmp){data = tmp;}
    }
    static Node reverse(Node node){
        Node prev = null;
        Node curr = node;
        Node next = null;
        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
         return prev;
    }
    static void printList(Node head){
        while (head != null){
            System.out.print(head.data + "-->");
            head = head.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(15);
        Node n3 = new Node(19);
        Node n4 = new Node(28);
        Node n5 = new Node(45);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        printList(n1);
        Node newHead = reverse(n1);
        System.out.println("\nReversed list: ");
        printList(newHead);
    }
}
