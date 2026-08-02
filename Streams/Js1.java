package Streams;
//java streams


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Js1 {
    public static void main(String[] args) {
        /*ArrayList<Integer> numbersList = new ArrayList<>();
        numbersList.add(10);
        numbersList.add(20);
        numbersList.add(30);
        numbersList.add(40);
        numbersList.add(50);*/

        List<Integer> numbersList = Arrays.asList(10,15,20,30,40,50);  //finding even numbers
        List<Integer> evenNumbersList = new ArrayList<>();

        //without using streams
       /* for (int n : numbersList){
            if (n % 2 == 0){
                evenNumbersList.add(n);
            }
            System.out.println(evenNumbersList);
        }*/

        //stream concept
      /* evenNumbersList = numbersList.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumbersList); */

        numbersList.stream().filter(n -> n % 2 == 0).forEach(System.out::println); //the sout(n) also can be changed with method reference.
    }
}
