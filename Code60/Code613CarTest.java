package Code60;

//Design and implement a class called Car tha contains instance data tha represents the make, model,
// and year of the car. Define the car constructor to initialize the values. Include getter and setter
// methods for all instance data, and a toString method that returns a none line description of the car.
// Create a driver class called CarTest whose main method instantiates and updates several car objects.

import java.util.Scanner;

public class Code613CarTest {
    public static void main(String[] args) {
        boolean quit = false;
        String toQuit;
        String model, make;
        int year = 0;

        Scanner scan = new Scanner(System.in);

        //create empty object
        Car car = new Car(" "," ",0);

        while (!quit){
            System.out.println("Please enter the Car Make, Model and year; ");
            make = scan.next();
            model = scan.next();
            year = scan.nextInt();
            //Car car = new Car(" "," ",0);

            //assign data to object
            car.setMake(make);
            car.setModel(model);
            car.setYear(year);
            scan.nextLine();

            System.out.println("Here's the data you provided: "+ car);
            System.out.println("Pres 'Q' to quit or any key to continue: " );
            toQuit = scan.next();

            if (toQuit.equalsIgnoreCase("Q"))
                quit = true;

        }
        scan.close();
        car.quitScanner();
        System.out.println("Good bye");
    }
}

class Car{

    //private fields
    private  String _model;
    private  String _make;
    private  int _year;

    Scanner scan = new Scanner(System.in);

    //constructor

    public Car(String model, String make, int year) {
        this._model = model;
        this._make = make;
        this._year = year;
    }

     //getters and setters
    public String getModel(String model) {
        return _model;
    }

    public void setModel(String model) {
        this._model = model;
    }

    public String getMake(String make) {
        return _make;
    }

    public void setMake(String make) {
        this._make = make;
    }

    public int getYear(int year) {
        return year;
    }

    public void setYear(int year) {
        //year can't < 1900 or > 2015
        while (year < 1900 || year > 2015){
            System.out.println("Please enter valid year: ");
         year = scan.nextInt();
        }
        this._year = year;
    }
    public void quitScanner(){
        scan.close();
    }
    public String toString(){
        return _make + ", " + ", " +_model+ ", " +Integer.toString(_year);
    }
}

//..........................................
class Code613CarTestA {      //through making object in the loop
    public static void main(String[] args) {
        boolean quit = false;
        String toQuit;
        String model, make;
        int year = 0;

        Scanner scan = new Scanner(System.in);


        while (!quit) {
            System.out.println("Please enter the Car Make, Model and year; ");
            make = scan.next();
            model = scan.next();
            year = scan.nextInt();
            Caar caar= new Caar(model, make, year);


            System.out.println("Here's the data you provided: " + caar);
            System.out.println("Pres 'Q' to quit or any key to continue: ");
            toQuit = scan.next();

            if (toQuit.equalsIgnoreCase("Q"))
                quit = true;

        }
        scan.close();

        System.out.println("Good bye");
    }
}

class Caar{

    //private fields
    private  String _model;
    private  String _make;
    private  int _year;

    Scanner  scan = new Scanner(System.in);

    //constructor

    public Caar(String model, String make, int year) {
        this._model = model;
        this._make = make;
        setYear(year);
    }

    //getters and setters
    public String getModel(String model) {
        return _model;
    }

    public void setModel(String model) {
        this._model = model;
    }

    public String getMake(String make) {
        return _make;
    }

    public void setMake(String make) {
        this._make = make;
    }

    public int getYear(int year) {
        return year;
    }

    public void setYear(int year) {

        while (year < 1900 || year > 2015){
            System.out.println("Please enter valid year: ");
            year = scan.nextInt();
        }
        this._year = year;
    }

    public String toString(){
        return _make + ", " + ", " +_model+ ", " +Integer.toString(_year);
    }
}
