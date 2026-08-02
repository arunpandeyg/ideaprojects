package Code60;
//logical puzzles game and algorithms

import java.util.Scanner;

//factorial
public class Code619Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the nth value as Integer: ");
        int n = Integer.parseInt(scanner.nextLine());
        scanner.close();
        System.out.println("Loop calculation: Factorial of:- " + n + ", is:- " + CalculateLoop(n));
        System.out.println("Loop2 calculation: Factorial of:- " + n + ", is:- " + CalculateLoop2(n));
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
