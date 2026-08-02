

import java.util.Scanner;

public class MyFirstClass {
    public static void main(String[] args) {
        System.out.println("Hello world");
    }
}

class B{
    public static void main(String[] args) {
        int a=10 , b = 20,  c;
        c= a+b;
        System.out.println("Hello Friends: " +c);
    }
}

class c{
    public static void main(String[] args) {
        int a = 10, b = 20, c;
        c = b - a;
        System.out.println("Hello Friends: "  + c);
    }
}
class D{
    public static void main(String[] args) {
        int a = 10, b = 20, c;
        c = b * a;
        System.out.println("Hello Friends: " + c);
    }
}
class E{
    public static void main(String[] args) {
        int a = 10, b = 20, c;
        c = b / a;
        System.out.println("Hello Friends: "  + c);
    }
}
class F{
    public static void main(String[] args) {
        int a = 10, b = 21, c;
        c = b % a;
        System.out.println("Hello Friends: "  + c);
    }
}
class G{
    public static void main(String[] args) {
        int a = 10, b = 20, c;
        ++a;
        c = b - a;
        System.out.println("Hello Friends: "  + c);
    }
}
class H{
    public static void main(String[] args) {
        int a = 10, b = 20, c;
        a++;
        c = b - a;
        System.out.println("Hello Friends: "  + c);
        System.out.println(c);
    }
}
class I{
    public static void main(String[] args) {
        int a = 10, b = 20, c;
        --a;
        c = b - a;
        System.out.println("Hello Friends: "  + c);
        System.out.println(c);
    }
}
class J{
    public static void main(String[] args) {
        int a = 10, b = 20, c;
        a--;
        c = b - a;
        System.out.println("Hello Friends: "  + c);
        System.out.println(c);
    }
}
class K{
    public static void main(String[] args) {
        int a = 10, b = 20;

        if (a == b) {

            System.out.println("Hello Friends " );
        }

        else {
            System.out.println("By By Friends " );
        }
    }
}
class L {
    public static void main(String[] args) {
        int a = 10, b = 20;

        if (a > b) {

            System.out.println("Hello Friends ");
        } else {
            System.out.println("By By Friends ");
        }
    }
}
class M{
    public static void main(String[] args) {
        int a = 10, b = 20;

        if (a < b) {

            System.out.println("Hello Friends ");
        } else {
            System.out.println("By By Friends ");
        }
    }
}
class N {
    public static void main(String[] args) {
        int a = 10, b = 20;

        if (a < b) {

            System.out.println("Hello Friends ");

        }
    }
}
class O {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;
        if (a == b) {
            System.out.println("Hello Friends ");
        } else if (b<a) {
            System.out.println("By By Friends ");
        }
        else if (b>c) {
            System.out.println("By Friends ");
        }
        else {

                System.out.println("Good By Friends ");

        }
    }
}
class P{
    public static void main(String[] args) {
        //int a = 10, b = 20, c = 30;
        int i;
        for ( i=0; i<=20; ++i)
            System.out.println(i);
    }
}
class Q{
    public static void main(String[] args) {


           Scanner sc = new Scanner(System.in);
        System.out.println("enter your choice");
        sc.nextInt();



    }
}