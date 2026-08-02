package fajp;
//how to generate random numbers and strings'


import java.util.Random;

public class FajpRandom {
    public static void main(String[] args) {
        //approach 1
       /* Random ran = new Random();

        int _ran = ran.nextInt(10);
        System.out.println(_ran+ "  int Random Number")
        ;
        double ran1 = ran.nextDouble();
        System.out.println(ran1 + "  double random number");  */

        //approach2 math class
        System.out.println(Math.random());  //random decimal numbers
        //approach 3 apache commons - lang api, need to be downloaded api zip file
       /* String randNum = RandomStringUtils.randomNumeric(5);
        System.out.println(randNum); */

       /*  String ranStr =  RandomStringUtils.randomAlphabetic(5);
        System.out.println(ranStr); */




    }
}
