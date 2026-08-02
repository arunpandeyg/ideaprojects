package Streams;
//stream
//distinct() limit() non terminal or processing methods
// count() forEach() terminal method

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Js12 {
    public static void main(String[] args) {
       List<String> vehicleList = Arrays.asList("bus", "car", "bycle", "bus", "car", "car", "bike");

       //distinct(), removes the duplicates , method reference also can be used ::
       List<String> distinctVehicle = vehicleList.stream().distinct().collect(Collectors.toList());
        System.out.println("List of distinct vehicles: "+ distinctVehicle);

        //forEach(),
        //type 1
        vehicleList.stream().distinct().forEach(value -> System.out.println(value));
        //type 2 method reference
        System.out.println("method reference");
        vehicleList.stream().distinct().forEach(System.out::println);

        //count() returns a long number counted.
        long count = vehicleList.stream().distinct().count();
        System.out.println("Count method: " +count);

        //limit(), method reference also can be used
        List<String> limitedVehiclesList = vehicleList.stream().limit(3).collect(Collectors.toList());
        System.out.println("Limited vehicles list: "+limitedVehiclesList);

        //forEach() also can be used and method reference also can be used
        vehicleList.stream().limit(3).forEach(value -> System.out.println(value));

    }
}
