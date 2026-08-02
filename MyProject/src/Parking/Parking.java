package Parking;

import java.util.Scanner;

public class Parking {
    private static  Scanner sc = new Scanner(System.in);
    private static ParkingList parkingList = new ParkingList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice;
        printInstructions();
        while (!quit) {
            System.out.println("Enter Your Choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 0 -> printInstructions();
                case 1 -> parkingList.printParkingList();
                case 2 -> addItem();
                case 3 -> modifyItem();
                case 4 -> removeItem();
                case 5 -> searchForItem();
                case 6 -> quit = true;
            }

        }
    }
    public static void printInstructions(){
        System.out.println("\npress ");
        System.out.println("\t 0 - to print choice options");
        System.out.println("\t 1 - to print the list of Parked Vehicle");
        System.out.println("\t 2 - to add an item to the list");
        System.out.println("\t 3 - to modify a Vehicle in the list");
        System.out.println("\t 4 - to remove a Vehicle from the list");
        System.out.println("\t 5 - to search a Vehicle in the list ");
        System.out.println("\t 6 - to quit the application");
    }
    public static void addItem(){
        System.out.println("Please Enter your Parking Vehicle");
        parkingList.addParkingItem(sc.nextLine());
    }

    public static void modifyItem(){
        System.out.println("Enter Vehicle Number: ");
        int itemNo = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Replacement Vehicle: ");
        String newItem = sc.nextLine();
        parkingList.modifyParkingList(itemNo - 1, newItem);
    }
    public static void removeItem(){
        System.out.println("Enter Vehicle Number: ");
        int itemNo = sc.nextInt();
        sc.nextLine();
        parkingList.removeParkingItem(itemNo - 1);
    }
    public static void searchForItem() {
        System.out.println("Vehicle to search for: ");
        String searchItem = sc.nextLine();

        if (parkingList.findItem(searchItem)  != null){
            System.out.println("Found"+" " + searchItem +" " +" in Vehicle list");
        }
        else{
            System.out.println(searchItem+ " "+ "is not in the Vehicle list");
        }
    }

}


