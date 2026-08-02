package challenge;

import java.util.Scanner;

public class Challenge3 { //nested if
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Integer:- ");
        int num = sc.nextInt();

        if (num%2==0){
            if (num<=10){
                System.out.println("Hi");
            }
            if (num>10&&num<=20){
                System.out.println("Hello");
            }
            if (num>20){
                System.out.println("Bye");
            }
        }
        else {
            System.out.println("Hello");
        }

    }
}
