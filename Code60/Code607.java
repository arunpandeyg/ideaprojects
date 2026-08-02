package Code60;
//Write an app that generates a random integer radius 'r' and hight'h' for a cylinder
// in range 1 to 10, inclusive, and the computes the volume and surface area of the cylinder.
// A = 2pi r h+2pi r^2, v = pi r^2 h,

import java.util.Random;

public class Code607 {
    public static void main(String[] args) {
        int r;
        int h;
        double vol;
        double area;
        Random ran = new Random();
        r = ran.nextInt(10)+1;
        h = ran.nextInt(10)+1;

        vol = Math.PI * Math.pow(r , 2)* h;
        area = (2 * Math.PI * r * h) + (2 * Math.PI * Math.pow(r , 2));
        System.out.println("r = " + r);
        System.out.println("h = "+ h);
        System.out.println("volume = "+ vol);
        System.out.println("Area = "+area);
    }
}
