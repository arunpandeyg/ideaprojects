package Oops;



public class ConsOver {  //constructor overloading
    int a; double b; String c;
    ConsOver(){  //default and private both behav alike that's why only one is allowed
        a = 100; b = 55.65; c = "Jai Shri Ram";

    }
    ConsOver(int x){
        a = x;
    }
    ConsOver(int x, float y){
       a = x; b = y;
    }
    ConsOver(double y, String z){
        b = y;
        c = z;
    }
}
class Conso{
    public static void main(String[] args) {
        ConsOver consover = new ConsOver();
        ConsOver consover1 = new ConsOver(10);

        ConsOver consover2 = new ConsOver(10, 20.21f);
        ConsOver consover3 = new ConsOver(21.22, "Radhe Radhe");

        System.out.println("overLoading: " +consover.a+ ", "+consover.b+", "+consover.c);
        System.out.println("overLoading: " +consover1.a);

        System.out.println("overLoading: "+consover2.a+", "+consover2.b );
        System.out.println("overLoading: " +consover3.b+ ", "+consover3.c);
    }

}
