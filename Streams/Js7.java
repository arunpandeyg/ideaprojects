package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//streams map
public class Js7 {
    public static void main(String[] args) {
        List<Integer> numbersList = Arrays.asList(2,3,4,5,6,7);
        List<Integer> multiList = new ArrayList<>();
        //before j 8
        /*for (int num : numbersList){
            // System.out.println(num * 3);
            multiList.add(num * 3);
        }
        System.out.println("Multiplied List: "+multiList);*/
        //stream map concept
        /*multiList = numbersList.stream().map(num -> num * 3).collect(Collectors.toList());
        System.out.println(multiList);*/
        //or
        //type 1
        numbersList.stream().map(num -> num * 3).forEach(num ->System.out.println(num));
        //type 2
        numbersList.stream().map(num -> num * 3).forEach(System.out::println);                                                       {

        }
    }
}
