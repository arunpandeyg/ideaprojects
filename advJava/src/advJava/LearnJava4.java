package advJava;



public class LearnJava4 {
    public static void main(String[] args) {
        int num1 = 11;
        int num2 = 7;

        int answer1;
        int answer2;
        boolean answer3;
        answer1 = multiNumbers(num1);
        System.out.println("When we Multiply num1 by 7 we get: " + answer1);
        answer2 = addNumbers(num1, num2);
        System.out.println("When we add 2 numbers, we get:" + answer2);
        answer3 = equalNumbers(num1, num2);
        System.out.println("num1 and num2 are equal: " +answer3);
    }
    public static int multiNumbers(int a){  //practicing return
        int ans = a * 7;
        return ans;
    }
    public static int addNumbers(int x, int y){
        int ans = x + y;
        return ans;
    }
    public static boolean equalNumbers(int r, int t){
        if (r == t)return true;

        else return false;
    }
}
