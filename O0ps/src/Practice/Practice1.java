package Practice;
import java.util.*;
//import java.util.concurrent.BlockingQueue;
//import java.util.concurrent.CompletableFuture;
//import java.util.concurrent.LinkedBlockingQueue;
//import java.util.stream.Stream;

//import static java.util.stream.Collectors.toList;

/**
 * this example show the use of a simple lambda expression in the
 * context of a Java List/ArrayList removeIf() method.
 */

public class Practice1 {
    //entry point into the program.
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));
        //print the count of the item in the stream.
        System.out.println(list);
        //this lambda expression removes the even numbers from the List.
        list.removeIf(i -> i % 2 == 0);
        //print the count of the items in the stream.
        System.out.println(list);
    }

}

