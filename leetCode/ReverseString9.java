package leetCode;
//reverse a string


import java.util.Arrays;
import java.util.Stack;

public class ReverseString9 {


    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(reverseWithStringBuilder(str));
        System.out.println(reverseManually(str));
    }
    private static String reverseWithStringBuilder(String str){
        return new StringBuilder(str).reverse().toString();
    }
    private static String reverseManually(String str){
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}


class ReverseString {
    public static void main(String[] args) {
        String input = "Hello World";
        System.out.println("String: Hello World");
        reverseString(input);
    }
    static void reverseString(String input){
        Stack<Character> stack = new Stack<>();
        System.out.println("Reverse String");
        for (int i = 0; i < input.length(); i++){
            char c = input.charAt(i);   //reade character one by one
            if (c == ' '){               // if space
                while (!stack.isEmpty()){
                    System.out.print(stack.pop()); //pop characters
                }
                System.out.print(" ");              // and print a space
            }
            else {
                stack.push(c);                       // otherwise push characters into stack
            }
        }
        while (!stack.isEmpty()){  //for last word because it has no space

            System.out.print(stack.pop());  // pop last word and print
        }
    }
}