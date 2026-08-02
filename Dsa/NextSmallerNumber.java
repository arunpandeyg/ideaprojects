package Dsa;
//next smaller element


import java.util.Stack;

public class NextSmallerNumber {
    public static void printNextSmallerElement(int[] inputArr){
        Stack<Integer> stack = new Stack<>();
        for (int j : inputArr) {  //enhanced for loop
            if (stack.empty()) {
                stack.push(j);
                continue;
            }
        /*for (int i = 0; i < inputArr.length; i++){   //simple for loop
            if (stack.empty()){
                stack.push(inputArr[i]);
                continue;
            }*/
            while (!stack.empty() && stack.peek() > j) {
                System.out.println(stack.pop() + "-->" + j);
            }
            stack.push(j);
        }
        while (!stack.empty()){
            System.out.println(stack.pop() + "--> -1");
        }
    }


    public static void main(String[] args) {
         int[] arr = {6,4,8,2,1,4,9,5};
         printNextSmallerElement(arr);
    }
}
