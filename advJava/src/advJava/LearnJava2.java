package advJava;



public class LearnJava2 { // calling method in sout

        public static void main(String[] args) {
            int num1 = 11;
            int answer;
            //answer = multiNumbers(num1);
            System.out.println("The result is: " + multiNumbers(num1));
        }
        public static int multiNumbers(int a){
            int ans = a * 7;
            return ans;
        }

}
