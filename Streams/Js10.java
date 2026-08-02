package Streams;
//streams
//flatMap

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Js10 {
    public static void main(String[] args) {
        List<String> teamA = Arrays.asList("Scott", "David", "John");
        List<String> teamB = Arrays.asList("Harry", "Robert", "Milton");
        List<String> teamC = Arrays.asList("Rajes", "Rakesh", "Rohit");

        List<List<String>> playersInWorldCup = new ArrayList<>();
        playersInWorldCup.add(teamA);
        playersInWorldCup.add(teamB);
        playersInWorldCup.add(teamC);

        //before java 8
        for (List<String> team : playersInWorldCup){
           for (String name : team){
               System.out.println(name);
           }
        }
        //with stream flatMap
        //type 1
        List<String> names = playersInWorldCup.stream().flatMap(plist -> plist.stream())
                .collect(Collectors.toList());
        System.out.println(names);
        //type 2 method reference
        List<String> nams = playersInWorldCup.stream().flatMap(Collection::stream)
                .collect(Collectors.toList());
        System.out.println(nams);
    }
}
