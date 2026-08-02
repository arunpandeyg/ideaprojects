package fajp;

import java.util.Scanner;

//reverse a number
public class FajpReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number  ");

        int num = sc.nextInt();

        //using some algorithm
        /*int rev = 0;
        while (num != 0){
            rev = rev * 10 + num % 10;
            num  = num / 10;
        }*/


        //using StringBuffer class.
        /*StringBuilder sb = new StringBuilder(String.valueOf(num));
       StringBuilder rev = sb.reverse();*/


        //using StringBuilder class
        StringBuilder sb = new StringBuilder();
        sb.append(num);
        StringBuilder rev = sb.reverse();
        System.out.println("Reverse number is:  "+rev);
    }
}
