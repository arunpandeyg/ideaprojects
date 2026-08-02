package Dsa;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String input = "Hello World";
        System.out.println("String: Hello World");
        reverseString(input);
    }
    static void reverseString(String input){
        Stack<Character> stack = new Stack<>();
        System.out.println("Reverse String");
        for (int i = 0; i < input.length(); i++){
            char c = input.charAt(i);
            if (c == ' '){
                while (!stack.isEmpty()){
                    System.out.print(stack.pop());
                }
                System.out.print(" ");
            }
            else {
                stack.push(c);
            }
        }
        while (!stack.isEmpty()){

            System.out.print(stack.pop());
        }
    }
}
