package Parking;


import java.util.ArrayList;

public class ParkingBill {
    ArrayList<String> pvl = new ArrayList<>();

    public void addParkingVehicle(String parkingVehicle){
        pvl.add(parkingVehicle);
    }
    public void printVehicleList(){
        System.out.println("You have" +pvl.size() +" " +"Vehicle in Your List");
        for (int i = 0; i <= pvl.size(); i++) {
            System.out.println((i=1)+" " +pvl.get(i));
        }
    }

}
