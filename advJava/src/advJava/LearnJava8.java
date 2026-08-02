package advJava;


import java.util.Scanner;

public class LearnJava8 {                          //calculator from 6 to 13 edu s j
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number:  ");
        int no1 = sc.nextInt();

        System.out.println("Enter Second Number:  ");
        int no2 = sc.nextInt();

        System.out.println("Enter required Operation[+ , -, *, /]: ");
        char operator = sc.next().charAt(0);

        if(operator=='+'|| operator=='-'||operator=='*'||operator=='/') {
        int res = calculate(no1, no2, operator);
        System.out.println(no1 + " " + operator + " " + no2 + " = " + res);
        }
        else {
        System.out.println("Invalid Operators... Please try for +, -, *, /,");
        }
        sc.close();
        }
        static int calculate(int x, int y, char operator) {
        int res = 0;
        switch (operator) {

            case '+':
                res = x + y;
                break;
            case '-':
                res = x - y;
                break;
            case '*':
                res = x * y;
                break;
            case '/':
                res = x / y;
                break;
        }

return res;
    }
}
