package leetCode;

import java.util.ArrayList;
import java.util.List;

//    {[()()]} t,
//    {[()(){]} f,
//    [{}([]){[]}] t,
//    ([]([{]})) f.

public class BalancedParenthesis17 {
    public static void main(String[] args) {
        boolean result = isBalancedParenthesis("{[()()]}");
        System.out.println("Result: " + result);
        boolean result1 = isBalancedParenthesis("{[()(){]}");
        System.out.println("Result1: " + result1);
    }
    private static boolean isBalancedParenthesis(String paren){
        List<Character> stack = new ArrayList<>();
        for (char c : paren.toCharArray()){
            if (c == '(' || c == '[' || c == '{'){
                stack.add(0, c);
            }
            else {
                if (stack.isEmpty()){
                    return Boolean.FALSE;
                }
                char tempFromStack = stack.get(0);
                if ((c == ')' && tempFromStack == '(')
                    || (c == ']' && tempFromStack == '[')
                    || (c == '}' && tempFromStack == '{')){
                    stack.remove(0);
                }
                else {
                    return Boolean.FALSE;
                }
            }
        }
        if (!stack.isEmpty()){
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }
}
