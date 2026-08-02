package leetCode;

public class RemoveLastNodeLL16 {
    static class Node{
        int data;
        Node next;
        Node(int tmp){data = tmp;}
    }
    static Node removeLastElement(Node head){
        if (head == null || head.next == null){  //case 1
            return null;
        }
        Node temp = head;                         //case 2
        while (temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
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
        Node n2 = new Node(45);
        Node n3 = new Node(56);
        Node n4 = new Node(12);
        Node n5 = new Node(78);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        System.out.println("Linked list: ");
        printList(n1);
        n1 =  removeLastElement(n1);
        System.out.println();
        System.out.println("Linked list after removing last element: ");
        printList(n1);
    }
}