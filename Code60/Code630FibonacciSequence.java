package Code60;
//Fibonacci Sequence 2
public class Code630FibonacciSequence {
    public static void main(String[] args) {

        System.out.println("fibonacci recursive solution with return value");
        System.out.print(0 + " ");
        for (int i = 0; i <= 15; i++){
            System.out.print(RecursiveSolution(i) + " ");
        }
    }
    private static int RecursiveSolution(int n){
        if (n <= 1)
            return 1;
        return RecursiveSolution(n - 2) + RecursiveSolution(n - 1);
    }
}
