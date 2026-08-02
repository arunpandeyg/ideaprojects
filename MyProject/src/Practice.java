import java.util.Scanner;


public class Practice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Name");
        String name = sc.nextLine();

        System.out.println("Enter Your age");
        int age = sc.nextInt();

        System.out.println("Enter Your Id");
        int id = sc.nextInt();

        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
        System.out.println("id: " +id);
    }

}

class P1{
    public static void Show(){
        int age =20;
        int id = 1;
        System.out.println("Your age = " +age+ "\n" +"Your Id = " +id);
    }
    public static void main(String[] args) {
        P1 p1 = new P1();
        p1.Disp();
        P1.Show();
    }
    void Disp(){

        System.out.println("Rudra Pandey");
    }
}
 class Demo{
    static int a, b, c;
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Demo d = new Demo();
        System.out.println("Enter Your choice: ");


         d.choice();
            d.Add();
            d.sub();
    }



     void choice(){

         System.out.println("enter numbers and press a to Plus ");
         a = sc.nextInt();
         System.out.println("enter second number");
         b = sc.nextInt();
    }
    void Add() {

        c = a + b;
        System.out.println("Sum of given numbers: " +c);

    }
    void sub(){
        c = a - b;
        System.out.println("Subtraction of given numbers: " +c);
    }

}
class Auto{
   static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

    }

}



