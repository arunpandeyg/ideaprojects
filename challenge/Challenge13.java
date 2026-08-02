package challenge;

import java.util.Scanner;

public class Challenge13 {

    void m1(int a, int b){
        System.out.println("The sum of: "+(a+b));
    }

    public static void main(String[] args) {
        String a = "", b= "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1: ");
        a = sc.nextLine();
        System.out.println("Enter num2: ");
        b = sc.nextLine();

        if (!a.isEmpty()&&!b.isEmpty()){
            int sum = Integer.parseInt(a)+Integer.parseInt(b);
            System.out.println("Sum==>"+sum);
        }else{
            System.out.println("insufficient argument");
        }
    }
}
