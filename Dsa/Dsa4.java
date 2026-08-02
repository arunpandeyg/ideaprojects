package Dsa;

public class Dsa4 {
    private static ListNode head;

    private static class ListNode{
        private  final int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void printSLL() {

        while(head != null){
             System.out.print(head.data + "-->");
             head = head.next;
         }
        /*ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }*/
        System.out.print("null");
        System.out.println();
    }
    public void insertLast(int value){
        ListNode newNode = new ListNode(value);
        if (head == null){
            head = newNode;
            return;
        }
        ListNode current = head;
        while (null != current.next){
            current = current.next;
        }
        current.next = newNode;
    }
    public static ListNode merge(ListNode a, ListNode b){
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while (a != null && b != null){
            if (a.data <= b.data){
                tail.next = a;
                a = a.next;
            }
            else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }
        if (a == null){
            tail.next = b;
        }
        else {
            tail.next = b;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        Dsa4  sll1 = new Dsa4();
        sll1.insertLast(1);
        sll1.insertLast(4);
        sll1.insertLast(8);
        sll1.printSLL();

        Dsa4  sll2 = new Dsa4();
        sll2.insertLast(3);
        sll2.insertLast(5);
        sll2.insertLast(8);
        sll2.insertLast(9);
        sll2.insertLast(14);
        sll2.insertLast(18);
        sll2.insertLast(19);
        sll2.printSLL();

        Dsa4  result = new Dsa4();

        head = merge(head, head);
        result.printSLL();
    }
}
