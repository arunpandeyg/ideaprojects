package  Practice;


import java.util.Scanner;

public class Season {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = 1;
        System.out.println("Please Enter a Number (1- Spring, 2- for Summer, 3- for Fall, 4- for Winter");
        number = sc.nextInt();


            if (number == 1)
                printSpring();

            if (number == 2)
                printSummer();

            if (number == 3)
                printFall();

            if (number == 4)
                printWinter();


    }
    public static void printSpring(){
        System.out.println("The season is Spring, and flowers are blooming!");
    }
    public static void printSummer(){
        System.out.println("The season is Summer, and it is getting hot!");
    }
    public static void printFall(){
        System.out.println("The season is Fall, and leaves are Falling!");
    }
    public static void printWinter(){
        System.out.println("The season is Winter, and it is Snowing!");
    }

}
