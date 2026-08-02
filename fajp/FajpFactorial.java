package fajp;
//factorial of a number
//can use for loop or while loop
//5! = 1*2*3*4*5 = 120

import java.util.Scanner;

public class FajpFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to know the factorial: ");
        int num = sc.nextInt();
        long factorial = 1;


        //ascending order
       /* for (int i = 1; i <= num; i++){
            factorial = factorial * i;
        }
        System.out.println("Factorial of a number is:  " + factorial); */


        //descending  order
        for (int i = num; i >= 1; i--){
            factorial = factorial * i;
        }
        System.out.println("Factorial of a number is:  " + factorial);
    }
}
