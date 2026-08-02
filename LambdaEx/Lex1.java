package LambdaEx;
//1
interface Cab{
   String bookCab(String source, String destination);
}


public class Lex1 {
    public static void main(String[] args) {
        Cab cab = (source, destination) -> {
            System.out.println("Ola cab is booked from " + source + "  to  " + destination);
            return ("price: Rs 5000") ;
        };
        System.out.println(cab.bookCab("hyd", "mumbai"));
    }
}





