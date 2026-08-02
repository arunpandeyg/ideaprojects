package Dsa;
//generate parentheses


import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public List<String> generateParenthesis(int n){
        List<String> result = new ArrayList<>();
        backTrack(result, "", 0, 0, n);
        return result;
    }
    private  void backTrack(List<String> result, String curr, int open, int close, int n){
        if (curr.length() == n * 2){
            result.add(curr);
            return;
        }
        if (open < n) backTrack(result, curr+ "(", open + 1, close, n);
        if (close < open) backTrack(result, curr+ ")", open, close + 1, n);
    }

    public static void main(String[] args) {
        GenerateParentheses gp = new GenerateParentheses();
        System.out.println(gp.generateParenthesis(3));
        System.out.println(gp.generateParenthesis(2));
        System.out.println(gp.generateParenthesis(1));
        System.out.println(gp.generateParenthesis(0));
    }
}
