import java.util.Scanner;

public class A {
    public static void main(String[] args) {

        int temperature;
        Scanner sc = new Scanner(System.in);
        int counter =0;
        while(true) {
            counter++;
            System.out.println("enter temperature");
            temperature = sc.nextInt();
            if (temperature >= 35) {
                System.out.println("its hot don't go out today");

            } else {
                System.out.println("it's cool today enjoy");

            }
            if (counter == 3) break;
        }
        sc.close();
    }
}
