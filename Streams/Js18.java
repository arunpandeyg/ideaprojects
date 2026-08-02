package Streams;
//streams

//findAny() , findFirst()
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Js18 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("One", "Two", "Three", "One");
        Optional<String> ele = stringList.stream().findAny();
        //List<String> stringList = Arrays.asList(); //no such element exception
        System.out.println("findAny: "+ ele);
        System.out.println("findAny: "+ ele.get()); // to get the value of that element

        //findFirst()
        Optional<String> ele1 = stringList.stream().findFirst();
        System.out.println("findFirst: "+ ele1.get());

        //
        //List<String> stringList = Arrays.asList(); //no such element exception because list is blank
       // System.out.println("findFirst: "+ ele.get()); // to get the value of that element



    }
}
