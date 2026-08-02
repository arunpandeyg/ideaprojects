package Code60;
//write an that generates a random integer radius 'r' and height 'h' for a cylinder in the
// range 1 to 10, inclusive, and the computes the volume  and surface area of the cylinder.
//A = 2pi r h + 2pi r^2
//V= pi r^2 h

import java.util.Random;

public class Code608 {
    public static void main(String[] args) {
        int r;
        int h;
        double vol;
        double area;

        Random ran = new Random();

        r = ran.nextInt(11) + 1;
        h = ran .nextInt(10)+1;

        vol = Math.PI * Math.pow(r, 2) * h;
        area = (2 * Math.PI * r * h) + (2 * Math.pow(r, 2));

        System.out.println("r = "+  r );
        System.out.println("h = "+ h);
        System.out.println("volume = "+ vol);
        System.out.println("Area = "+ area);



    }
}
