package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

//streams
public class Js3 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("cup", null,"forest","sky", "book", null, "theatre");
        //type 1
        List<String> result = words.stream().filter(w -> w != null).collect(Collectors.toList());
        System.out.println(result);
        //type 2
        List<String> result1 = words.stream().filter(Objects::nonNull).toList();
        System.out.println(result);
    }
}
