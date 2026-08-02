package Streams;
//Stream
//anyMatch() allMatch() noneMatch()

import java.util.HashSet;
import java.util.Set;

public class Js17 {
    public static void main(String[] args) {
        Set<String> fruites = new HashSet<>();
        fruites.add("One Apple");
        fruites.add("One Mango");
        fruites.add("Two Apples");
        fruites.add("More Grapes");
        fruites.add("Two Guavas");

        //anyMatch
        boolean result = fruites.stream().anyMatch(value -> {return value.startsWith("One");});

        System.out.println("anyMatch: "+ result);

        //allMatch every given value need to match
        boolean result1 = fruites.stream().allMatch(value -> {return value.startsWith("One");});

        System.out.println("allMatch: "+ result1);

        //noneMatch
        boolean result3 = fruites.stream().noneMatch(value -> {return value.startsWith("One");});

        System.out.println("noneMatch: "+ result3);
    }
}
