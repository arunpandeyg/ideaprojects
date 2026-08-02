package Streams;
//streams

import java.util.ArrayList;
import java.util.List;

class Product{
    int id;
    String name;
    double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class Js4 {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1,"HP Laptop",95000));
        productList.add(new Product(2,"Del Laptop",85000));
        productList.add(new Product(3,"Lenovo Laptop",45000));
        productList.add(new Product(4,"Sony Laptop",65000));
        productList.add(new Product(5,"Apple Laptop",125000));

        //type1
        System.out.println("Single condition");
        productList.stream().filter(p -> p.price > 50000 )
                .forEach(pr -> System.out.println(pr.price));
        //type 2
        System.out.println("Multi condition");
        productList.stream().filter(p -> p.price > 50000 && p.price < 90000)
                .forEach(pr -> System.out.println(pr.price));
    }
}

