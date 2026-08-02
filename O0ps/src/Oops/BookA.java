package Oops;



public class BookA {
    String item;
    int quantity;
    int price;
    int cost;



    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCost() {
        return cost;
    }

    public void setCost() {

        cost = price * quantity ;
        this.cost = cost;
    }

//    @Override
//    public String toString() {
//        return "Book{" +
//                "item='" + item + '\'' +
//                ", quantity=" + quantity +
//                ", price=" + price +
//                '}';
//    }
}
