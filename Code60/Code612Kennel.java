package Code60;
//Design and implement a class called Dog that contains instance data that represents the dog's
// name and age. Define the Dog constructor to accept and initialise instance data. Include a method
// to compute and return the age of the dog in "person years" (x7). include a toString method that
//returns a one-line description of the dog. Create a driver class called a Kennel, whose main method
// instantiates and updates several Dog objects.

import java.util.Scanner;

public class Code612Kennel {
    public static void main(String[] args) {
        String name;
        int ageyrs;
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the dog's name and age: ");
        name = scan.next();
        ageyrs = scan.nextInt();

        scan.close();

        Dog dog = new Dog(name, ageyrs);
        Dog dog1 = new Dog("kalu", 3);
        Dog dog2 = new Dog("moti", 5);
        Dog dog3 = new Dog("Sheru", 4);


        System.out.println(dog);
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

    }

}
class Dog{
    private final String _name;
   private final int _ageyrs;

   //constructor
    public Dog(String name, int ageyrs) {
        this._name = name;
        this._ageyrs = ageyrs;
    }

    //getter for name
    public  String getName(){
        return  _name;
    }


    //getter for age
    public int getAgeyrs() {
        return _ageyrs;
    }


    //person years age
    public int getPersonYears(){
        return getAgeyrs() * 7;
    }


    //toString
    public String toString(){
        return "The name of the dog is " +getName() +"\nThe dog's age in person's years is "
                + getPersonYears();
    }
}
