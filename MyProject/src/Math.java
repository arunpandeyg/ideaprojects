import java.util.Scanner;

public class Math {
   int n1, n2, add, sub, multi, div, rem;

    public static void main(String[] args) {
        Math math = new Math ();
        math.input();
        math.process();
        math.output();
    }
    void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Two numbers: ");
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();
    }
    void process(){
        add = n1+n2;
        sub = n1 - n2;
        multi = n1 * n2;
        div = n1 / n2;
        rem = n1 % n2;
    }
    void output(){
        System.out.println("sum of two numbers: " +add);
        System.out.println("sub of two numbers: " +sub);
        System.out.println("multi of two numbers: " +multi);
        System.out.println("div of two numbers: " +div);
        System.out.println("rem of two numbers: " +rem);
    }
}

