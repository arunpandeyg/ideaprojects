package Dsa;
//singly linked list



public class Dsa1 {
    private static ListNode head;

    private static class ListNode{
        private final int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
   /* public boolean display(ListNode head){ //for reverse method
        ListNode current = head;
        while (current != null){
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.print("null");
        System.out.println();
        return false;
    }*/
    public void display(){ //for other than reverse method
        ListNode current = head;
        while (current != null){
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.print("null");
        System.out.println();

    }

    public  int length(){
        if (head == null){
            return  0;
        }
        int count = 0;
        ListNode current = head;
        while (current != null){
            count++;
            current = current.next;
        }
        return count;
    }
    public  void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }
    public void insert(int position, int value){
        ListNode node = new ListNode(value);
        if (position == 1){
            node.next = head;
            head = node;
        }
        else {
            ListNode previous = head;
            int count = 1;
            while (count < position - 1){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = node;
            node.next = current;
        }
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
    public ListNode deleteFirst(){
        if (head == null){
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;

    }
    public ListNode deleteLast(){
        if (head == null || head.next == null){
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        while (current.next != null){
            previous = current;
            current = current.next;
        }
        previous.next = null;
        return current;
    }
    public void delete(int position){
        if (position == 1){
            head = head.next;
        }
        else {
            ListNode previous = head;
            int count = 1;
            while (count < position -1){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = current.next;
        }
    }

    public boolean find(ListNode head, int searchKey){
           if (head == null){
               return false;
           }
           ListNode current = head;
           while (current != null){
               if (current.data == searchKey){
                   return true;
               }
               current = current.next;
           }
           return false;
    }
    public ListNode reverse(ListNode head){
        if (head == null){
            return head;
        }
       ListNode current = head;
        ListNode previous = null;
        ListNode next = null;
        while (current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }


    public static void main(String[] args) {
        Dsa1 sll = new Dsa1();
        /*sll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);
        //connect
        sll.head.next = second;
        second.next = third;
        third.next = fourth;
        sll.display();
        System.out.println("\nLength is: " + sll.length());
        sll.insertFirst(11);
        sll.insertFirst(8);
        sll.insertFirst(1);
        sll.insertFirst(10);
        sll.display();
        sll.insertLast(15);
        sll.insertLast(14);
        sll.insertLast(8);
        sll.insertLast(16);
        sll.display();
        sll.insert(1,3);
        sll.insert(2,5);
        sll.insert(1,2);
        sll.insert(2,4);
        sll.insert(5,7);
        sll.display();
        sll.insertFirst(11);
        sll.insertFirst(8);
        sll.insertFirst(1);
        sll.insertFirst(10);
        sll.display();
        System.out.println(sll.deleteFirst().data);
        sll.display();
        sll.insertFirst(11);
        sll.insertFirst(8);
        sll.insertFirst(1);
        sll.insertFirst(10);
        sll.display();
        System.out.println(sll.deleteLast().data);
        sll.display();
        sll.insert(1,11);
        sll.insert(2,8);
        sll.insert(3,1);
        sll.insert(4,10);
        sll.insert(5,15);
        sll.display();
        sll.delete(1);
        sll.display();
        sll.insertLast(15);
        sll.insertLast(14);
        sll.insertLast(8);
        sll.insertLast(16);
        sll.display();
       if (sll.find(head, 1)){
           System.out.println("Search key found");
       }else {
           System.out.println("Search key not found");
       }
        sll.insertLast(15);
        sll.insertLast(14);
        sll.insertLast(8);
        sll.insertLast(16);
        sll.display(head);
        ListNode reverseListHead = sll.reverse(head);
        System.out.println(sll.display(reverseListHead));*/

    }
}
