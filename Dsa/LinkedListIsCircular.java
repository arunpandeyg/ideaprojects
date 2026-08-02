package Dsa;
//identify is linked list is circular or not.


public class LinkedListIsCircular {
    static class Node{
        int data;
        Node next;
        Node(int tmp){data = tmp;}
    }
    static boolean isCircularLinkedList(Node head){
        if(head == null){
            return Boolean.FALSE;
        }
        Node temp = head;
        do {
            temp = temp.next;
        }while (temp != null && temp != head);
        return (temp == head);
    }

    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(10);
        Node n3 = new Node(10);
        Node n4 = new Node(10);
        Node n5 = new Node(10);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;   //false not a circular linked list
        //n5.next = n1; // circular linked list . true
        System.out.println("Is it circular linked list:  \n" + isCircularLinkedList(n1));

    }
}
