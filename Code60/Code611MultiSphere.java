package Code60;
//Design and implement a class called Sphere that contains instance data that represents the sphere's
// diameter, Define the sphere's constructor to accept and initialize the diameter, and include getter
// and setter methods for the diameter. Include methods that calculate and return the volume and
// surface area of the sphere, create a driver and class called MultiSphere, whose main method
// instantiates and updates several Sphere objects.

// Volume = (4/3) * Pi * r(to the power of 3)
// Surface = 4 * Pi * r(to the power of 2)

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Code611MultiSphere {
    public static void main(String[] args) {
        double r;
        DecimalFormat fmt = new DecimalFormat();

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a diameter of a sphere: ");
        r = scan.nextDouble();

        scan.close();

        Sphere sphere = new Sphere(r);

        System.out.println(sphere);
        System.out.println(fmt.format(sphere.getVolume()));
        System.out.println(fmt.format(sphere.getArea()));


    }
}
class Sphere{
    private double _diameter;
    public  Sphere(double diameter){
        _diameter = diameter;
    }
    public double getDiameter(){
        return _diameter;
    }
    public  void setDiameter(int diameter){
        _diameter = diameter;
    }

    public  double getVolume(){
        double v;


        v = (4.00 / 3) * Math.PI * Math.pow(getDiameter(), 3);
        return  v;
    }
    public double getArea(){
        double area;
        area = 4 * Math.PI * Math.pow(getDiameter(), 2);
        return area;
    }
    public String toString(){
        NumberFormat fmt = NumberFormat.getNumberInstance();
        return fmt.format(getDiameter());
    }


}

