package advJava;



import java.util.Scanner;

public class LearnJava6 {

    public static void main(String[] args) {    //finding bigger or larger number
        Scanner sc = new Scanner(System.in);
        int number1 = 1;
        int number2 = 1;
        int largerNum = 1;
        System.out.println("please enter a number between 1 and 100: ");
        number1 = sc.nextInt();
        System.out.println("please enter a number between 1 and 100: ");
        number2 = sc.nextInt();
        largerNum = numberCompare(number1, number2);

        System.out.println("You entered the numbers: " +number1 + " and " +number2);
        System.out.println("The larger number is: " + largerNum);
    }
    public static int numberCompare(int num1, int num2){
        if(num1 >= num2) return num1;
        else return num2;
    }
}
