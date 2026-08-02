package Dsa;
//Finding Largest Rectangle In Histogram
//

import java.util.Stack;

public class LargestRectangleInHistogram {
    public static int getMaxArea(int[] input){
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int i = 0;
        while (i < input.length){
            if (stack.empty() || input[stack.peek()] <= input[i]){
                stack.push(i++);
                continue;
            }
            int stackTop = stack.pop();
            int areaWithTop = input[stackTop] * (stack.empty() ? i : i - stack.peek() - 1);
            if (maxArea < areaWithTop){
                maxArea = areaWithTop;
            }
        }
        while (!stack.empty()){
            int stackTop = stack.pop();
            int areaWithTop = input[stackTop] * (stack.empty() ? i : i - stack.peek() - 1);
            if (maxArea < areaWithTop){
                maxArea = areaWithTop;
            }
        }
        return maxArea;
    }
    public static void main(String[] args) {
    int[] input = {1, 6, 5, 8, 6, 2};
        System.out.println("Maximum area is: " + getMaxArea(input));
    }
}
