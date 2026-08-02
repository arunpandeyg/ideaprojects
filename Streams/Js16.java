package Streams;
//stream
//sorted(), anyMatch(), allMatch(), nonMatch(),

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Js16 {
    public static void main(String[] args) {
        //sorted
        List<Integer> list1 = Arrays.asList(2,4,1,3,7,5,9);
        //ascending
        System.out.println("sorted list");
        List<Integer> sortedList = list1.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);

        System.out.println("reverse sorted list");
        //descending
        List<Integer> reverseSortedList = list1.stream().sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(reverseSortedList);

        System.out.println("sorted list");
        //strings
        List<String> list2 = Arrays.asList("john", "Mary", "Kim", "David", "Smith");
        List<String> sortedList2 = list2.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList2);

        //reverse sorted list
        System.out.println("reverse sorted list");
        List<String> reverseSortedList2 = list2.stream().sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(reverseSortedList2);


    }
}
