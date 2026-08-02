package Practice;


import java.util.*;

public class Shopping {
    private final List<Shop> shopList= new ArrayList<>();

    private  void addShop(Shop shop){

        shopList.add(shop);
    }
    private void showShopList(){
        System.out.println("Purchase Item List: ");

        for (Shop shop : shopList){
            int price = shop.getPrice() * shop.getQuantity();
            System.out.println("Item: " +shop.getItem()+ ", Price: " + price +  ", Quantity: " +shop.getQuantity());
        }
    }

    private void removeShopListByItem(String item){
        shopList.removeIf(shop -> Objects.equals(shop.getItem(), item));
        System.out.println("Purchase item deleted : " +item);
    }
    private void searchShopListByItem(String item){
        for (Shop shop : shopList){
            if (shop.getItem().equals(item)){
                System.out.println("Information for purchase Item: " +shop.getItem());
                System.out.println(shop.getPrice()+ " "+shop.getQuantity());
            }
        }
    }


    private  void showOptions(){
        System.out.println("""

                1, Create new purchase List
                2, Print purchase Item List
                3, Remove purchase item form List
                4, Search purchase item in List
                5, Exit""");
    }
    private Shop takeShopInput(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter item to purchase");
        String item = scan.nextLine();

        System.out.println("Enter purchase item's price");
        int price = scan.nextInt();



        System.out.println("Enter purchase item's Quantity");
        int quantity = scan.nextInt();

        Shop newShop = new Shop(item, price, quantity);

        return newShop;
    }


    public static void main(String[]args){
        Shopping shopping = new Shopping();
        Scanner scan = new Scanner(System.in);
        int option;
        do {
            shopping.showOptions();
            option = scan.nextInt();
            switch (option){
                case 1:
                //create new purchase
                Shop shop = shopping.takeShopInput();
                shopping.addShop(shop);
                break;
                case 2:
                    //print purchase list
                    shopping.showShopList();
                    break;
                case 3:
                    //remove purchase item from list
                    System.out.println("Enter purchase item");
                    String item = scan.nextLine();
                    shopping.removeShopListByItem(item);
                    break;
                case 4:
                    //Search purchase item by name
                    System.out.println("Enter purchase item to search");
                     item = scan.nextLine();
                     shopping.searchShopListByItem(item);
                     break;
                case 5:
                    //Exit
                    System.exit(1);
                    break;
            }

        }while (true); //(option !=5) changed to true.
    }
}
