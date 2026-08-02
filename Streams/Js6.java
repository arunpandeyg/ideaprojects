package Streams;
//streams map


import java.util.Arrays;
import java.util.List;

public class Js6 {
    public static void main(String[] args) {
        List<String> vehicles = Arrays.asList("bus","car", "bicycle", "flight", "train");
        //finding length putting other collection
        //before java8
        /*for (String name : vehicles){
            System.out.println("Collection: "+name.length());
        } */
        //stream Map
        //type 1
        System.out.println("Stream and map");
        vehicles.stream().map(vname -> vname.length()).forEach(len -> System.out.println(len));
        //type 2
        System.out.println("Method reference");
        vehicles.stream().map(String::length).forEach(System.out::println);
    }
}
