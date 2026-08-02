package Dsa;
//track current max element is a stack

import java.util.Stack;

public class MaxElement {

Stack<Integer> mainStack = new Stack<>();
Stack<Integer> maxStack = new Stack<>();

public void push(int input){
    mainStack.push(input);
    if (maxStack.isEmpty() || input >= maxStack.peek()){
        maxStack.push(input);
    }
    }
    public int pop(){
    int poppedElement = mainStack.pop();
    if (maxStack.peek() == poppedElement){
       maxStack.pop();
    }
    return poppedElement;
    }
    public int max(){
    return maxStack.peek();
    }
    public static void main(String[] args) {
        MaxElement me = new MaxElement();
        me.push(23);
        me.push(29);
        me.push(12);
        System.out.println("Max element: " + me.max());
        me.push(45);
        System.out.println("Max element: " + me.max());
        me.push(33);
        me.push(18);
        System.out.println("popped element: "  + me.pop());
        System.out.println("popped element: " + me.pop());
        System.out.println("Max element: " + me.max());
    }
}
