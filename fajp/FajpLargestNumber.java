package fajp;
//find largest of 3 numbers.

import java.util.Scanner;

public class FajpLargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println("Enter third number");
        int c = sc.nextInt();

        //approach 1
        if (a > b && a > c){
            System.out.println(a + "  is the largest number");
        }
        else if (b > a && b > c){
            System.out.println(b + "  is the largest number");
        }
        else {
            System.out.println(c + "  is the largest number");
        }
    }
}
//second approach ternary operator
class  LN{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println("Enter third number");
        int c = sc.nextInt();

       //int largest1 =  a > b ? a : b;
     //int largest2 = c > largest1 ? c : largest1;

        //int largest = c > (a > b ? a : b)? c : (a > b ? a : c);
        int largest = c > (Math.max(a, b))? c : (a > b ? a : c);

        //System.out.println(largest2 + "  is the largest number");

        System.out.println(largest + "  is the largest number");
    }
}