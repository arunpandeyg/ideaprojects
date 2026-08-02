package Dsa;
//find the merge point of two linked lists --> merged in one
// this have null pointer exception

public class LLMergePoint {
   static Node head1, head2;
    static class Node {
        Node next;
        int data;
        Node(int tmp) {
            data = tmp;
        }
    }

    int getCount(Node head){  //helper method
        Node curr = head;
        int count = 0;
        while (curr != null){
            count++;
            curr = curr.next;
        }
        return count;
    }
    private Node findMergePoint(int diff, Node head1, Node head2){
        Node curr1 = head1;
        Node curr2 = head2;
        for (int i = 0; i < diff; i++){
            curr1 = curr1.next;
        }
        while (curr1 != null && curr2 != null){
            if (curr1 == curr2){
                return curr1;
            }
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        return null;
    }
    public Node findMergePoint(){
        int count1 = getCount(head1);
        int count2 = getCount(head2);
        if (count1 > count2){
            return findMergePoint(count1 - count2, head1, head2);
        }
        else {
            return findMergePoint(count2 - count1, head2, head1);
        }
    }

    public static void main(String[] args) {
        LLMergePoint llm = new LLMergePoint();
        Node a1 = new Node(38);
        Node a2 = new Node(34);
        Node a3 = new Node(90);
        Node a4 = new Node(22);
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        head1 = a1;

        Node b1 = new Node(987);
        Node b2 = new Node(80);
        Node b3 = new Node(5);
        b3.next = b2;
        b2.next = b3;
        head2 = b1;

        Node c1 = new Node(896);
        Node c2 = new Node(1);
        Node c3 = new Node(54);
        Node c4 = new Node(563);
        Node c5 = new Node(90);
        c1.next = c2;
        c2.next = c3;
        c3.next = c4;
        c4.next = c5;

        a4.next = c1;
        b3.next = c1;

        System.out.println("The merge point Node: " + llm.findMergePoint().data);
    }
}
class FMPLL{
    static  class  Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    public  Node getIntersectionNode(Node head1, Node head2){
        while (head2 != null){
            Node temp = head1;
            while (temp != null){
                if (temp == head2){
                    return head2;
                }
                temp = temp.next;
            }
            head2 = head2.next;
        }
        return null;
    }

    public static void main(String[] args) {
        FMPLL list = new FMPLL();
        Node head1, head2;
        head1 = new Node(10);
        head2 = new Node(3);
        Node newNode = new Node(6);
        head2.next = newNode;
        newNode = new Node(9);
        head2.next.next = newNode;
        newNode = new Node(15);
        head1.next = newNode;
        head2.next.next.next = newNode;
        newNode = new Node(30);
        head1.next.next = newNode;
        head1.next.next.next= null;
        Node interSectionPoint = list.getIntersectionNode(head1, head2);
        if (interSectionPoint == null){
            System.out.print("No Intersection point \n");
        }
        else {
            System.out.print("Intersection Point: " + interSectionPoint.data);
        }
    }
}