package Dsa;
//odd even linked list

class ListNod{
    int val;
    ListNod next;
    //ListNod() {}
    ListNod(int val) {this.val = val;}
    ListNod(int val, ListNod next) {this.val = val; this.next = next;}
}
public class OddEvenLL {

    public ListNod oddEvenList(ListNod head){
        if (head == null) return null;
        ListNod odd = head;
        ListNod even = head.next;
        ListNod evenStart = even;
        while (even != null && even.next != null){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenStart;
        return head;
    }
    public  void printList(ListNod head){
        while (head != null){
            System.out.print(head.val + "-->");
            head = head.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        ListNod head = new ListNod(1);
        ListNod l1 = new ListNod(2);
        head.next = l1;
        ListNod l2 = new ListNod(3);
        l1.next = l2;
        ListNod l3 = new ListNod(4);
        l2.next = l3;
        ListNod l4 = new ListNod(5);
        l3.next = l4;
        OddEvenLL oel = new OddEvenLL();
        oel.oddEvenList(head);
        oel.printList(head);
    }
}
