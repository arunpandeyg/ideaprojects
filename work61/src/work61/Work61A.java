package work61;

import java.util.Scanner;

public class Work61A {  //display character asci-value
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digits: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        char q = (char) a;
        char w = (char)b;
        char e = (char) c;
        char r = (char)d;
        System.out.println();
        System.out.println(a);
        System.out.println("_"+q);
        System.out.println(b);
        System.out.println("_"+w);
        System.out.println(c);
        System.out.println("_"+e);
        System.out.println(d);
        System.out.println("_"+r);

    }
}
