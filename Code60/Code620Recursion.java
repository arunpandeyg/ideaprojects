package Code60;
//Factorial through Recursion


import java.util.Scanner;

public class Code620Recursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the nth value as Integer:  ");
        int n = Integer.parseInt(scanner.nextLine());
        scanner.close();
        System.out.println("Loop calculation: Factorial of:- " + n + ", is:- " + CalculateLoop(n));
        System.out.println("Loop2 calculation: Factorial of:- " + n + ", is:- " + CalculateLoop2(n));

        System.out.println("Recursion calculation: Factorial of:- " + n + ", is:- " + CalculateRecursion(n));
    }

    //factorial through Recursion
    private static int CalculateRecursion(int n){
        if (n == 1)
            return 1;
        return  n * CalculateRecursion(n - 1);
    }

    private static int CalculateLoop2(int n){
        int factorial = n;
        for (int i = 1; i < n; i++){
            factorial *= i;
        }
        return factorial;
    }
    private static int CalculateLoop(int n){
        int factorial = 1;
        for (int i = n; i >= 1; i--){
            factorial *= i;
        }
        return factorial;
    }
}
