package challenge;

public class Challenge15 {    //method overriding, vehicle
    int maxSpeed = 120;
    int speed = 100;
    public void run(){
        System.out.println("Vehicles Maximum speed: " +maxSpeed);
        System.out.println("Vehicle runs with speed: "+speed);
    }

}
class Bike extends Challenge15{
    int millage = 32;
    int speed = 140;
    public void run(){
        System.out.println("Bike runs with speed: "+speed);
        System.out.println("Bike's millage: "+millage);

    }
}
class Challenge15A{
    public static void main(String[] args) {
        System.out.println("In main method");
        Bike bk = new Bike();
        bk.run();

        Challenge15 ch = new Challenge15();
        ch.run();
    }
}

