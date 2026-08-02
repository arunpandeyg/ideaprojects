package challenge;

import java.util.Scanner;

public class Challenge2 { //constructor channing
    Challenge2() {
        this(5);
        System.out.println("Hi");
    }

    Challenge2(int x) {
        this(5, 6);
        System.out.println("Hello");
    }

    Challenge2(int x, int y) {
        System.out.println("Bye");
    }

    public static void main(String[] args) {

         new Challenge2();
    }
}
class Temp{
    Temp(){
        this(5);
        System.out.println("Default");
    }
    Temp(int x){
        this(5,10);
        System.out.println("First");
    }
    Temp(int x, int  y){
        int c = x*y;
        System.out.println(c);
        System.out.println("Second");
    }

}
class Main{
    public static void main(String[] args) {
        Temp t = new Temp();
    }
}

class Demo{
    Demo(){
        this(10);
        System.out.println("0 Param constructor is called");
    }
    Demo(int x){
        this(12,15);
        System.out.println("First int param constructor is called ");
    }
    Demo(int x, int y){
        this(10,12.23);
        System.out.println("2 Param constructor is called");
    }
    Demo(int x, double d){
        Scanner sc = new Scanner(System.in);

        System.out.println("2 diff param constructor is called");
        System.out.println("Enter your name");
        String s = sc.nextLine();
        System.out.println(s);

    }

    public static void main(String[] args) {
        Demo d = new Demo();
    }

}






