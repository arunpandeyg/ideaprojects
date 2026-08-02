import java.util.Scanner;

public class Add {

    static int a;
    static int b;
    static int c;

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers ");
        a= sc.nextInt();

        System.out.println("Enter Numbers");
        b= sc.nextInt();

        c= a+b;

        System.out.println("Sum of Numbers = " +c);

        sc.close();
    }


}


class Add1 {
    public static void main(String[] args) {
        System.out.println("jai shri ram ");
        System.out.println("jai jai shri ram ");
    }
}