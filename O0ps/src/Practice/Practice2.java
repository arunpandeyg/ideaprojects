package Practice;


import java.util.ArrayList;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter your items");
        String item = sc.next();

        System.out.println("enter your price");
        int price = sc.nextInt();

        System.out.println("enter your quantity in Kg");
        int quantity = sc.nextInt();


        int cost = (price * quantity);

        ArrayList<java.io.Serializable> arrayList = new ArrayList<>();
        arrayList.add(0, item);
        arrayList.add(1,price);
        arrayList.add(2, quantity);
        arrayList.add(3, cost);
        System.out.println("print Array List" +arrayList);


        //printBill();


    }


}
