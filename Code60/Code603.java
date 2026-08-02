package Code60;
//Write a program that prompts for and reads the user's first and last name (separately),
// then print a string composed of the first letter of the user's first naame, followed by
//the first five character of the user's name, followed by a random number
//in the range 10 to 99. Assume the last name is at least five letters long.

import java.util.Random;
import java.util.Scanner;

public class Code603 {     // generating final name with first name last name and numbers
    public static void main(String[] args) {
        String firstName;
        String lastName;
        String finalName;
        Random ran = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your first name: ");
        firstName = sc.next();

        System.out.println("Please enter your last name: ");
        lastName = sc.next();

        while (lastName.length() < 5){
            System.out.println("Last name must be at least 5 characters long. Try again: ");
            lastName = sc.next();
        }
        sc.close();
        finalName = firstName.substring(0,1);
        finalName += lastName.substring(0,5);
        finalName += ran.nextInt(99)+ 10;

        System.out.println("Final Name: " +finalName);

    }
}
