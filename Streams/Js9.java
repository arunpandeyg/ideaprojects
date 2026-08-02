package Streams;
//stream
//FlatMap

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Js9 {
    public static void main(String[] args) {
    //map
        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,78,9);
        List<Integer> list2 = list1.stream().map(n -> n + 10).collect(Collectors.toList());
        System.out.println(list2);
        //flatMap
        List<Integer> list3 = Arrays.asList(1,2);
        List<Integer> list4 = Arrays.asList(3,4);
        List<Integer> list5 = Arrays.asList(5,6);
        List<Integer> list6 = Arrays.asList(7,8);
        List<List<Integer>>  finallist = Arrays.asList(list3,list4,list5,list6);
        //type 1
        List<Integer> finalresults = finallist.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
        System.out.println(finalresults);
        //type 2 with method reference
        List<Integer> finalresults1 = finallist.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(finalresults1);
    }
}
