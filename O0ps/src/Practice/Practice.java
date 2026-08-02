package Practice;


import java.util.Scanner;

public class Practice {
    public static int getSum(int n, int m){
        return n + m;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = sc.nextInt();
        int result = getSum(num1,num2);
        System.out.println("Result: " +result);

    }

}

