package advJava;

import java.util.Scanner;

public class Learn {    //Exercise 2nd, if as switch
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 1;
        System.out.println("Please Enter a Season(1=Spring, 2= Summer, 3= Fall, 4= Winter ");
        number = input.nextInt();
        if(number ==1)
            printSpring();
        if(number ==2)
            printSummer();
        if(number ==3)
            printFall();
        if(number ==4)
            printWinter();


    }
    public static void printSpring(){
        System.out.println("The Season is Spring, and flowers are blooming!");
    }
    public static void printSummer(){
        System.out.println("The Season is Summer, and it is getting hot");
    }
    public static void printFall(){
        System.out.println("The Season is Fall, and leaves are Falling");
    }
    public static void printWinter(){
        System.out.println("The Season is Winter, and it is snowing");
    }

}
class MyName{
    public static void main(String[] args) {  //exercise 1st j s o n 1 - 6,
        int arun = 3;
        System.out.println("Program Start. ");
        System.out.println("My first name is Arun.");
        printFirstName();
        printMyLastName();
        addNames();
        System.out.println("Program Ends. ");
        System.out.println("Arun equals. " +arun);
    }
    public static void printFirstName(){
        System.out.println("My first name is Arun.");
        System.out.println("I like ice cream. ");
    }
    public static void printMyLastName(){

         System.out.println("My last Name.Pandey! ");
    }
    public static void addNames(){
        int arun = 4;
        int pandey = 6;
        int sum;
        sum = arun + pandey;
        System.out.println("Sum of name numbers. "+sum);
    }

}
