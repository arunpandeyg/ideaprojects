package challenge;


import java.util.Scanner;

public class Challenge17 {  //super method

    public Challenge17() {
        System.out.println("Super class");
    }
}
class Chall extends Challenge17{
    public Chall(int x) {
        super();
        System.out.println("child class");
        System.out.println(x);
    }
}
class Challe{
    public static void main(String[] args) {
        Chall ch = new Chall(10);

    }
}

//.............................................................................
class Parent{
    int a;

    public Parent(int a) {
        this.a = a;
    }
}
class Child1 extends Parent{
    int b;
    public Child1(int a, int b) {
        super(a);
        this.b = b;
        System.out.println("A = "+a);
        System.out.println("B = "+b);
    }
}
class Ch17{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        Child1 ch = new Child1(a,b);
    }
}

