package Dsa;
//identify nth node from last in linked list


public class IdentifyNode {
    static class Node{
        int data;
        Node next;
        Node(int tmp){data = tmp;}
    }
    static Node findNthNodeFromLastV1(Node head, int n){   //first approach
        Node temp = head;
        int length = 0;
        while (temp != null){
            temp = temp.next;
            length++;
        }
        System.out.println("Length: "+ length);
        for (int i = 0; i < length - n; i++){   //if using i = 0 ,length - n, if using i = 1, length - n +1.
            head = head.next;
        }
        return head;
    }

    static Node findNthNodeFromLastV2(Node head, int n){      //second approach
        Node refNode = head;
        Node mainNode = head;
        if (head == null){
            return null;
        }
        int count = 0;
        while (count < n){
            if (refNode == null){
                System.out.println("N value is greater than length of the linked list");
                return null;
            }
            refNode = refNode.next;
            count++;
        }
        while (refNode != null){
            refNode = refNode.next;
            mainNode = mainNode.next;
        }
        return mainNode;
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

        Node finding = findNthNodeFromLastV1(n1, 3);
        System.out.println();
        System.out.println("Linked list from last nth element: " + finding.data);
        Node finding2 = findNthNodeFromLastV2(n1, 3);
        System.out.println();
        System.out.println("Linked list from last nth element: " + finding2.data);

    }
}
