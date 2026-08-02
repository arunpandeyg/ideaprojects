package Streams;
//stream map

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Js5 {
    public static void main(String[] args) {
        List<String> vehicles = Arrays.asList("bus","car", "bicycle", "flight", "train"); //collection
        List<String> vehiclesListInUpperCase = new ArrayList<>();
//with loop
       /* for (String name : vehicles){
           vehiclesListInUpperCase.add(name.toUpperCase());
        }
        System.out.println("Vehicles: "+vehiclesListInUpperCase); */
        //streams map
        //type 1
       vehiclesListInUpperCase = vehicles.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
        System.out.println("Type1 Vehicles: "+vehiclesListInUpperCase);
        //type 2
        vehiclesListInUpperCase = vehicles.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("Type2 Vehicles: "+vehiclesListInUpperCase);
    }
}



