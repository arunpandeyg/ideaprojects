package leetCode;

//implement stack using linked list

public class ImplementStackLL14 { //stack with linked list
    private Node head;
    private static class Node{
        int data;
        Node next; //pointer
    }
    public  void push(int data){
        Node temp = new Node();
        temp.data = data;
        temp.next = head;  //temp node is pointing to head because it was pushed at beginning.
        head = temp;    //now new node that was temp, become head.
    }
    public int pop() throws Exception {
        if (head == null){
            System.err.println("Stack is empty");
            throw new Exception("Stack is empty");
        }
        int returnValue = head.data;
        head = head.next;
        return returnValue;
    }
    public int peek() throws Exception {
        if (head == null){
            System.err.println("Stack is empty");
            throw  new Exception("Stack is empty");
        }
        return head.data;
    }
    public boolean isEmpty(){
        return  head == null;
    }
    public void printStack(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) throws Exception {
        ImplementStackLL14 sll = new ImplementStackLL14();
        try{
            sll.push(29);
            sll.push(34);
            sll.push(98);
            sll.push(23);
            sll.push(46);
            sll.printStack();
            System.out.println("Peek element: " + sll.peek());
            System.out.println("\nDeleted element: "+ sll.pop());
            System.out.println("Deleted element: "+ sll.pop());
            sll.printStack();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
