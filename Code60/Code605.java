package Code60;
//Heron's formula,
// write an app that read the lengths of the sides of a triangle from the user. compute the area
//of the triangle using Heron's formula in which 's' represents half of the perimeter of the triangle,
// and 'a' , 'b' , 'c' are the lengths of the three sides of the triangle,
// print area to three decimal places.
//A=/s(s-a)(s-b)(s-c)
//s=a+b+c/2

import java.text.DecimalFormat;
import java.util.Scanner;

public class Code605 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat decform = new DecimalFormat("0.##");

        int a,b,c;
        double area;
        System.out.println("Please enter the three sides of the triangle: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        sc.close();
        double s = (a + b + c) / 2.0d;

        area = Math.sqrt(s * (s - a) * (s-b) * (s - c));
        System.out.println("The area of the triangle using Heron's formula: "+ decform.format(area));
    }

}

//''''''''''''''''''''''''''''''''''
class Aot{
    public static void main(String[] args) {
        double a,b,c, area,s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the three sides of the triangle: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        s =(a + b + c)/2;
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("The area os triangle = " +area);

    }
}

