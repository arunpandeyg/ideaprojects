package leetCode;
//track current max element in a stack


import java.util.Stack;

public class MaxElementStack12 {
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
     public int peek(){
        return mainStack.peek();
     }

    public static void main(String[] args) {
        MaxElementStack12 me = new MaxElementStack12();
        me.push(23);
        me.push(29);
        me.push(12);
        me.push(45);
        me.push(35);
        me.push(99);
        me.push(13);
        System.out.println("Max Element of max stack: " + me.max());

        System.out.println("Peek element of main stack: " + me.peek());

        System.out.println("Pop element of main stack: " + me.pop());

        System.out.println("Max Element of max stack: " +me.max());

    }
}
