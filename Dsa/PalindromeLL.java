package Dsa;
//palindrome linked list


class ListNode1{
    int val;
    ListNode1 next;
    ListNode1(int val) {this.val = val;}

}
public class PalindromeLL {
    public  boolean isPalindrome(ListNode1 head){
        if (head == null || head.next == null) return true;
        ListNode1 slow = head;
        ListNode1 fast = head;
        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = reverseList(slow.next);
        slow = slow.next;
        while (slow != null){
            if (head.val != slow.val) return false;
            slow = slow.next;
            head = head.next;
        }
        return true;
    }

    private ListNode1 reverseList(ListNode1 head){
        ListNode1 prev = null;
        while (head != null){
            ListNode1 temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode1 head = new ListNode1(1);
        ListNode1 l1 = new ListNode1(2);
        head.next = l1;
        ListNode1 l2 = new ListNode1(2);
        l1.next = l2;
        ListNode1 l3 = new ListNode1(1);
        l2.next = l3;

        PalindromeLL pll = new PalindromeLL();
        System.out.println(pll.isPalindrome(head));

    }
}
