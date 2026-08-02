package Dsa;

// how to find middle node
//how to find nth node in a sll
//how to remove duplicates from sorted linked list
//how to insert a node in a sorted singly linked list in java.
//loop in a sll

public class Dsa2 {
    private static ListNode head;

    private static class ListNode{
        private final int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public  void insertAtBeginning(int value){
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    public void printLL() {
        if (head == null){
            System.out.println("null");
        }
        ListNode current = head;
        while (null  != current) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.print("null");

    }
    public ListNode getMiddleNode(){
        if (head == null){
            return  null;
        }
        ListNode slowPtr = head;
        ListNode fastPtr = head;

        while (fastPtr != null && fastPtr.next != null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;
    }
    public ListNode getNthNodeFromEnd(int n){
        if (head == null){
            return  null;
        }
        if (n <= 0){
            throw new IllegalArgumentException("invalid value: n = " + n);
        }
        ListNode mainPtr = head;
        ListNode refPtr = head;
        int count = 0;
        while (count < n){
            if (refPtr == null){
                throw new IllegalArgumentException(n + " is greater than the number of nodes in list");
            }
            refPtr = refPtr.next;
            count++;
        }
        while (refPtr != null){
            refPtr = refPtr.next;
            mainPtr = mainPtr.next;
        }
        return mainPtr;
    }
    public void removeDuplicats(){
        if (head == null){
            return;
        }
        ListNode current = head;
        while (current != null && current.next != null){
            if (current.data == current.next.data){
                current.next = current.next.next;
            }else {
                current = current.next;
            }
        }

    }
   /* public ListNode insertInSortedList(int value){  // it has null pointer exception int temp
        ListNode newNode = new ListNode(value);
        if (head == null ){
            return newNode;
        }

        ListNode current = head;
        ListNode temp = null;
        while (current != null && current.data < newNode.data){
            temp = current;
            current = current.next;


        }

        newNode.next = current;
        temp.next = newNode;
        return head;
    }*/
    //how to remove a given key from sll
    public void deleteNode(int key){
        ListNode current = head;
        ListNode temp = null;
        if (current != null && current.data == key){
            head = current.next;
            return;
        }
        while (current != null && current.data != key){
            temp = current;
            current = current.next;
        }
        if (current == null){
            return;
        }
        temp.next = current.next;
    }
//how to detect a loop in a linked list floyd's cycle
    public  boolean containsLoop(){
        ListNode fastptr = head;
        ListNode slowptr = head;
        while (fastptr != null && fastptr.next != null){
            fastptr = fastptr.next.next;
            slowptr = slowptr.next;
            if (fastptr == slowptr){
                return true;
            }
        }
        return false;
    }
    public  ListNode startNodeInALoop(){
        ListNode fastptr = head;
        ListNode slowptr = head;
        while (fastptr != null && fastptr.next != null){
            fastptr = fastptr.next.next;
            slowptr = slowptr.next;
            if (fastptr == slowptr){
                return getStartingNode(slowptr);
            }
        }
        return null;
    }
    private ListNode getStartingNode(ListNode slowptr){
        ListNode temp = head;
        while (temp != slowptr){
            temp = temp.next;
            slowptr = slowptr.next;
        }
        return temp; //starting node of the loop
    }
    public void   removeLoop(){
        ListNode fastptr = head;
        ListNode slowptr = head;
        while (fastptr != null && fastptr.next != null){
            fastptr = fastptr.next.next;
            slowptr = slowptr.next;
            if (fastptr == slowptr){
                removeLoop(slowptr);
                return;
            }
        }
    }
    private void removeLoop(ListNode slowPtr){
        ListNode temp = head;
        while (temp.next != slowPtr.next){
            temp = temp.next;
            slowPtr = slowPtr.next;
        }
        slowPtr.next = null;
    }

    public void createALoopInLinkedList(){
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode sisth = new ListNode(6);
        head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sisth;
        sisth.next = third;
    }
    //merge two sorted ll



    public static void main(String[] args) {
        Dsa2  sll = new Dsa2();

        /*sll.insertAtBeginning(15);
        sll.insertAtBeginning(17);
        sll.insertAtBeginning(14);
        sll.insertAtBeginning(29);
        sll.insertAtBeginning(19);
        sll.insertAtBeginning(25);
        sll.insertAtBeginning(27);
        sll.printLL();
        ListNode middleNode = sll.getMiddleNode();
        System.out.println("Middle node is: " + middleNode.data);
        sll.insertAtBeginning(15);
        sll.insertAtBeginning(17);
        sll.insertAtBeginning(14);
        sll.insertAtBeginning(29);
        sll.insertAtBeginning(19);
        sll.insertAtBeginning(25);
        sll.insertAtBeginning(27);
        sll.printLL();
        ListNode nthNodefromEnd = sll.getNthNodeFromEnd(2);
        System.out.println("nth node from end is: " +nthNodefromEnd.data);
        sll.insertAtBeginning(1);
        sll.insertAtBeginning(17);
        sll.insertAtBeginning(1);
        sll.insertAtBeginning(29);
        sll.insertAtBeginning(19);
        sll.insertAtBeginning(25);
        sll.insertAtBeginning(25);
        sll.printLL();
        sll.removeDuplicats();
        sll.printLL();
        sll.insertAtBeginning(15);
        sll.insertAtBeginning(17);
        sll.insertAtBeginning(19);
        sll.insertAtBeginning(23);
        sll.insertAtBeginning(24);
        sll.insertAtBeginning(25);
        sll.insertAtBeginning(27);
        sll.printLL();
        sll.insertInSortedList(20);
        sll.printLL();
        sll.insertAtBeginning(15);
        sll.insertAtBeginning(17);
        sll.insertAtBeginning(19);
        sll.insertAtBeginning(23);
        sll.insertAtBeginning(24);
        sll.insertAtBeginning(25);
        sll.insertAtBeginning(27);
        sll.printLL();
        sll.deleteNode(23);
        sll.printLL();
        sll.insertAtBeginning(15);
        sll.insertAtBeginning(17);
        sll.insertAtBeginning(19);
        sll.insertAtBeginning(23);
        sll.insertAtBeginning(24);
        sll.insertAtBeginning(25);
        sll.insertAtBeginning(27);
        sll.printLL();

        sll.printLL();   //loop
        sll.createALoopInLinkedList();
        System.out.println(sll.containsLoop());
        System.out.println(sll.startNodeInALoop().data);


        sll.printLL();
        sll.createALoopInLinkedList();
        System.out.println(sll.containsLoop());
        System.out.println(sll.startNodeInALoop().data);
        sll.removeLoop();
        sll.printLL();*/


    }

}
