package Dsa;
//Naive approach

class Node5{
    int data;
    Node5 next;
    Node5(int data, Node5 next){
        this.data = data;
        this.next = next;
    }
    Node5(int data){
        this.data = data;
    }
}
public class Dsa3 {
public static void printList(Node5 head){
    Node5 ptr = head;
    while (ptr != null){
        System.out.print(ptr.data + "-->");
        ptr = ptr.next;
    }
    System.out.println("null");
}
public  static Node5 sortedInsert(Node5 head, Node5 newNode5){
    if (head == null || head.data >= newNode5.data){
        newNode5.next = head;
        head = newNode5;
        return head;
    }
    Node5 current = head;
    while (current.next != null && current.next.data < newNode5.data){
        current = current.next;
    }
    newNode5.next = current.next;
    current.next = newNode5;
    return head;
}

    public static void main(String[] args) {
        int[] key = {2,4,6,8};
        Node5 head = null;
        for (int i = key.length - 1; i >= 0; i--){
            head = new Node5(key[i], head);

        }
        head = sortedInsert(head, new Node5(5));
        head = sortedInsert(head, new Node5(9));
        head = sortedInsert(head, new Node5(1));
        printList(head);
    }
}
//using dummy node
class Node6{ // a linked list node
    int data;
    Node6 next;
    Node6(int data, Node6 next){
        this.data = data;
        this.next = next;
    }
    Node6(int data){
        this.data = data;
    }
    Node6(){
    }
}
class Main{
    public static void printList(Node6 head){ //helping method to print a given linked list.
        Node6 ptr = head;
        while (ptr != null){
            System.out.print(ptr.data + "-->");
            ptr = ptr.next;
        }
        System.out.println("null");
    }

    //method to insert a given key node at its correct sorted position into a given linked list
    // sorted in increasing order.
    public static Node6 sortedInsert(Node6 head, Node6 newNode6){
        Node6 dummy = new Node6();
        Node6 current = dummy;
        dummy.next = head;
        while (current.next != null && current.next.data < newNode6.data){
            current = current.next;
        }
        newNode6.next = current.next;
        current.next = newNode6;
        return dummy.next;
    }

    public static void main(String[] args) {
        int[] keys = {2,4,6,8}; //input keys
        Node6 head = null;
        for (int i = keys.length - 1; i >= 0; i--){ //construct a linked list
            head = new Node6(keys[i], head);
        }
        head = sortedInsert(head, new Node6(5));
        head = sortedInsert(head, new Node6(9));
        head = sortedInsert(head, new Node6(1));

        printList(head);  //print linked list after new node addition or inserted
    }
}
//using local reference


