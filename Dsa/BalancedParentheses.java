package Dsa;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

//check balanced parentheses in an expression
public class BalancedParentheses {
static Map<Character, Character> map = new HashMap<>();

static {
    map.put('(', ')'); //these are expressions to match with
    map.put('[', ']');
    map.put('{', '}');
}
static String validateExpression(String expression){
    if (expression.length() % 2 == 1){                       //expression should be in even numbers , one left one right.
        return " NO";
    }
    Stack<Character> stack = new Stack<>();                  //comparison with left and right for matching balance.
    for (char c : expression.toCharArray()){
        if (map.containsKey(c)){
            stack.push(c);
        }
        else if (stack.isEmpty() || map.get(stack.pop()) != c){   //if it's a matching pair stack.pop()
            return "NO";
        }
    }
    return stack.isEmpty() ? " Yes" : "  NO";         //if stack is empty return yes for balanced expression or no for
                                                      // unbalanced expression stack is not empty.
    }

    public static void main(String[] args) {
        System.out.println(BalancedParentheses.validateExpression("{()}"));
        System.out.println();
        System.out.println(BalancedParentheses.validateExpression("{()}["));
        System.out.println(BalancedParentheses.validateExpression("{((("));
    }
}
