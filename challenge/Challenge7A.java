package challenge;

import java.util.Scanner;

public class Challenge7A {
    public static void main(String[] args) {
        String s = "10";
        String y = "20";
        int num1 = Integer.parseInt(s);
        int num2 = Integer.parseInt(y);
        System.out.println("Sum result is: "+(num1+num2));
    }

}

class Ch7A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        String s1 = sc.nextLine();
        System.out.println("Enter Second number");
        String s2 = sc.nextLine();
        try{
            int a = Integer.parseInt(s1);
            int b = Integer.parseInt(s2);
            int c = a+b;
            System.out.println("Sum is = "+c);
        }
        catch (Exception e){
            System.out.println("Please provide valid Numbers");
        }
    }


}
