package Code60;
//Write an app that generates a random integer in the range of 20 to 40 inclusive,
// and display the sine, cosine and tangent of that number.

import java.util.Random;

public class Code606 {
    public static void main(String[] args) {
        double number;
        Random ran = new Random();
        number = ran.nextInt(21) + 20;
        System.out.println("The nuber is: "+ number);
        System.out.println("Sin = "+ Math.sin(number));
        System.out.println("Cos = "+ Math.cos(number));
        System.out.println("Tan = "+ Math.tan(number));
    }
}
