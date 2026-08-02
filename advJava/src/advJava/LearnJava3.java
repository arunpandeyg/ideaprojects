package advJava;



public class LearnJava3 {
    public static void main(String[] args) {
        int num1 = 8;
        int answer;
        answer = multiNumbers(num1);
        System.out.println("When we Multiply num1 by 7 we get: " + answer);
    }
    public static int multiNumbers(int a){
        int ans = a * 7;
        return ans;
    }
}
