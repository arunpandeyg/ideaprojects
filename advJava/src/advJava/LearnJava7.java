package advJava;



import java.util.Scanner;

public class LearnJava7 {
    public static void main(String[] args) { // average finding

        Scanner scanner = new Scanner(System.in);

        double grade1 = 1.0, grade2 = 1.0,grade3 = 1.0;
        double average = 1.0;

        System.out.println("Enter Grade 1: ");
        grade1 = scanner.nextDouble();

        System.out.println("Enter Grade 2: ");
        grade2 = scanner.nextDouble();

        System.out.println("Enter Grade 3: ");
        grade3 = scanner.nextDouble();
        average = avgGrades(grade1, grade2, grade3);
        System.out.println("\nThe average of these grades is : " +average);

    }
    public static double avgGrades(double a, double b, double c){
        double avg = (a+b+c)/3.0;
        return avg;
    }
}
