package Streams;
//stream reduce() invert the collection and removes comma quot


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Js14 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("A", "B", "C", "1", "2", "3");

        Optional<String> reduced = stringList.stream().reduce((value, combinedValue) -> {
            return combinedValue + value;
        });
        System.out.println("Reduce method: "+ reduced.get());
    }
}
