package Dsa;
//identify middle element in a linked list



public class MiddleElement {
    static class Node{
        int data;
        Node next;
        Node(int tmp){data = tmp;}
    }
    static void middleElement(Node head){  //first approach
        Node tempNode = head;
        int count = 0;
        while (tempNode != null){
            count++;
            tempNode = tempNode.next;
        }
        count = count / 2;
        while (head != null){
            if (count == 0){
                System.out.println(head.data);
                break;
            }
            count--;
            head = head.next;
        }
    }
    static void middleElement1(Node head){ //second approach
        if (head == null){
            System.out.println("The linked list is empty");
        }
            Node tmpSingInc = head;
            Node tmpDoubInc = head;
        while (tmpDoubInc != null && tmpDoubInc.next != null ){
            tmpSingInc = tmpSingInc.next;
            tmpDoubInc = tmpDoubInc.next.next;
        }


           assert tmpSingInc != null;
           System.out.println(tmpSingInc.data);
    }

    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(34);
        Node n3 = new Node(39);
        Node n4 = new Node(29);
        Node n5 = new Node(13);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        middleElement(n1);
        System.out.println();
        middleElement1(n1);
    }
}
