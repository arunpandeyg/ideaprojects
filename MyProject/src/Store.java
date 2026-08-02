
import java.util.Scanner;

public class Store {
    private static  Scanner sc = new Scanner(System.in);
    private static  StoreActionList storeList = new StoreActionList();

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
                case 1 -> storeList.printStoreList();
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
        System.out.println("\t 1 - to print the list of grocery items");
        System.out.println("\t 2 - to add an item to the list");
        System.out.println("\t 3 - to modify an item in the list");
        System.out.println("\t 4 - to remove an item from the list");
        System.out.println("\t 5 - to search an item in the list ");
        System.out.println("\t 6 - to quit the application");
    }
    public static void addItem(){
        System.out.println("Please Enter your Grocery Item");
        storeList.addStoreItem(sc.nextLine());
    }
    public static void modifyItem(){
        System.out.println("Enter Item Number: ");
        int itemNo = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Replacement Item: ");
        String newItem = sc.nextLine();
        storeList.modifyStoreList(itemNo - 1, newItem);
    }
    public static void removeItem(){
        System.out.println("Enter Item Number: ");
        int itemNo = sc.nextInt();
        sc.nextLine();
        storeList.removeStoreItem(itemNo - 1);
    }
    public static void searchForItem() {
        System.out.println("Item to search for: ");
        String searchItem = sc.nextLine();

        if (storeList.findItem(searchItem)  != null){
            System.out.println("Found"+" " + searchItem +" " +" in Item list");
        }
        else{
            System.out.println(searchItem+ " "+ "is not in the Item list");
        }
    }

}











