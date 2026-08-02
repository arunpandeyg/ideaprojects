package Code60;
//Distance between two points, write an application that reads the (x, y) coordinated for two points,
//compute the distance between the two points using a formula./(x2-x1)2+(y2-y1)2


import java.text.DecimalFormat;
import java.util.Scanner;

public class Code604 {     //Distance between two points
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat decForm = new DecimalFormat("0.##");
        double x1;
        double y1;
        double x2;
        double y2 ;
        double distance;

        //input
        System.out.println("Please enter x1 coordinates: ");
        x1 = scan.nextInt();
        System.out.println("Please enter y1 coordinates: ");
        y1 = scan.nextInt();
        System.out.println("Please enter x2 coordinates: ");
        x2 = scan.nextInt();
        System.out.println("Please enter y2 coordinates: ");
        y2 = scan.nextInt();

        scan.close();

        distance = Math.sqrt(Math.pow(x2-x1, 2) + (Math.pow(y2-y1,2)));
        System.out.println("The distance is: "+decForm.format(distance));
    }
}
//.........................................................................
class Dbp{
    public static void main(String[] args) {   //formula based program with sample output
        int x1, x2, y1, y2;
        double dis;
        x1= 1; y1= 1; x2= 4; y2 = 4;
        dis = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.println("Distance between"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+dis);
    }
}

//............................................
class Dbp1{   //taking input through scanner
    public static void main(String[] args) {
        int x1, x2, y1, y2;
        double dis;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1 point");
        x1 = sc.nextInt();
        System.out.println("Enter y1 point");
        y1 = sc.nextInt();
        System.out.println("Enter x2 point");
        x2 = sc.nextInt();
        System.out.println("Enter y2 point");
        y2 = sc.nextInt();
        dis = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.println("Distance between: "+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+dis);
    }
}

//..................................................
class Dbp2 {   //using command line argument  (some problem(out of bound exception))
    public static void main(String[] args) {
        int x1, x2, y1, y2;
        double dis;

       /* Scanner sc = new Scanner(System.in);

        System.out.println("Enter x1 point");
        x1 = sc.nextInt();
        System.out.println("Enter y1 point");
        y1 = sc.nextInt();
        System.out.println("Enter x2 point");
        x2 = sc.nextInt();
        System.out.println("Enter y2 point");
        y2 = sc.nextInt();*/


            x1 = (int) Long.parseLong(args[0]);
            y1 = (int) Long.parseLong(args[1]);
            x2 = (int) Long.parseLong(args[2]);
            y2 = (int) Long.parseLong(args[3]);

            dis = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
            System.out.println("Distance between: " + "(" + x1 + "," + y1 + ")," + "(" + x2 + "," + y2 + ")===>" + dis);
        }
    }


//.................................................

class Dbp3{     //user defined method
    public static void main(String[] args) {
        int x1, x2, y1, y2;
        double dis;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1 point");
        x1 = sc.nextInt();
        System.out.println("Enter y1 point");
        y1 = sc.nextInt();
        System.out.println("Enter x2 point");
        x2 = sc.nextInt();
        System.out.println("Enter y2 point");
        y2 = sc.nextInt();

        dis = Dbp3.calDis(x1 ,y1 ,x2 ,y2);
        System.out.println("Distance between: "+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+dis);


    }
    static double calDis(int x1,int y1 ,int x2 , int y2){

        return (Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)));
    }
}
//.................................................................
class Dbp4{    //creating a separate class.
    double dis;
    Dbp4(int x1,int y1 ,int x2 , int y2){
        dis = (Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)));
    }
    static class DbpA{
        public static void main(String[] args) {
            int x1, x2, y1, y2;

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter x1 point");
            x1 = sc.nextInt();
            System.out.println("Enter y1 point");
            y1 = sc.nextInt();
            System.out.println("Enter x2 point");
            x2 = sc.nextInt();
            System.out.println("Enter y2 point");
            y2 = sc.nextInt();

            Dbp4 cd = new Dbp4(x1 ,y1 ,x2 ,y2);
            System.out.println("Distance between: "+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+cd.dis);

        }
    }

}
//................................

class Dis{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1, x2, y1, y2,x,y;
        double dis;

        System.out.println("Enter x1 point");
        x1 = sc.nextInt();
        System.out.println("Enter y1 point");
        y1 = sc.nextInt();
        System.out.println("Enter x2 point");
        x2 = sc.nextInt();
        System.out.println("Enter y2 point");
        y2 = sc.nextInt();

        x = x2 - x1;
        y = y2 - y1;
        dis = Math.sqrt(x*x + y*y);
        System.out.println("Distance between the points: "+dis);

    }
}
