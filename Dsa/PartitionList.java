package Dsa;
//partition list

class ListNode2{
    int val;
    ListNode2  Next;
    ListNode2(int val){this.val = val;}

}
public class PartitionList {
    public ListNode2 partition(ListNode2 head, int x){
        ListNode2 lesserHead = new ListNode2(-1);
        ListNode2 greaterHead = new ListNode2(-1);
        ListNode2 before = lesserHead;
        ListNode2 after = greaterHead;
        ListNode2 node = head;
        while (node != null){
            if (node.val < x){
                before.Next = node;
                before = before.Next;
            }
            else {
                after.Next = node;
                after = after.Next;
            }
            node = node.Next;
        }
        after.Next = node;
        before.Next = greaterHead.Next;
        return lesserHead.Next;
    }
    private void printList(ListNode2 head){
        while (head != null){
            System.out.print(head.val + "-->");
            head = head.Next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
           ListNode2 head = new ListNode2(1);
           ListNode2 l1 = new ListNode2(4);
           head.Next = l1;
           ListNode2 l2 = new ListNode2(3);
           l1.Next= l2;
           ListNode2 l3 = new ListNode2(2);
           l2.Next = l3;
           ListNode2 l4 = new ListNode2(5);
           l3.Next = l4;
           ListNode2 l5 = new ListNode2(2);
           l4.Next = l5;
           PartitionList pl = new PartitionList();
           pl.printList(pl.partition(head,3));
    }
}
