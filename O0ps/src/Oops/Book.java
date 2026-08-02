package Oops;

import java.util.ArrayList;
import java.util.Scanner;


public class Book {




    public static void main(String[] args) {

        ArrayList<BookA> itemList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("how many items you want to add:");
        int totalItem = sc.nextInt();
        for (int i = 0; i < totalItem; i++) {
            BookA item = new BookA();
            System.out.println("Enter item "+(i+1)+" name");
            String itemName =  sc.next();
            System.out.println("Enter item "+(i+1)+" quantity");
            int quantity = sc.nextInt();
            System.out.println("Enter item "+(i+1)+" price");
            int price = sc.nextInt();

            item.setItem(itemName);
            item.setQuantity(quantity);
            item.setPrice(price);
            item.setCost();

            itemList.add(item);
        }
        System.out.println();
        for (int i = 0; i < itemList.size(); i++) {
           BookA item =  itemList.get(i);

            System.out.println("Name of the Item: " +item.getItem()+" "+item.getQuantity()+" Kg "+item.getPrice() +" Rs " +item.getCost()+" Cost Rupees ");


        }

        System.out.println("Total items with Total Price: "  );






    }
}
