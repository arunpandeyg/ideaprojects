package Parking;


import java.util.ArrayList;

public class ParkingList {
    private ArrayList<String> parkingList = new ArrayList<>();
    public void addParkingItem(String Item){

        parkingList.add(Item);
    }
    public void printParkingList(){
        System.out.println("You have "+parkingList.size() +" " +"Vehicle in Your List");
        for (int i = 0; i < parkingList.size(); i++) {
            System.out.println((i+1)+ " " +parkingList.get(i));

        }
    }
    public void modifyParkingList(int position, String newItem){
        parkingList.set(position, newItem);
        System.out.println("Parking Vehicle " +(position+1) + "has been modified ");
    }
    public void removeParkingItem(int position){
        String theItem = parkingList.get(position);
        parkingList.remove(position);
    }
    public String findItem (String searchItem) {
        int position = parkingList.indexOf(searchItem);
        if(position >=0) {
            return parkingList.get(position);
        }
        return null;
    }

}


