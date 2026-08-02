package advJava;


import java.util.Scanner;

public class LearnJava9 {                        //factorial of a number
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the factorial number: ");
        int num = sc.nextInt();

        LearnJava9 fobj = new LearnJava9();
        int fact = fobj.factorial(num);
        System.out.println("Factorial of:  " + num + " = " + fact);
    }

    int factorial(int n) {
        int fact = 1;
        for (int seq = 2; seq <= n; seq++) {    // sequence also can be started from 1.
            fact *= seq;
        }
        return fact;
    }

}
