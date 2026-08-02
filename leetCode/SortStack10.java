package leetCode;
//sort a stack using temporary stack


import java.util.Stack;

public class SortStack10 {
    static Stack<Integer> sortingStack(Stack<Integer> input){
        Stack<Integer> tempStack = new Stack<>();
        while (!input.isEmpty()){   //if input stack is not empty will pop it and
            int temp = input.pop();   //keep value in temp variable
            while (!tempStack.isEmpty() && tempStack.peek() > temp){ //then will check if temp stack is empty? also place
                                                                     // a condition to check that popped element is greater than temp stack's peek value
                input.push(tempStack.pop());  //then pop temp stack and push input stack. or
            }
            tempStack.push(temp);             //push temp value to temp stack
        }
        return tempStack;                     //return sorted temp stack as an output to print
    }
    public static void main(String[] args) {
        Stack<Integer> input = new Stack<>();
        input.push(29);
        input.push(3);
        input.push(564);
        input.push(1);
        input.push(67);
        input.push(89);
        input.push(99);
        System.out.println("Input: " +input);
        System.out.println("Output: " + SortStack10.sortingStack(input));
        System.out.println("Input: " + input);
    }
}
