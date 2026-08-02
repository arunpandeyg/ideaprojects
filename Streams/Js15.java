package Streams;
//stream toArray()


import java.util.Arrays;
import java.util.List;

public class Js15 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("A", "B", "C", "1", "2", "3");
        //type 1
        Object[] arr = stringList.stream().toArray();
        System.out.println("toArray: "+ arr.length);
        //type 2
        Object[] arr1 = stringList.toArray();
        System.out.println("toArray: "+ arr1.length);


        for (Object v : arr){
            System.out.print(v +" ");
        }
    }
}
