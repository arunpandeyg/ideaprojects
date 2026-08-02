package leetCode;
//add two numbers represented by linked list


public class AddTwoNumbersLL7 {
    static Node head1, head2;
    static class Node{
        Node next;
        int data;
        Node(int tmp){data = tmp;}
    }
    Node result = null;
    int carry = 0;
    Node tmp = null;
    Node prev = null;

    Node addTwoLists(Node first, Node second){
        while (first != null || second != null){
            int sum = carry + (first == null ? 0 : first.data) + (second == null ? 0 : second.data);
            carry = (sum > 10) ? 1 : 0;
            sum  = sum % 10;
            tmp = new Node(sum);
            if (result == null){
                result = tmp;
            }else {
                prev.next = tmp;
            }
            prev = tmp;
            if (first != null) first = first.next;
            if (second != null) second = second.next;
        }
        if (carry == 1){
            tmp.next = new Node(carry);
        }
      return result;
    }
    void printList(Node node){
        while (node != null){
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        AddTwoNumbersLL7 list = new AddTwoNumbersLL7();
        Node a1 = new Node(7);
        Node a2 = new Node(5);
        Node a3 = new Node(9);
        head1 = a1;
        a1.next = a2;
        a2.next = a3;
        System.out.print("First List: ");
        list.printList(head1);

        Node b1 = new Node(7);
        Node b2 = new Node(0);
        Node b3 = new Node(5);
        head2 = b1;
        b1.next = b2;
        b2.next = b3;
        System.out.print("Second List: ");
        list.printList(head2);

        Node result = list.addTwoLists(head1, head2);
        System.out.print("Resulted list: ");
        list.printList(result);

    }
}
