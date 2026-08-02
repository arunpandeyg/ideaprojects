package Dsa;
//implement a stack using queues
//push and pop operations


import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();
    private int size = 0;

    //pop operations
   /* public void push(int data) {
        q2.add(data);
        size++;
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public int pop() throws Exception {
        if (q1.isEmpty()) {
            throw new Exception("The stack is empty");
        }
        size--;
        return q1.remove();
    }*/
//push operations
    public void push(int data){
        q1.add(data);
        size++;
    }
    public int pop() throws Exception{
        if (q1.isEmpty()){
            throw new Exception("The stack is empty");
        }
        while (q1.size() != 1){
            q2.add(q1.remove());
        }
        int returnValue = q1.remove();
        size--;
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return returnValue;
    }

    public static void main(String[] args) throws Exception {
        StackUsingQueue sq = new StackUsingQueue();
        sq.push(10);
        sq.push(54);
        sq.push(67);
        sq.push(23);
        sq.push(45);
        System.out.println("Removed elements: " + sq.pop() );
        System.out.println("Removed elements: " + sq.pop() );
        System.out.println("Removed elements: " + sq.pop() );
    }
}