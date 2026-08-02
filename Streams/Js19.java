package Streams;
//stream
//concatenate streams

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Js19 {
    public static void main(String[] args) {
        List<String> animalsList = Arrays.asList("Dog", "Cat", "Elephant");
        List<String> birdsList = Arrays.asList("peacock", "parrot", "crow");

        Stream<String> stream1 = animalsList.stream();
        Stream<String> stream2 = birdsList.stream();

        List<String> finalList = Stream.concat(stream1,stream2).collect(Collectors.toList());
        for (String item : finalList){
            System.out.print(item+" ");
        }
        //
        System.out.println();
        List<String> finalList1 = Stream.concat(stream1, stream2).toList();
        for (String item : finalList1){
            System.out.print(item +" ");
        }
    }
}
