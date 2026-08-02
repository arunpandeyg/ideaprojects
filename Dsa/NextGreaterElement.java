package Dsa;
//next greater element


import java.util.Stack;

public class NextGreaterElement{
    public static void printNextGreaterElement(int[] inputArr){
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < inputArr.length; i++){
            if (stack.isEmpty()){
                stack.push(inputArr[i]);
                continue;
            }
            while (stack.isEmpty() == false && stack.peek() < inputArr[i]){ //can be simplified '!stock.isEmpty()'
                System.out.println(stack.pop() + "-->" + inputArr[i]);
            }
            stack.push(inputArr[i]);
        }
        while (stack.isEmpty() == false){
            System.out.println(stack.pop() + "--> -1");
        }
    }

    public static void main(String[] args) {
    int arr[] = {16, 14, 88, 29, 1, 24, 190, 5};
    printNextGreaterElement(arr);
    }
}
