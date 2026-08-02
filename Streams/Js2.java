package Streams;
//streams filter multiple conditions


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Js2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Melisande", "Sans", "jon","Deanery", "Jeffery");
        //using streams
        List<String> longnames = new ArrayList<>();
       /*longnames = names.stream().filter(str -> str.length() == 7) //longnames = names.stream().filter(str ->str.length() > 6 && str.length() < 8)
               .collect(Collectors.toList());
        System.out.println(longnames);*/
         //1st type
        names.stream().filter(str -> str.length() > 6 && str.length() < 8).forEach(str -> System.out.println(str));
         //2nd type
        names.stream().filter(str -> str.length() == 7).forEach(System.out::println);
    }
}
