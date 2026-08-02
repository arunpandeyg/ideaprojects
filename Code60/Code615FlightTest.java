package Code60;
//Flight Class, implement a class Flight, declare instances of airlineName, flightNumber, flight'sOrigin,
// and Destination, create constructor that initialize all instances, create getters and setters for each
// instance, test the class using flightTest driver class.

public class Code615FlightTest {
    public static void main(String[] args) {

        Flight flight1, flight2, flight3;

        flight1 = new Flight("Pandey's Airline1: ", "PA1001", "Slovakia", "USA");

        flight2 = new Flight("Pandey's Airline2: ", "PA1002", "Alaska", "Russia");

        flight3 = new Flight("Pandey's Airline3: ", "PA1003", "Hongkong", "Thailand");

        System.out.println(flight1);
        System.out.println();
        System.out.println(flight2);
        System.out.println();
        System.out.println(flight3);
        System.out.println();

        flight1.setFlightNum("PA1005");
        System.out.println(flight1);
        System.out.println();
        System.out.println("Flight1's flight Number:  " +flight1.getFlightNum());

        flight1.setOrigin("USA");
        System.out.println(flight1);
        System.out.println();
        System.out.println("Flight1's flight Number:  " +flight1.getOrigin());

        flight1.setDestin("Israel");
        System.out.println(flight1);
        System.out.println();
        System.out.println("Flight1's flight Number:  " +flight1.getDestin());

        flight1.setAirline("Arun Pandey's:  ");
        System.out.println(flight1);
        System.out.println();
        System.out.println("Flight1's flight Number:  " +flight1.getAirline());

    }

}

class  Flight{
    private  String _airLine;
    private String _flightNumber;
    private String _origin;
    private String _destin;

    //constructor
    public Flight(String airLine,String flightNumber, String origin, String destin){
        _airLine = airLine;
        _flightNumber = flightNumber;
        _origin = origin;
        _destin = destin;
    }

    //getters
    public String getAirline(){return _airLine;}
    public String getFlightNum(){return _flightNumber;}
    public String getOrigin(){return _origin;}
    public String getDestin(){return _destin;}

    //setters
    public  void setAirline(String airline){_airLine = airline;}
    public  void setFlightNum(String flightNum){_flightNumber = flightNum;}
    public void setOrigin(String origin){_origin = origin;}
    public void setDestin(String destin){_destin = destin;}

    public String toString(){
        return "Flight Information\nAirline:  " + getAirline()  + "\nFlight Number: "
                + getFlightNum() + "\nOrigin: " + getOrigin() + "\nDestination:  " + getDestin();
    }

}
